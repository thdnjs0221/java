package chap06.sec06;

import java.util.Scanner;

public class MemberService {
	//Member member=new Member("ȫ�浿","a001","1234",30);
	public boolean login(String id,String passwd) { //db�� �ִ°� �Ѱ� ������ ���⿡ ����
		Scanner sc=new Scanner(System.in);
		System.out.println("id: ");
		String pid=sc.nextLine();
		
		System.out.println("password: ");
		String pwd=sc.nextLine();
		
		if(pid.equals(id) && pwd.equals(passwd)) {
			return true;
			
		}else {
			return false;
			
		}
		
		
	}

	public void logout(String id) {
		System.out.println(id+"���� �α׾ƿ� �Ǿ����ϴ�...");
	}
}
