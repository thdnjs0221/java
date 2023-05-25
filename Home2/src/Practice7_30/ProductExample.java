package Practice7_30;

public class ProductExample {

	public static void main(String[] args) {
		Buyer b=new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		b.summary();

	}

}
