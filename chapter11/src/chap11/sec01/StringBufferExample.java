package chap11.sec01;
//StringBuffer, StringBuilder : String 클래스의 단점(immutable)
//을 보완한 클래스
//append()메서드를 이용하여 저장된 문자열 끝에 새로운 문자열 추가 가능)
//연산후 toString()를 이용하여 문자열 (String) 타입으로변환

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		StringBuffer sb1=new StringBuffer("홍길동");
		StringBuffer sb2=new StringBuffer("홍길동");
		
		if(sb1.equals(sb2)) { // 문자열로 비교하고싶으면 sb1.toString/sb2.toString.
			System.out.println("같은 내용");
		}else {
			System.out.println("다른 내용");
		}
		
		sb.append("select * \n "); //append메서드: 추가
		sb.append("  from member \n ");
		sb.append(" where mem_id=? ");
		
		String str=sb.toString(); //toString문자로 변환시켜야함toString 호출해야함
		System.out.println(str);

	}

}
