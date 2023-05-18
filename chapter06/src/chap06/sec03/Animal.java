package chap06.sec03;
/*예제] 동물의 종류(kind)를 보관하는 멤버 필드가 있는 동물클래스(Animal)를 생성하고, 
생성자메소드를 통한 동물의 종류 설정과
동물의 종류를 변경 할수있는 메소드 및 종류를 반환하는 메소드 작성.
*/


public class Animal {
   private String kind; 
   
   Animal (){    // 기본 생성자
      this("호랑이");  //다른 생성자 호출 할때 씀 . 호출 할 매개변수 갯수 타입 순서 똑같이 써주기 그럼 그게 호출된다. 
   } 
   
   Animal(String kind) {   // 호랑이가 kind로 들어감
      this.kind=kind;   // kind 멤버변수에 저장하기 블록이 나가면 값이 소멸하니까
   }
 //종류 변경하기! setter 메소드 사용. setter-> 셋팅후 되돌려주는 값없고  매개변수 있음 getter-> 되돌려주는 값 있음 매개변수 없음
   public void setKind(String kind) {  //set 호출하면 setKind("고양이") 가 멤버변수로 가서 호랑이가 고양이로 변경 됨
      this.kind=kind;
   }
 //밖으로 반환해주는 메소드! 5개중 하나 반환시  getter/ 5개 전체 반환할땐 to string
   public String getKind() {  // 특정 5개중 1개만 바꿀때는 get , 5개중 5개 다 바꿀때는 toString / return문이 꼭 잇어야 한다.
      return kind;
   }
}
