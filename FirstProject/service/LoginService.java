package service;

import java.util.Map;
import java.util.Scanner;

import dao.LoginDAO;

public class LoginService {
	private static LoginService instance;

	private LoginService() {
	}

	public static LoginService getInstance() {
		if (instance == null)
			instance = new LoginService();
		return instance;
	}

	Scanner sc = new Scanner(System.in);

	public static int loginCount = 0;
	LoginDAO dao = LoginDAO.getInstance();
	Map<String, Object> result=null;
	
	public void login() {
		System.out.println("[[ 로그인 ]]");
		while (true) {
			System.out.print("id 입력 : ");
			String id = sc.nextLine();

			System.out.print("비밀번호 입력 : ");
			String pw = sc.nextLine();
			result = dao.login(id, pw);
			loginCount++;
			if(loginCount>2) break;
			if (result != null) {
				System.out.println(result.get("MEM_NAME") + "님 반갑습니다.");
				break;
			} else {
				System.out.println("다시로그인 하세요...");
			}
		}				
	}
	public Map<String, Object> isDuplicate(String id) {
		result=dao.select(id); //쿼리 선택하기 위해 select호출
		return result;
	}
}
