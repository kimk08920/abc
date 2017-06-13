package di_step3;

// 내부 아키텍쳐는 
public class DiMain {
	
	// 출력하는 메소드를 따로 만든다
	public static void prn(MyDB db) {
		System.out.println(db.getDB());
	}

	public static void main(String[] arg) {
		Assembler asm = new Assembler();
		prn(asm.get());
		
	}

}
