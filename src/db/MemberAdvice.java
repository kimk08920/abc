package db;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.aspectj.lang.ProceedingJoinPoint;

public class MemberAdvice {
	public Object logCheck(ProceedingJoinPoint point)throws Throwable{
		
		
		
		String folderName = "c:/temp/";
		File tempFolder = new File(folderName);//폴더를 생성할 경로
		if(tempFolder.exists() == false)tempFolder.mkdirs();//만약에 해당경로에 폴더가 존재하지 않으면 폴더 생성
		
		String file = folderName+"log.txt"; //폴더경로와 파일이름을 지정
		FileOutputStream fos = null;
		
		
		Object result= point.proceed();
		Calendar now = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh:mm:ss");
		String str = sdf.format(now.getTime());
		String methodName = point.getSignature().getName();
		String className = point.getTarget().getClass().getName();
		MemberDao dao = (MemberDao)point.getTarget();
		str += "\n호출된 메소드 : "+methodName;
		str += "\n호출된 클래스 : "+className;
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