/*controller(시작)=>로그인서비스 클래스 (id,pw입력)호출-> dao클래스 호출 id와 pw이용하여 필요한
 *쿼리 선택->jdbcutil  실행! 결과는 dao클래스로 반환 dao클래스는 로그인서비스로 반환*/
package controller;

import service.LoginService;

public class Controller {

	public static void main(String[] args) {
		new Controller().init();
	}
	
	public void init() {
		LoginService loginService=LoginService.getInstance();
		loginService.login();
	}
}


