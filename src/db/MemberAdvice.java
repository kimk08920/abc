package db;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.aspectj.lang.ProceedingJoinPoint;

public class MemberAdvice {
	public Object logCheck(ProceedingJoinPoint point)throws Throwable{
		
		
		
		String folderName = "c:/temp/";
		File tempFolder = new File(folderName);//������ ������ ���
		if(tempFolder.exists() == false)tempFolder.mkdirs();//���࿡ �ش��ο� ������ �������� ������ ���� ����
		
		String file = folderName+"log.txt"; //������ο� �����̸��� ����
		FileOutputStream fos = null;
		
		
		Object result= point.proceed();
		Calendar now = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� hh:mm:ss");
		String str = sdf.format(now.getTime());
		String methodName = point.getSignature().getName();
		String className = point.getTarget().getClass().getName();
		MemberDao dao = (MemberDao)point.getTarget();
		str += "\nȣ��� �޼ҵ� : "+methodName;
		str += "\nȣ��� Ŭ���� : "+className;
		str += "\nsql : "+dao.getSql()+"\n";
		System.out.println(str); 
		
		try{
			fos = new FileOutputStream(file,true);
			
			fos.write(str.getBytes(), 0, str.getBytes().length);
			fos.close();
		}catch (Exception e) {
		}
		return result;
	}
}