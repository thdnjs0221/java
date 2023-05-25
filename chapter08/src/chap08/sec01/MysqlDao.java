package chap08.sec01;

public class MysqlDao implements DataAccessObject {
	@Override
	public void select() {}      // {} 재정의해주기. 재정의할때 접근지정자는 원래 추상메소드보다 좁혀서 쓸수없음 넓히는거는 가능
	public void insert() {}
	public void update() {}
	public void delete() {}
	

}
