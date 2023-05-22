package chapter07.sec03;

public class HiMart {

	public static void main(String[] args) {
		Buyer b=new Buyer();
		//Tv t=new Tv();
		//Computer c=new Computer();
		//SmartPhone s=new SmartPhone();
		
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.summary();
		
		//b.buy(c);
		//System.out.println("³²Àºµ·: "+b.money);
			
			
	}

}
