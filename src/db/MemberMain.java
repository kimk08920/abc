package db;

import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MemberMain {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("db/db_context.xml");
		
		MemberVo vo = ctx.getBean("vo",MemberVo.class);
		MemberDao dao = ctx.getBean("dao",MemberDao.class);
		List<MemberVo> list = null;
		dao.insert(vo);
		dao.update(vo);
		dao.delete(vo);
		dao.view(vo); 
		list = dao.select(vo);
		System.out.println("-----------¸®½ºÆ®--------");
		for(int i=0; i<list.size();i++){
			System.out.println(list.get(i).getName());
		}
		
		
		
	}
}