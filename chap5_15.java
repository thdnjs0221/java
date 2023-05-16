package homework_1;        //5.15 월  과제

public class chap5_15 {

	public static void main(String[] args) {
		 TwoDimArray td=new  TwoDimArray();
		 //td.getscore();
		 //td.sumOfscore();
		td.getRank();

	}

}
/*2차원배열예제1] 5명이 3과목 시험을 본 결과가 다음과 같다.
			    이를 배열 저장한 수 출력하시오.                (문자열,숫자 배열 따로 만들기)
	[자료]
	 이름	 	 국어 	        영어 	       수학
	 홍길동	  70	 80	    60
	 이순신	  80	 90 	90
	 정몽주	  90	 80		90
	 강감찬	  75   	 80		80
	 이성계  	  60	 70		60 */

class TwoDimArray{
	private String[] name= {"홍길동", "이순신", "정몽주","강감찬","이성계"};   //1차원 배열 문제에서 공통으로 써야하기때문에 밖으로 뺌
	
	public void getscore() {
		int[][]score={ {70,80,60},{80,90,90},{90,80,90},{75,80,80},{60,70,60} };  //2차원배열 선언 생성 초기화 => 한문장으로 (불규칙한 데이터일때 )
		
		
		
		printScore	(score);														  
		//	for(int i=0; i<score.length; i++) {					 // 이름 행      // 규칙적인 데이터일때는 for문으로 
		//	System.out.print(name[i]+" ");         			 // 점수보다 먼저 출력.
		//	for (int j=0; j<score[i].length; j++) {			 // 점수 열
		//		System.out.printf("%6d", score[i][j]);		 // 예) score 0행0열  ,0행 1열...- 
		//	}
		//	System.out.println();                            
	//	}
		
	}
	//2차원배열예제2] 위 자료를 이용하여 총점과 평균을 구하시오  (평균은 정수로 구한다)
	public void sumOfscore() {
		int[][]score={ {70,80,60,0,0},{80,90,90,0,0},{90,80,90,0,0},{75,80,80,0,0},{60,70,60,0,0} };   //  총점, 평균초기값 0 넣기   -> 5행5열
		
		for(int i=0; i<score.length; i++) {    				//행  행5개
			for(int j=0; j<3; j++) {           				//열     0~2->(70,80,60)
				score[i][3]= score [i][3]+score[i][j];	    //총점  //score[i][3] 총점자리에 score[i][3] + score[i][j];(0,0..0,1....)
			}
			score[i][4]= score[i][3]/3;		  				//평균: 총점/3
		}
		System.out.println("       ****   성적표   ****     ");
		System.out.println("--------------------------------------------");
		System.out.println("이름    국어   영어   수학    총점   평균  ");
		System.out.println("--------------------------------------------");
		printScore (score);
		
	}
	public void getRank() {               //**초기값을 1등으로 다른 사람의 총점과  자기 총점보다 큰 값이오면 등수에  +1
		int[][]score={ {70,80,60,0,0,1},{80,90,90,0,0,1},{90,80,90,0,0,1},{75,80,80,0,0,1},{60,70,60,0,0,1} }; //총점으로 구하기
		//총점 및 평균
		for(int i=0; i<score.length; i++) {         //행
			for(int j=0; j<3; j++) {				//열
				score[i][3]= score [i][3]+score[i][j];   //합계			
			}
			score[i][4]= score[i][3]/3;		// 평균
		}
		//등수
	for (int i =0; i <score.length; i++) {	     //행    score.length->5
		for(int j=0; j<score.length; j++) {      //열    score.length->6
			if(score[i][3] < score[j][3]) {      // 총점으로 비교 ! 0,3<0,3  / 0,3<1,3 / 0,3<2,3
				score[i][5]++; 					// 값이 크면 인덱스5에 +1    등수 초기값은1로 주어짐
			}
		}
	}
	System.out.println("       ****   성적표   ****     ");
	System.out.println("--------------------------------------------");
	System.out.println("이름        국어      영어      수학      총점      평균       등수 ");
	System.out.println("--------------------------------------------");
	printScore(score);
}

	public void printScore (int[][] score) {//반복 호출
		for(int i=0; i<score.length; i++) {					 // 이름 행
			System.out.print(name[i]+" ");         			 // 점수보다 먼저 출력.
			
			for (int j=0; j<score[i].length; j++) {			 // 점수 열
				System.out.printf("%6d", score[i][j]);		 // 예) score 0행0열  ,0행 1열...- 
			}
			System.out.println(); 
		}
	}


/*5명이 3과목 시험을 본 결과가 다음과 같다.
    이를 배열 저장한 후 총점,평균,등수를 구한 후 등수순으로 출력하시오.(평균은 정수로)
[자료]
이름     국어    영어   수학
홍길동    70     80    60
이순신    80     90    90
정몽주    90     80    90
강감찬    75     80    80
이성계    60     70    60*/
	public void getRank1() {               //**초기값을 1등으로 다른 사람의 총점과  자기 총점보다 큰 값이오면 등수에  +1
		int[][]score={ {70,80,60,0,0,1},{80,90,90,0,0,1},{90,80,90,0,0,1},{75,80,80,0,0,1},{60,70,60,0,0,1} }; //총점으로 구하기
		//총점 및 평균
		for(int i=0; i<score.length; i++) {         //행
			for(int j=0; j<3; j++) {				//열
				score[i][3]= score [i][3]+score[i][j];   //합계??				
			}
			score[i][4]= score[i][3]/3;		// 평균
		}
		                                          //등수
	for (int i =0; i <score.length; i++) {	     //행    score.length->5
		for(int j=0; j<score.length; j++) {      //열    score.length->6
			if(score[i][3] < score[j][3]) {      //
				score[i][5]++; 					// 값이 크면 인덱스5에 +1
		 }
	  }
	}
	for (int i =0; i <score.length; i++) {	       //행    score.length->5
		for(int j=i+1; j<score.length; j++) {      //열    score.length->6
			if(score[i][5] > score[j][5]) { 
				
				int[]temp =score[i];
				score[i]=score[j];
				score[j]=temp;
				
				String tempstr= name[i];
				name[i]= name[j];
				name[j]= tempstr;
				
			}
	
		}

	}
	
	System.out.println("       ****   성적표   ****     ");
	System.out.println("--------------------------------------------");
	System.out.println("이름        국어      영어      수학      총점      평균       등수 ");
	System.out.println("--------------------------------------------");
	printScore(score);
	}
	}
	