package chap05.sec02;
import java.util.Scanner;


public class OneDimArrayExample02 {

	public static void main(String[] args) {
		OneDimArray02 od2=new OneDimArray02();
		od2.setName();
		od2.getName();
		od2.exchange();
		

	}

}
//예제2] 키보드로 5명의 친구이름 입력 받아 배열에 저장하고 역순으로 출력하시오
class OneDimArray02{
	Scanner sc=new Scanner(System.in);
	
	String[] name = new String [5];   //name에 주소가 저장(문자열x) //멤버변수 (같은 멤버들은 모두 공유 가능)
	
	public void setName() {             //setname() 클래스 멤버변수에 있으니까 접근 가능
		for(int i=0; i<name.length; i++) {           
			System.out.print((i+1)+"이름 입력: ");
			name[i]=sc.nextLine();
			
		}
		
	}
	
	public void getName() {
		//for (int i=name.length-1; i>=0; i--) {       //=
		for (int i=0; i<name.length; i++){
			System.out.println(name[(name.length-1)-i]);
			
		}
	}
	//예제3] 예제2의 첫 번째 친구이름과 마지막 친구 이름을 서로 바꾸시오    //
	
	public void exchange() {
		String temp=null;
	temp=name[0];
	name[0]=name[4];
	name[4]=temp;
	
	for (String str: name) {           //기능이 강화된 for문  name을 str 넣어줌  
		System.out.printf("%5s",str);  // str->name
	}
	}
	
	
	
	
	
}
