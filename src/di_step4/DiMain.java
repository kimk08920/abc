package di_step4;

import org.springframework.context.support.GenericXmlApplicationContext;

// ���� ��Ű���Ĵ� 
public class DiMain {
	
	// ����ϴ� �޼ҵ带 ���� �����
	public static void prn(MyDB db) {
		System.out.println(db.getDB());
	}

	public static void main(String[] arg) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("di_step4/assembler.xml");
		
		MyDB db = ctx.getBean("db", Oracle.class);
		prn(db);
	}

}
