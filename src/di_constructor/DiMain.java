package di_constructor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DiMain {

	public DiMain() {
		// spring�� ������ �ܺ� ������
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("di_constructor/value_context.xml");
		
		// �������� �Ű������� �⺻���� Ŭ��
		ValueObject o = ctx.getBean("obj", ValueObject.class);
		
		System.out.println("=====");
		ValueObjectProperty pro = ctx.getBean("obj2", ValueObjectProperty.class);
		
		pro.output();
		
		System.out.println("=====");
		SpringDBConnect sd = ctx.getBean("obj3", SpringDBConnect.class);
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		if (sd.getConn() != null) {
			System.out.println("���������� �����Ǿ�����");
		} else {
			System.out.println("������ �ȵǾ���!!!");
		}	
	}
	
	public static void main(String[] arg) {
		new DiMain();
	}

}
