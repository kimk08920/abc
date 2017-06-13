package di_constructor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DiMain {

	public DiMain() {
		// spring이 제공한 외부 조립기
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("di_constructor/value_context.xml");
		
		// 생성자의 매개변수가 기본형인 클라스
		ValueObject o = ctx.getBean("obj", ValueObject.class);
		
		System.out.println("=====");
		ValueObjectProperty pro = ctx.getBean("obj2", ValueObjectProperty.class);
		
		pro.output();
		
		System.out.println("=====");
		SpringDBConnect sd = ctx.getBean("obj3", SpringDBConnect.class);
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		if (sd.getConn() != null) {
			System.out.println("정상적으로 생성되었따오");
		} else {
			System.out.println("생성이 안되었쏘!!!");
		}	
	}
	
	public static void main(String[] arg) {
		new DiMain();
	}

}
