package chap05.sec02;

public class SortAlgorithmExample {

	public static void main(String[] args) {
		// 예제6] 다음 수를 배열에 저장하고  크기순으로 정렬하시오
        //    자료: 35,80,25,69,44,51,17,97
		// Bubble Sort 인접된 두자료의 크기를 비교하여 자리를 교환 
		// 자료가 n개일때 n-1회전수행 //회전시킬때마다 제일 큰값 오른쪽 하나씩 제외
		int[] source= {35,80,25,69,44,51,17,97};
	 SortAlgorithm sa=new  SortAlgorithm();
	 sa.bubbleSort(source);
	}
}

class SortAlgorithm{
	//int[] source=new int[8];
	// =      int[] source= {35,80,25,69,44,51,17,97};
	
	public void bubbleSort(int[] target) {
		boolean flag=false;
		int cnt=0;
		for(int i= 0; i<target.length-1; i++) {            //각회전
			flag=false;
			cnt++;
			for(int j=0; j<target.length-1-i; j++) {       //한행에서 비교
				if(target[j]>target[j+1]) {
					int temp=target[j];
					target[j]=target[j+1];
					target[j+1]=temp;    
					flag=true;
				}
			}
			if(!flag) break;
			
		}
		
		System.out.println("수행횟수: "+cnt);
		for(int i=0; i<target.length; i++) {
			System.out.printf("%5d", target[i]);
		}
		
		
		
	}
}
