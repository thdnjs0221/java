package chap11.sec02;

import java.util.List;

public class TempExample {

	public static void main(String[] args) {
		new TempExample().start();
	}

	public void start() {      //static�޼ҵ忡�� �ҷ����� Ŭ������ü ���� �ҷ�����
		TempDao tempDao=TempDao.getInstance(); //Dao: ���� ������ ��� ��ȯ���ִ� Ŭ���� 
		
		String sql="select *from TEMP";
		List<TempVO> result=tempDao.selectList(sql);       //tempdao �ҷ���
		
		
		for(int i=0; i<result.size(); i++) {
			System.out.println(result.get(i));
			System.out.println("----------------------");
		}
		
		
	}
}
