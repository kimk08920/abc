package aop_xml;

public class RecCalculator implements Calculator {

	@Override
	public long factorial(long num) {
		long start = System.currentTimeMillis();
		
		try {
			if (num == 0) return 1;
			else return num * factorial(num-1);
		} finally {
			long end = System.currentTimeMillis();
			System.out.printf("REC Calculator factorial (%d) ���� �ð� = %d\n", num, (end-start));
		}
	}

}
