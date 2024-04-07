package bkit.java18.aspects;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/*

Khai báo 1 aspect(advice), đoạn code(chức năng) sẽ được thực thi sau 1/N join point nào đó

Để biết được aspect thực thi chi join point nào --> thông qua cấu hình xml/annotation

--> Khi gọi hàm(joinpoint) nào đó --> gọi hàm 'afterReturning' sau khi gọi join point

*/

public class MovieTrackerAfterMethod implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnedValue, Method method, Object[] parameters, Object target) throws Throwable {
		System.out.println(">>> +++ ___ MovieTrackerBeforeMethod#afterReturning ___ +++ <<<");
	}
	
}
