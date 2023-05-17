package chap06.sec01;

/*
문제6] 세과목의 점수를 입력받아 총점과 평균을 출력하는 grade 클래스 생성

평균 배열 저장 아니면 별도 저장. 총점평균 계산하고 출력해야함

입력메소드, 평균 구하는 메소드 , 출력하는 메소드*/


import java.util.Scanner;

public class ClassQuestion01 {

			public static void main(String[] args) {
				ClassGrade gr=new ClassGrade();
				gr.classGrade();
				System.out.println("총점 : "+gr.sum());			//return 값을 s변수에 넣기
				int s=gr.sum();
				System.out.println("평균 : "+gr.average(s));
			}
		}

		class ClassGrade {
			int[] score=new int[3]; //(1과목, 2과목, 3과목)
			
			public ClassGrade() {};
			
			public void classGrade() {
				Scanner sc=new Scanner(System.in);
				for(int i=0; i<score.length; i++) {
					System.out.print((i+1)+"과목 점수를 입력하세요 : ");
					score[i]=Integer.parseInt(sc.nextLine());
					this.score[i]=score[i];
				}
			}
			
			public int sum() {
				int sum=0;
				for(int i=0; i<score.length; i++) {
					sum+=score[i];
				}
				return sum;
				}
			
			public int average(int s) {		//s값을 가져와 계산하기
				int average=(int)(s/score.length);
				return average;
			}

		}