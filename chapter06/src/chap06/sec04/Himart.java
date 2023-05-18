package chap06.sec04;

public class Himart {

	public static void main(String[] args) {
		int sum=0;
		String list="";
		
		Goods computer=new Goods("Computer",1000);
		Goods audio=new Goods("Audio",300);
		Goods notepad=new Goods("Notepad",600);
		
		Buyer buyer=new Buyer();
		sum=sum+buyer.saleGoods(computer, 2);
		list+= computer.getkind();
		
		sum=sum+buyer.saleGoods(notepad, 1);
		list+= ","+notepad.getkind();
		
		
		
		
		System.out.println("备概前格: "+list);
		System.out.println("备概陛咀: "+sum);
	}

}
