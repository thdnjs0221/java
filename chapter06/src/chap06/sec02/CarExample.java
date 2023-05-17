package chap06.sec02;

public class CarExample {

	public static void main(String[] args) {
	 Car c1=new Car();
	 c1.setCompany("르로 자동차");
	 c1.setAuto(true);
	 System.out.println(c1);

	}

}
class Car{
	private String company;
	private boolean isAuto;
	
	Car(){}
	Car(String company){ //생성자메소드
		this.company=company;
		this.isAuto=isAuto;
		
		
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setAuto(boolean isAuto) {
		this.isAuto = isAuto;
	} //setter멤버값을 설정 업데이트, 변경해줄때 
	
	@Override
	public String toString() {
		String gearType="";          //기어타입은 지역타입 이라 초기화?
		if(isAuto) {
			gearType="자동";
		}else {
			gearType="수동";
			
		}
		return gearType; 
		
	}
	
}