package aop_log;

public class Logout implements Log {

	@Override
	public String log(String id) {
		System.out.println("Log out : " + id);
		return null;
	}

}
