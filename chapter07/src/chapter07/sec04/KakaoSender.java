package chapter07.sec04;

public class KakaoSender extends ContentSender {
	String content;
	
	 KakaoSender(String title, String senderName,String content){
		super(title,senderName);
		this.content=content;
	}
	@Override
	public void sendMsg(String recipient) {
		System.out.println("����: "+title);
		System.out.println("�̸�: "+senderName);
		System.out.println("����: "+content);
		System.out.println("������: "+recipient);
		
		
		

	}

}
