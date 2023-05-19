package chap06.sec06;

import java.util.Scanner;

public class MemberService {
	//Member member=new Member("홍길동","a001","1234",30);
	public boolean login(String id,String passwd) { //db에 있는거 넘겨 받은거 여기에 있음
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
		System.out.println(id+"님이 로그아웃 되었습니다...");
	}
}
