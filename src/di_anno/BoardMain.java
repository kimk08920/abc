package di_anno;

import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardMain {

	static void prn(DBConnect db){
		System.out.println(db.getConn());
	}
	
	public static void  main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("di_anno/anno_context.xml");
		
	/*	BoardDao dao = ctx.getBean("dao", BoardDao.class);
		
		BoardVo v = new BoardVo();
		v.setSerial(101);
		BoardVo vo = dao.view(v);
		
		if (vo != null) {
			System.out.println("serial : " + vo.getSerial());
			System.out.println(vo.getSubject() + ", " + vo.getWorker());
		} else {
			System.out.println("데이터가 없다오");
		}*/
		
		AutoWired au = ctx.getBean("autowire", AutoWired.class);
		                         //new AutoWired();
		System.out.println(au.getUser().getIrum());
	}

}
