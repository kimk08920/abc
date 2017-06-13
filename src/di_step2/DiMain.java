package di_step2;

// DI ������ �������� ��������� ���� ���·� ���� �ٸ� ȯ�濡���� �ڵ带 �׶��׶����� ������ؾ���
public class DiMain {
	
	// ����ϴ� �޼ҵ带 ���� �����
	public static void prn(MyDB db) {
		System.out.println(db.getDB());
	}

	public static void main(String[] arg) {
		// new ���� �����ϴ� ����� �������� ��
		MyDB sql1 = new MySql();
		prn(sql1);
		
		MyDB sql2 = new Oracle();
		prn(sql2);
		
		MyDB sql3 = new MsSql();
		prn(sql3);
		
	}

}
