package di_step1;

// DI ������ �������� ��������� ���� ���·� ���� �ٸ� ȯ�濡���� �ڵ带 �׶��׶����� ������ؾ���
public class DiMain {

	public static void main(String[] arg) {
		MySql sql = new MySql();
		String db = sql.getAgent();
		System.out.println(db);
		
		Oracle sql2 = new Oracle();
		String db2 = sql2.getName();
		System.out.println(db2);
		
		MsSql sql3 = new MsSql();
		String db3 = sql3.getVender();
		System.out.println(db3);
	}

}
