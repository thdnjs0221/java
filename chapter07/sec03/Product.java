package chapter07.sec03;

public class Product {
	int price;
	int bonusPoint;
	
	public Product (int price) {  //price �� 1000 -> �ʵ� price
		this.price=price;
		bonusPoint=price/10;
		
	}

}
