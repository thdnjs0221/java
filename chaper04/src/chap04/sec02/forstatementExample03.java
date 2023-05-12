package chap04.sec02;

import java.util.Random;
import java.util.Scanner;

public class forstatementExample03 {

	public static void main(String[] args) {

		forstatement03 fs03 = new forstatement03();
		/*
		 * System.out.println("1번 도형"); fs03.shape01(); System.out.println("\n2번 도형");
		 * fs03.shape02(); System.out.println("\n3번 도형"); fs03.shape03();
		 * System.out.println("\n4번 도형"); fs03.shape04(); System.out.println("\n5번 도형");
		 * fs03.shape05();
		 */

		// s03.homework01();
		// fs03.homework02();
		fs03.homework06();

	}

}

class forstatement03 {
	// private Object sc;
	Scanner sc = new Scanner(System.in);

	public void shape01() {
		for (int i = 0; i < 5; i++) { // 행을 담당
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void shape02() {
		for (int i = 0; i < 5; i++) { // 행을 담당

			for (int j = 0; j < i; j++) // 공백 출력
				System.out.print(" ");

			for (int j = 0; j < (5 - i); j++) { // "*"출력 @@
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void shape03() {
		for (int i = 0; i < 5; i++) { // 행을 담당

			for (int j = 0; j < (4 - i); j++) // 공백 출력
				System.out.print(" ");

			for (int j = 0; j < (i * 2) + 1; j++) { // "*"출력
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void shape04() {
		for (int i = 0; i < 5; i++) { // 행을 담당

			for (int j = 0; j < (5 - i); j++) // 공백 출력
				System.out.print(" ");

			for (int j = 0; j <= i; j++) { // "*"출력
				System.out.print("*");
			}
			System.out.println();

		}
	}

	public void shape05() {
		for (int i = 0; i < 5; i++) { // 행을 담당

			for (int j = 0; j > i; j++) // 공백 출력
				System.out.print(" ");

			for (int j = 0; j < (5 - i); j++) { // "*"출력
				System.out.print("*");
			}
			System.out.println();

		}
	}

	/*
	 * 문제2] 다음과 같이 구구단이 출력 되도록 프로그래밍하시오.(for문 사용)
	 * 
	 * 2 * 1 = 2 3 * 1 = 3 4 * 1 = 4 2 * 2 = 4 3 * 2 = 6 4 * 2 = 8 2 * 3 = 6 3 * 3 =
	 * 9 4 * 3 = 12 2 * 4 = 8 3 * 4 = 12 4 * 4 = 16 2 * 5 = 10 3 * 5 = 15 4 * 5 = 20
	 * 2 * 6 = 12 3 * 6 = 18 4 * 6 = 24 2 * 7 = 14 3 * 7 = 21 4 * 7 = 28 2 * 8 = 16
	 * 3 * 8 = 24 4 * 8 = 32 2 * 9 = 18 3 * 9 = 27 4 * 9 = 36
	 */

	public void homework02() {
		for (int j = 1; j <= 9; j++) {

			for (int i = 2; i <= 4; i++) {
				System.out.printf("%d * %d = %d\t", i, j, i * j);

			}
			System.out.println();
		}
	}

	// 문제6]int 타입의 변수 num이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라=====
	// 만일 변수 의 값이 라면 . num 12345 , ‘1+2+3+4+5’의 결과인 15를 출력하라(while문)
	public void homework06() {
		int num = 12345;
		int sum = 0;

		while (num != 0) {

			sum =sum+ num%10;
			
			num =num/10;

		}

		System.out.println("합:" + sum);
	}

	// 문제5] 숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.
	// 만일 문자열이 "12345"라면, ‘1+2+3+4+5’의 결과인 15가 출력되어야 한다.(for문)
	public void homework05() {

		String str = "12345";
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			sum += str.charAt(i) - '0';

		}
		System.out.println(sum);

	}


	// 문제3] 1 ~ 50 사이의 난수를 하나 발생시키고,
	// 사용자가 그 수를 맞추는 프로그램을 작성하시오
	// 즉, 사용자가 입력한 수가 발생된 난수보다 작으면 "더큰수를 입력하세요"라는 메시지를,
	// 난수보다 큰 수이면 "더 작은 수를 입력하세요" 라는 메시지를 출력한 후 새로운 값을 입력 받는다
	// 난수와 사용자가 입력한 값이 같은면 "정답입니다"라는 메시지와 그때까지 시도한 횟수도 출력한다.
	// (while문 사용)
	public void homework03() {

		int rnd = (int) (Math.random() * 50) + 1;
		int tr = 1;

		while (true) {

			System.out.println("숫자를 입력하세요: ");
			int num = sc.nextInt();
			int re = tr++;

			if (rnd < num) {
				System.out.println("더큰수를입력하세요");
			} else if (rnd > num) {
				System.out.println("더작은수를입력하세요");
			} else if (rnd == num) {
				System.out.println("정답입니다");

				System.out.println("횟수:" + re);
				break;
			}

		}

	}

	// 문제4] 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.
	// (for문)
	public void homework04() {
		for (int x = 1; x <= 5; x++) {
			for (int y = 1; y <= 6; y++) {

				if ((1 * x) + (1 * y) == 6) {
					System.out.println("6의 합: " + x + "+" + y);
				}

			}
		}
	}

	// 문제1]10원, 50원, 100원짜리 동전으로 860원을 구성하는 방법을 모두 출력하시오.
	// 단 모든 동전은 1개 이상 사용해야 한다.(for문 사용)
	public void homework01() {
		for (int x = 1; x <= 86; x++) {
			for (int y = 1; y <= 18; y++) {
				for (int z = 1; z <= 9; z++)

					if ((x * 10) + (y * 50) + (z * 100) == 860) {
						System.out.println(" 정답=10원:" + (x * 10) + " 50원:" + (y * 50) + " 100원:" + (z * 100));
					}
			}
		}
	}
}
