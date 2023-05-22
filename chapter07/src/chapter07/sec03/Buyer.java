package chapter07.sec03;

import java.util.ArrayList;

public class Buyer {
	int money;
	int bonusPoint;
	 //Product[] cart=new Product[10];  //생성자 메소드 아님 객체 생성 안되었음. 배열 생성
	ArrayList<Product> cart=new  ArrayList<Product>();
	int i=0; //cart배열의 index
	
	Buyer(){
		 money=5000;
		 bonusPoint=0;

	}
	
	void buy(Product p) {
		cart.add(p);
		//money=money-p.price;   // 1000
		//bonusPoint+=p.bonusPoint;
		//System.out.println(p+"를 구입했습니다");  //다형성
		//cart[i++]=p;
	}
	void summary() {
		int sum=0; //구매금액합계
		String list=""; //구매목록
	
		
			for(int i=0; i<cart.size(); i++) {
			if(cart.get(i) !=null) {
			sum=sum+cart.get(i).price;
			bonusPoint+=cart.get(i).bonusPoint;
			list+=cart.get(i).toString()+","; 
		}
		System.out.println("구매목록: "+list);
		System.out.println("구매금액 합계: "+sum);
		System.out.println("지급 보너스포인트: "+bonusPoint);
		System.out.println("남은 돈: "+(money-sum));
	}
	/*void buy(Computer c) {
		money=money-c.price;
		bonusPoint+=c.bonusPoint;
		System.out.println(c+"를 구입했습니다");
	}
	void buy(SmartPhone s) {
		money=money-s.price;
		bonusPoint+=s.bonusPoint;
		System.out.println(s+"를 구입했습니다");*/

}
}
