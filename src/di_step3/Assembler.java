package di_step3;
//DI�� �����ϱ� ���� �ܺ� ������
//�ܺο��� ��ü�� ������ �� ��ȯ �ϴ� ����
public class Assembler {
   public MyDB get(){
      return new Oracle();
      
   }
}