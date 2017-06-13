package di_step5;

import org.springframework.context.support.GenericXmlApplicationContext;

//���� ��Ű���Ĵ� ���µǸ� �ȵǴ� �����̱� ������
   //��ü ������ �ܺ� �����⿡ ���ؼ� ������ �� ��ȯ �޵��� ��ġ

public class DiMain {
   
   static void prn(MyDB db){
      System.out.println(db.getDB());
   }
   
   public static void main(String[] args){
      
      GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("di_step5/assembler.xml");
      System.out.println(ctx);
      
      Assembler ass = ctx.getBean("assem", Assembler.class);
      prn(ass.getDb());
   }

      
}