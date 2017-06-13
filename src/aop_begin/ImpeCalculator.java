package aop_begin;

public class ImpeCalculator implements Calculator {

	@Override
	public long factorial(long num) {
		long start = System.currentTimeMillis();
		long result = 1;
		
		for (int i = 1; i <= num; i++) {
			result *= 1;
		}
		
		long end = System.currentTimeMillis();
		System.out.printf("IMPE Calculator (%d) 실행 시간 = %d\n", num, (end-start));
		
		return result;
	}
}
