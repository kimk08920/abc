package di_step2;

// DI 형태의 구조물이 만들어지지 않은 상태로 서로 다른 환경에서는 코드를 그때그때마다 디버깅해야함
public class DiMain {
	
	// 출력하는 메소드를 따로 만든다
	public static void prn(MyDB db) {
		System.out.println(db.getDB());
	}

	public static void main(String[] arg) {
		// new 만들어서 생성하는 방식을 어셈블러라고 함
		MyDB sql1 = new MySql();
		prn(sql1);
		
		MyDB sql2 = new Oracle();
		prn(sql2);
		
		MyDB sql3 = new MsSql();
		prn(sql3);
		
	}

}
