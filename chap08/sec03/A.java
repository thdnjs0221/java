package chap08.sec03;

interface I{
	public void methodB(); //인터페이스를 b가 구현
}

public class A {//사용자
	public void methodA (I i) {  //a는 인터페이스밖에 모름
		i.methodB();
	}

}
class B implements I {//제공자
	@Override
	public void methodB() {   //인터페이스 재정의해준거
		System.out.println("methodB()");
	}
}
