package chap05.sec06;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {     
		//ArrayCopy ac=new ArrayCopy();
		//ac.method1();
		
	
	
		//dc.method1();
		DeepCopy dc= new DeepCopy();
		dc.method2();
		
		
	}
	

	
}
	class ArrayCopy{  //옅은복사
		public void method1() {
			int[] num= {10,20,30,40,50};
			for(int su : num) {
				System.out.println(su);
			}
			System.out.println("--------------");
			method2(num);
			for(int su : num) {
				System.out.println(su);
			}
		}
		public void method2(int[] tar) {
			tar[2]=1000;
		}
	}
	class DeepCopy{
		//1. for문 이용해서 배열 복사
		public void method1() {
			int[] num= {100,200,300,400,500};
			int[] tar=new int[5];
			for(int i=0; i<num.length; i++) {
				tar[i] =num[i];
				
			}
			
			System.out.println("num :"+ Arrays.toString(num));
			
			System.out.println("tar :"+ Arrays.toString(tar));
			
		}
		public void method2() {
			int[] num= {100,200,300,400,500};
			int[] tar=new int[5];
			System.arraycopy(num, 0,tar,0,num.length);
			
			tar[2]=1000;
			System.out.println("num :"+ Arrays.toString(num));
			System.out.println("tar :"+ Arrays.toString(tar));
			
			
			
		}
		public void method3() {
			int[] num= {1,2,3,4,5};
			int[] tar=new int[5];
			tar=num.clone();
			
			tar[2]=1000;
			System.out.println("num :"+ Arrays.toString(num));
			System.out.println("tar :"+ Arrays.toString(tar));
	}

	}
	
