package chap06.sec06;

public class Controller {

	public static void main(String[] args) {
		new Controller().controller();

	}
	
	public void controller() {
		MemberService memberservice= new MemberService();
		Member member=new Member("ȫ�浿","a001","1234",30); //�����ͺ��̽��� �ִ� ������ ����
		boolean result=memberservice.login(member.getId(),member.getPasswd()); //�α��� �޼ҵ� ȣ��  db�� �ִ°� ����  
		if (result) {    //���� ����� ����
			System.out.println(member.getId()+"���� �α��� �߽��ϴ�");
		}else {
			System.out.println("id�� Ȥ�� password�� �߸��Է��߽��ϴ�");
		}
	}
}
