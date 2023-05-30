package chap08.sec01;

public interface DataAccessObject {
	public void select();
	public void insert();
	public void update();
	public void delete(); //abstract 생략 자동으로 추가된다
}
