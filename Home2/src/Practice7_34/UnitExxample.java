package Practice7_34;

public class UnitExxample {

	public static void main(String[] args) {
		Unit[] group= {new Marine(), new Tank(), new Dropship() };  //이 코드는 배열을 생성하면서 동시에 세 개의 Unit 객체(Marine, Tank, Dropship)를 초기값으로 할당합니다.
		                                                            //배열의 크기는 할당된 초기값의 수에 따라 자동으로 결정됩니다.
	
	 for(int i =0; i<group.length; i++) 
		 group[i].move((i+1)*100,(i+1)*100);
	 
	 Dropship s=new Dropship();
	 s.load();
	 
	

	 }
	}
