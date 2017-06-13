package spring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import spring.AlreadyExistingMemberException;
import spring.ChangePasswordService;
import spring.IdPasswordNotMatchingException;
import spring.MemberNotFoundException;
import spring.MemberRegisterService;
import spring.RegisterRequest;
import spring.Assembler;

public class MainForAssembler {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("��ɾ �Է��Ͼ���");
			String command = reader.readLine();
			if(command.equalsIgnoreCase("exit")) {
				System.out.println("�����Ѵٿ�");
				break;
			}
			if(command.startsWith("new")) {
				processNewCommand(command.split(" "));
				continue;
			} else if(command.startsWith("change")) {
				processChangeCommand(command.split(" "));
				continue;
			}
			printHelp();
		}
	}
	
	private static Assembler assembler = new Assembler();
	
	private static void processNewCommand(String[] arg) {
		if (arg.length != 5) {
			printHelp();
			return;
		}
		MemberRegisterService regSvc = assembler.getMemberRegisterService();
		RegisterRequest req = new RegisterRequest();
		req.setEmail(arg[1]);
		req.setName(arg[2]);
		req.setPassword(arg[3]);
		req.setConfirmPassword(arg[4]);
		
		if (!req.isPasswordEqualToConfirmPassword()) {
			System.out.println("��ȣ�� Ʋ�ȴٿ�\n");
			return;
		}
		try {
			regSvc.regist(req);
			System.out.println("����ߴٿ�\n");
		} catch (Exception ex) {
			System.out.println("�̹� �����ϴ� �����̶��\n");
		}
	}
	
	private static void processChangeCommand(String[] arg) {
		if (arg.length != 4) {
			printHelp();
			return;
		}
		ChangePasswordService changePwdSvc = assembler.getChangePasswordService();
		
		try {
			changePwdSvc.changePassword(arg[1], arg[2], arg[3]);
			System.out.println("��ȣ�� �ٲپ��ٿ�\n");
		} catch (MemberNotFoundException ex) {
			System.out.println("������ �������� �ʴ´ٿ�\n");
		} catch (IdPasswordNotMatchingException ex) {
			System.out.println("���ϰ� ��ȣ�� ��ġ���� �ʴ´ٿ�\n");
		}
	}
	
	private static void printHelp() {
		System.out.println();
		System.out.println("�߸��� ����̶��! �Ʒ� ��ɾ� ������ Ȯ���϶��");
		System.out.println("��ɾ� ����");
		System.out.println("new �̸��� �̸� ��ȣ ��ȣȮ��");
		System.out.println("change �̸��� ������ ������");
		System.out.println();
	}
	
}
