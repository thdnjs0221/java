package chap06.sec04;
/*예제] 매장에서 판매되는 상품은 computer, audio, notepad이고 
	각각 가격은 1000원, 300원, 600원이다
	이들의 매출을 수행하는 메소드(saleGoods)를 작성하시오.

         클래스는 goods               판매자 클래스, 상품 클래스
         객체화 3개
         그안에 kind,가격 
판매라는 메소드 호출할때 상품의 객체를 가지고 가야함.
*/

public class Buyer {
	
	
	public int saleGoods(Goods goods,int amt) {      //상품, 수량
		return goods.getPrice()*amt;
	
	}

}
