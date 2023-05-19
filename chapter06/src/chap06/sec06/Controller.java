package chap06.sec06;

public class Controller {

	public static void main(String[] args) {
		new Controller().controller();

	}
	
	public void controller() {
		MemberService memberservice= new MemberService();
		Member member=new Member("홍길동","a001","1234",30); //데이터베이스에 있는 데이터 보관
		boolean result=memberservice.login(member.getId(),member.getPasswd()); //로그인 메소드 호출  db에 있는값 넣음  
		if (result) {    //윗줄 결과값 저장
			System.out.println(member.getId()+"님이 로그인 했습니다");
		}else {
			System.out.println("id나 혹은 password를 잘못입력했습니다");
		}
	}
}
