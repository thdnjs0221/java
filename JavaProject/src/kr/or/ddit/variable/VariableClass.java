package kr.or.ddit.variable;

public class VariableClass {
/*
  2. 변수와 타입
 *   -변수 선언 및 초기화
 *   -변수 명명 규칙
 *   -기본타입
 *   -타입변환
 *   -변수와 시스템 입출력
 *   
 * 
 */
	public static void main(String[] args) {
		/*
		 * 1) 변수 선언 및 초기화
		 * 
		 * 변수란? 값을 저장할수있는 메모리으 특정 번지에 붙이는 이름이다
		 * 이런 개념 다 필요없고 값을 저장하기 위한 공간으로 기억하기
		 * 그런데 그 공간이 주소를 갖는다는것이다
		 * 
		 * [변수 선언 및 초기화]
		 * int age; 	//변수선언
		 * age=10;		//변수 초기화
		 *
		 * int num=20;	//변수 선언 및 초기화
		 * 
		 * ** 여기서 꼭 알고 가야할 부분은 , 변수를 선언하기 위해서는 여러가지 타입의 자료형을 알아야합니다 그러기 위해서는 타입종류를 알고 타입 종류에 따른 초기화 할수있는 값을 알아야합니다
		 * 타입별 초기화 할수있는 값은 어떤것이며, 타입 종류는 어떤것이 있고 그형태는 어떤것이 있는 지 아래3) 에서 한번더 확인할수있도록합니다
		 * 
		 int age =99;        정수형 타입의 변수 age를 99라는 값으로 초기화
		 int num; 정수형 타입의 변수 num을 선언
		 num=1400; 변수 nu에 1400값으로 초기화
		 boolean flag= false; 논리형 타입의 변수 flag에 ㄹfalse값으로 초기화
		 String str=""; 문자열 타입의 변수 str에 ""공백값으로 초기화
		 str= "Basic Java"; str변수에 Basic Java 문자열의 값을 초기화
		 
		 
		 *2) 변수 명명 규칙
		 *변수이름은 자바언어에서 정한 명명 규칙을 따라야하는데 아래와 같은 명명규칙을 지키도록하자
		 *- 첫번째 글자는 문자이거나 '$' , '_" 로 시작해야하고 숫자로 시작할수없다
		 *-영문 대소문자 구분한다
		 *-첫문자는 소문자로 시작하고 뒤에 다른단어가 붙는 경ㅇ우 대문자로 시작한다
		 *>개발자 사이이에서 관례로 행해짐
		 *>카멜 표기법 이라고 한다
		 *-문자 수의 제한은 없다 (그렇다고 너무 길면 안되고 적당히 길게)
		 *-자바 예약어는 사용할수 없음
		 *>혼공자 p50 참고
		 */
		int boNo =0;
		int bo_hit=0;
		String title="";
		String boContent ="";
		boolean joinFlag= false;
		
		double mathKorNum;		//관례적으로 변수는 소문자로 시작한다
		float floatNum;     	 //변수는 숫자로 시작할수없다
		String $ajaxObject;		 //변수는 $ 시작 할수있음
	//	int _count;				//변수는 _로 시작 가능
		//String private;  		// 예약어라 안된다.
		
		/*
		 * 3) 기본 타입
		 * 기본형 타입
		 * 정수 실수 논리형 타입의 기본타입으로 제공한다
		 * 정수형 타입: byte char short int long       
		 * 실수형 타입 : float double
		 * 논리형 타입: boolean
		 * 
		 * **w\정수형 타입의 크기 암기 비법
		 * bc 카드로 sil나게 !!!
		 *  b c s i l
		 *  1 2 2 4 8
		 *  boolean float double
		 *  1        4      8
		 *  
		 *  참조형 타입
		 *  String Integer Float Double 등
		 * 
		 * 
		 * */
		 byte len=127;
		 short length=128;
		 char ch1='a';  //a출력
		 char ch2=64;     //a가 출력
		 int textNum= ch1;  //숫자 65출력 
		 int box =2145689511;// int 담을수 있는 최대 수 범위가 있음
		 long max =999999999;// long 담을수 있는 최대 수 범위가 있음
		 boolean agree= false;
		 float num1=24;
		// float num2=24.5;
		 float num3=24.516f;
		 double num4= 123.123;    //소수를 그대로 입력가능
		 double num5= num3;// 같은 실수형이기 때문에 집어넣을수 있다
		 
		 
		 /*4)타입 변환
		  * 타입 변환이란 해당 데이터 타입을 다른 데이터 ㅇ타입으로 변환하는 것이다
		  * 
		  * 타입변환은 큰 허용 범위 타입= 작은 허용 범튀타입;
		  * 
		  * [크기순서]
		  * byte short int long float double
		  * 
		  * 강제 타입 변환(캐스팅)
		  * 작은 허용 범위 = (큰 허용 범위)값;
		  * 
		  * 참조형 타입의 함수를 이용한 타입 변환
		  * 참조형 타입.parse참조형 타입
		  * >Integer.parseInt ();
		  * >Integer.parseByte();
		  * >Short.parseShort();
		  * >Double.parseDouble();
		  * 
		  * 참조형 타입의 함수를 이요한 형변환은 특징이 있는데 변환하고자 하는 타입의 값 형태를 맞춰 주어야한다
		  * 
		  * 자료형에 따른 기본값(데이터)
		  * 자료형 기본값
		  * byte 0
		  * short 0
		  * int 0
		  * long 
		  * float 0.0f
		  * char '\u0000'(null)
		  * boolean false
		  * 
		  * 
		  * 
		  */
		 
		 byte byteValue=127;
		 int intValue=1+byteValue;
		 long longValue=90000000L;
		 float floatValue= longValue;
		 double doubleValue=longValue;
		 char charValue='a';
		 int intValue2=charValue;
		 
		 
		 System.out.println(byteValue);
		 System.out.println(intValue);
		 System.out.println(longValue);
		 System.out.println(floatValue);
		 System.out.println(doubleValue);
		 System.out.println(charValue);
		 System.out.println(intValue2);
		 
		 int a =128;
		 byte b = (byte)a;   // -128~127
		 System.out.println(b);
		 
		 
		
	}
}
