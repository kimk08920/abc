package di_step5;
//DI�� �����ϱ� ���� �ܺ� ������
//�ܺο��� ��ü�� ������ �� ��ȯ �ϴ� ����
public class Assembler {
   public MyDB db;
   
   public Assembler(MyDB db){
      this.db = db;
   }
   
   public MyDB getDb(){
      return db;
   }
}