package chap05.sec06;

public class ObjectArrayExample {

	public static void main(String[] args) {
		Books[] book=new Books[3];
		book[0]=new Books("���ʺ� ����","EBS",15000);
		book[1]=new Books("���� �Թ���","����ȣ",30000);
		book[2]=new Books("��ũ���׽� ����","������",10000);
		//book[]=book{new Books("���ʺ� ����","EBS",15000),
		//			new Books("���� �Թ���","����ȣ",15000)};
		//}
		
		System.out.println("-----------------------------");
		for(Books b : book) {                                        //����� ��ȭ�� for�� /  book[0] �迭 ��� b�� ���� ������  book[1]..
			System.out.println(b);
			System.out.println("----------------------------");
		}
		
		

	}

}
class Books{                
	private String title;     //private������ �ܺ� Ŭ���� ���� �Ұ��� . �ڱ� Ŭ����(books)������ ���� ���� . ������ �޼ҵ�� =>��ü �ʱ�ȭ������ ���  ������� �ʱ�ȭ ����
	private String writer;
	private int price;
	
	public Books() {}
	public Books(String title ,String writer,int price) {
		this.title=title;
		this.writer=writer;
		this.price=price;
		
	}
	@Override       //string �޼ҵ� �������ؼ� ����
	public String toString() {
		return "å�̸� :"+title+"\n����:"+writer+ "\n����:"+price;
	}
	
}
