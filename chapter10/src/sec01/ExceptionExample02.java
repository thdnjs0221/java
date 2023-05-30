package sec01;

public class ExceptionExample02 {

	public static void main(String[] args) {
		try {
			throw new CustomException("내가 만든 예외 클래스"); // throw 강제로 예외 발생 시켜라
		}catch(CustomException e) {
			e.printStackTrace();
		}
	}
}
//사용자 정의 예외클래스
//일반예외클래스: Exception 클래스를 상속 받아 생성
//실행예외클래스: RuntimeException 클래스를 상속받아 생성
class CustomException extends Exception{
	CustomException(){}  //매개변수없는 예외클래스 만들때 잘 안씀 
	CustomException(String message){ 
		super(message);		
	}
}