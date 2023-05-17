package chap06.sec01;       //실제 일하는 클래스
//예제3] 사원번호(int 타입 정수), 사원명, 전화번호를 보유한 사원클래스(Employees)를 작성하시오
//기능은 사원정보 출력 가능
public class Employees {

	int empId;
	String empName;
	String telNum;
	
	
	public void showEmpInfo() {
		System.out.println("-----------------------------");
		System.out.println("   사원번호   사원명      전화번호    ");
		System.out.println("-----------------------------");
		System.out.printf("%5d %4s %15s",empId,empName,telNum);
	}

	
}
