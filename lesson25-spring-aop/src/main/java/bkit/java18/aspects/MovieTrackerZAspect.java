package bkit.java18.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/*
 @Aspect = Advisor
 
 --> Khai báo 1/N Advisor(Advice, PointCut)
 --> Được scan thông qua @EnableAspectJAutoProxy
 
 */

@Aspect
public class MovieTrackerZAspect {
	
	@Pointcut("execution(* addMovie(..))")
	public void endsWithMoviePointCut() {}
	
	
	@Before("endsWithMoviePointCut()")
	public void movieAdviceBeforeAddMovie() {
		System.out.println(">>> +++ ___ MovieTrackerZAspect#movieAdviceBeforeAddMovie ___ +++ >>> ");
	}
	
	@After("endsWithMoviePointCut()")
	public void movieAdviceAfterAddMovie() {
		System.out.println(">>> +++ ___ MovieTrackerZAspect#movieAdviceAfterAddMovie ___ +++ >>> ");
	}
	
}
