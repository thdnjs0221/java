package chap06.sec08;

public class MySql extends DataAccessObject{
	
	@Override
	public void update() {
		StringBuffer sb=new StringBuffer();
		sb.append("UPDATE CART");
		sb.append("     SET CART_QTY=10\n");
		sb.append("WHERE CART_NO_=?");
		String sql=sb.toString();
		System.out.println(sql);
		System.out.println("MySql 데이터 갱신 qurey");
		
		
	}
	public void select() {
		String sql="SELECT * FROM CART";
		System.out.println("MY SQL 데이터 검색 QUERY");
	}

}
