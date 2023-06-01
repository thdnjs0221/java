package service;

import java.util.Map;
import java.util.Scanner;

import dao.LoginDAO;

public class LoginService {//�̱���
	private static LoginService instance;
	private LoginService() {}
	public static LoginService getInstance() {
		if(instance==null) instance=new LoginService();
		return instance;
	}
	Scanner sc=new Scanner(System.in);
	
	public static int loginCount=0;
	LoginDAO dao=LoginDAO.getInstance();
	
	public void login() {
		System.out.println("[[�α���]]");
		
		System.out.print("id �Է�: ");
		String id=sc.nextLine();
		
		System.out.print("��й�ȣ �Է�: ");
		String pw=sc.nextLine(); 
		Map<String, Object>result=dao.login(id, pw);
		loginCount++;
		
		if (result!= null) {
			System.out.println(result.get("MEM_NAME")+"�� �ݰ����ϴ�");
		}else {
			System.out.println("�ٽ� �α��� �ϼ���...");
		}

	}
}
