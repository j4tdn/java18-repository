package bkit.java18.aspects;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/*
 
 Khai báo 1 aspect(advice), đoạn code(chức năng) sẽ được thực thi trước 1/N join point nào đó
 
 Để biết được aspect thực thi chi join point nào --> thông qua cấu hình xml/annotation
 
 --> Khi gọi hàm(joinpoint) nào đó --> gọi hàm 'before' trước khi gọi join point
 */

public class MovieTrackerBeforeMethod implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] parameters, Object target) throws Throwable {
		// lúc runtime thông qua
		// method: biết được AspectBefore này sẽ được thực thi cho method nào
		// parameters: tham số của method
		// target: ....
		System.out.println(">>> +++ ___ MovieTrackerBeforeMethod#before ___ +++ <<<");
	}
	
	
	
}
