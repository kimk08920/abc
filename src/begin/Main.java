package begin;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] arg) {
		// �������� ȯ�� ���� ������ app_context.xml�� ��������ν� ���� �ǹ̷� ó���� 
		/* Greeter g = new Greeter();
		g.setFormat("%s, HiHi!");*/
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("begin/app_context.xml");
		Greeter g = ctx.getBean("greeter", Greeter.class);
		
		String temp = g.greet("spring");
		System.out.println(temp);
	}

}
