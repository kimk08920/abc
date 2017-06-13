package aop_log;

import org.springframework.context.support.GenericXmlApplicationContext;

public class AopMain {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("aop_log/aopPojo.xml");
		Log log = ctx.getBean("logout", Log.class);
		log.log("SSSSSSS");
	}

}
