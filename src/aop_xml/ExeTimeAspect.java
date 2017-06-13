package aop_xml;

import java.util.Arrays;

import org.aspectj.lang.Signature;
import org.aspectj.lang.ProceedingJoinPoint;

public class ExeTimeAspect {

	public Object measure(ProceedingJoinPoint joinPoint) throws Throwable {
		long start = System.nanoTime();
		
		try {
			Object result = joinPoint.proceed();
			return result;
		} finally {
			long finish = System.nanoTime();
			Signature sig = joinPoint.getSignature();
			System.out.printf("%s.%s(%s) ���� �ð� : %d ns\n", 
					joinPoint.getTarget().getClass().getSimpleName(), 
					sig.getName(), Arrays.toString(joinPoint.getArgs()), (finish-start));
		}
	}

}
