package di_step3;

// ���� ��Ű���Ĵ� 
public class DiMain {
	
	// ����ϴ� �޼ҵ带 ���� �����
	public static void prn(MyDB db) {
		System.out.println(db.getDB());
	}

	public static void main(String[] arg) {
		Assembler asm = new Assembler();
		prn(asm.get());
		
	}

}
