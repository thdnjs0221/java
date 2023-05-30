package chap11.sec01;

public class ObjectExample {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		System.out.println("getinfo(): " + p1.getinfo());
		System.out.println("toString():" + p1.toString());

		// Person p2 = p1;
		Person p2 = new Person("홍길순");
		if (p2.equals(p1)) {
			// = if (p2.toString().equals(p1.toString)) {
			System.out.println("같은 내용");
		} else {
			System.out.println("다른 내용");
		}

	}

}

class Person {
	private String name; // 멤버변수를 하나씩 변경하고자할때 setter getter 메소드 사용하기, 한번에 출력하고할때는 toString 메소드 사용하기
							// private선언된 변수 있으면 생성자 메소드로 초기화,

	Person(String name) { // 생성자 메소드로 초기화 , 매개변수 있는 생성자 메소드 있으니까 기본 생성자x
		this.name = name;
	}

	String getinfo() {
		return getClass().getName() + '@' + Integer.toHexString(hashCode());
		// Person의 hashCode메모리 주소값 10진수를 16진수 문자열로 반환해라
		// hashCode: 메모리 주소값
		// object 최상위 클래스라 toString메소드 존재함
	}

	@Override
	public String toString() {
		return name;
	}
}
