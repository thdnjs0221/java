package Practice7_30;

public class Product {
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price=price;
		bonusPoint=(int)(price/10.0);
	}
	Product(){} //기본 생성자를 쓰는 습관을 가지자
}
class Tv extends Product{
	Tv(){ super(100);}
  public String toString() {return "Tv";}
}
class Computer extends Product{
	Computer(){super(200); }
 public String toString() {return "Comouter";}
}
class Audio extends Product{
	Audio(){super(50);}
 public String toString() {return "Audio";}
}

class Buyer{
	int money=1000;
	int bonusPoint=0;
	Product[]cart = new Product[10];
	int i =0;
	
	void buy(Product p) {
		//void buy(Product p)는 메서드의 선언을 나타냅니다. 이 선언은 buy라는 이름의 메서드를 정의하고, 매개변수로 Product 타입의 p를 받는다는 것을 의미합니다. void는 해당 메서드가 반환값이 없음을 나타내며, buy 메서드는 어떤 결과값을 반환하지 않고 작업을 수행하는 역할을 가지고 있습니다.
		//여기서 buy는 메서드의 이름이며, 메서드는 해당 이름으로 호출됩니다. 메서드의 이름은 개발자가 자유롭게 선택할 수 있으며, 프로그램의 목적과 역할에 맞게 명명되어야 합니다. buy 메서드는 아마도 상품을 구매하는 동작을 수행하는 메서드일 것입니다. Product p는 buy 메서드에 전달되는 매개변수로, Product 타입의 객체를 받아 해당 상품을 구매하는 작업을 수행할 수 있도록 합니다.
		if(money < p.price) {
			System.out.println("잔액부족");
			//return;
	}
		
		money-=p.price;
		bonusPoint+=p.bonusPoint;
		cart[i++]=p;
		System.out.println(p+"를 구입했다");	
	}
	void summary() {
		int sum = 0;            
		String itemList = "";      //초기값 설정이유는 for문 때문에..?
		for(int i=0; i<cart.length; i++) {
			if (cart[i]==null)
				break;
			 sum += cart[i].price;
			itemList += cart[i];
			
		}
		System.out.println("총금액은 "+sum);
		System.out.println("구매한 제품은"+itemList);
			
		}
}


		