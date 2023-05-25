package chap08.sec01;

public class OracleDao implements DataAccessObject{
	//구현해야할값
	@Override
	public void select() {//추상메서드. 
		System.out.println("Oracle DB에서 데이터 검색");
	}

	@Override
	public void insert() {
		System.out.println("Oracle DB에서 자료삽입");
}
	@Override
	public void update() {
		System.out.println("Oracle DB에서 자료갱신");
		
	}
	@Override
	public void delete() {
		System.out.println("Oracle DB에서 자료삭제");
	}
}
		