package aop_log;

public class Login implements Log {

	@Override
	public String log(String id) {
		System.out.println("Log in : " + id);
		return null;
	}
	
	

}
