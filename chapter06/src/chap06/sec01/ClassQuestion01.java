package chap06.sec01;

/*
����6] �������� ������ �Է¹޾� ������ ����� ����ϴ� grade Ŭ���� ����

��� �迭 ���� �ƴϸ� ���� ����. ������� ����ϰ� ����ؾ���

�Է¸޼ҵ�, ��� ���ϴ� �޼ҵ� , ����ϴ� �޼ҵ�*/


import java.util.Scanner;

public class ClassQuestion01 {

			public static void main(String[] args) {
				ClassGrade gr=new ClassGrade();
				gr.classGrade();
				System.out.println("���� : "+gr.sum());			//return ���� s������ �ֱ�
				int s=gr.sum();
				System.out.println("��� : "+gr.average(s));
			}
		}

		class ClassGrade {
			int[] score=new int[3]; //(1����, 2����, 3����)
			
			public ClassGrade() {};
			
			public void classGrade() {
				Scanner sc=new Scanner(System.in);
				for(int i=0; i<score.length; i++) {
					System.out.print((i+1)+"���� ������ �Է��ϼ��� : ");
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
			
			public int average(int s) {		//s���� ������ ����ϱ�
				int average=(int)(s/score.length);
				return average;
			}

		}