package db;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MemberMain {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("db/db_context.xml");
		MemberDao dao = ctx.getBean("dao", MemberDao.class);
	}
}
