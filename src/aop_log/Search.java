package aop_log;

public class Search implements Log {

	@Override
	public String log(String id) {
		System.out.println("Search : " + id);
		return null;
	}

	
}
