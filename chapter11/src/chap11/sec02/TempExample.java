package chap11.sec02;

import java.util.List;

public class TempExample {

	public static void main(String[] args) {
		new TempExample().start();
	}

	public void start() {      //static메소드에서 불러야함 클래스객체 만들어서 불러야함
		TempDao tempDao=TempDao.getInstance(); //Dao: 쿼리 실행후 결과 반환해주는 클래스 
		
		String sql="select *from TEMP";
		List<TempVO> result=tempDao.selectList(sql);       //tempdao 불러줌
		
		
		for(int i=0; i<result.size(); i++) {
			System.out.println(result.get(i));
			System.out.println("----------------------");
		}
		
		
	}
}
