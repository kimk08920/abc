package aop_anno;

public class Logout implements Log {

	@Override
	public String log(String id) {
		System.out.println("Log out : " + id);
		return null;
	}

}
