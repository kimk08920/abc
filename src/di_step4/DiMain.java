package di_step4;

import org.springframework.context.support.GenericXmlApplicationContext;

// 내부 아키텍쳐는 
public class DiMain {
	
	// 출력하는 메소드를 따로 만든다
	public static void prn(MyDB db) {
		System.out.println(db.getDB());
	}

	public static void main(String[] arg) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("di_step4/assembler.xml");
		
		MyDB db = ctx.getBean("db", Oracle.class);
		prn(db);
	}

}
