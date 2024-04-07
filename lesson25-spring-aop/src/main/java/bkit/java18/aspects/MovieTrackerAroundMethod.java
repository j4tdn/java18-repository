package bkit.java18.aspects;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/*

Khai báo 1 aspect(advice), đoạn code(chức năng) sẽ được thực thi khi gọi 1/N join point nào đó

Để biết được aspect thực thi chi join point nào --> thông qua cấu hình xml/annotation

--> Khi gọi hàm(joinpoint) nào đó --> tự động gọi đến hàm 'invoke' 

--> trong hàm invoke thêm đoạn code thực thi trước(before advice), sau(after returning advice) cái join point

*/

public class MovieTrackerAroundMethod implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println(">>> +++ ___ MovieTrackerBeforeMethod#invoke ___ +++ <<<");
		
		System.out.println(">>> +++ ___ Thực thi Join Point ___ +++ <<<");
		
		Object val = invocation.proceed();
		
		System.out.println(">>> +++ ___ val = " + val);
		
		return val;
	}

}
