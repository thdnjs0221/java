package chap04.sec02;

import java.util.Random;
import java.util.Scanner;

public class forstatementExample03 {

	public static void main(String[] args) {

		forstatement03 fs03 = new forstatement03();
		/*
		 * System.out.println("1�� ����"); fs03.shape01(); System.out.println("\n2�� ����");
		 * fs03.shape02(); System.out.println("\n3�� ����"); fs03.shape03();
		 * System.out.println("\n4�� ����"); fs03.shape04(); System.out.println("\n5�� ����");
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
		for (int i = 0; i < 5; i++) { // ���� ���
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void shape02() {
		for (int i = 0; i < 5; i++) { // ���� ���

			for (int j = 0; j < i; j++) // ���� ���
				System.out.print(" ");

			for (int j = 0; j < (5 - i); j++) { // "*"��� @@
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void shape03() {
		for (int i = 0; i < 5; i++) { // ���� ���

			for (int j = 0; j < (4 - i); j++) // ���� ���
				System.out.print(" ");

			for (int j = 0; j < (i * 2) + 1; j++) { // "*"���
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void shape04() {
		for (int i = 0; i < 5; i++) { // ���� ���

			for (int j = 0; j < (5 - i); j++) // ���� ���
				System.out.print(" ");

			for (int j = 0; j <= i; j++) { // "*"���
				System.out.print("*");
			}
			System.out.println();

		}
	}

	public void shape05() {
		for (int i = 0; i < 5; i++) { // ���� ���

			for (int j = 0; j > i; j++) // ���� ���
				System.out.print(" ");

			for (int j = 0; j < (5 - i); j++) { // "*"���
				System.out.print("*");
			}
			System.out.println();

		}
	}

	/*
	 * ����2] ������ ���� �������� ��� �ǵ��� ���α׷����Ͻÿ�.(for�� ���)
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

	// ����6]int Ÿ���� ���� num�� ���� ��, �� �ڸ��� ���� ���� ����� ����ϴ� �ڵ带 �ϼ��϶�=====
	// ���� ���� �� ���� ��� . num 12345 , ��1+2+3+4+5���� ����� 15�� ����϶�(while��)
	public void homework06() {
		int num = 12345;
		int sum = 0;

		while (num != 0) {

			sum =sum+ num%10;
			
			num =num/10;

		}

		System.out.println("��:" + sum);
	}

	// ����5] ���ڷ� �̷���� ���ڿ� str�� ���� ��, �� �ڸ��� ���� ���� ����� ����ϴ� �ڵ带 �ϼ��϶�.
	// ���� ���ڿ��� "12345"���, ��1+2+3+4+5���� ����� 15�� ��µǾ�� �Ѵ�.(for��)
	public void homework05() {

		String str = "12345";
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			sum += str.charAt(i) - '0';

		}
		System.out.println(sum);

	}


	// ����3] 1 ~ 50 ������ ������ �ϳ� �߻���Ű��,
	// ����ڰ� �� ���� ���ߴ� ���α׷��� �ۼ��Ͻÿ�
	// ��, ����ڰ� �Է��� ���� �߻��� �������� ������ "��ū���� �Է��ϼ���"��� �޽�����,
	// �������� ū ���̸� "�� ���� ���� �Է��ϼ���" ��� �޽����� ����� �� ���ο� ���� �Է� �޴´�
	// ������ ����ڰ� �Է��� ���� ������ "�����Դϴ�"��� �޽����� �׶����� �õ��� Ƚ���� ����Ѵ�.
	// (while�� ���)
	public void homework03() {

		int rnd = (int) (Math.random() * 50) + 1;
		int tr = 1;

		while (true) {

			System.out.println("���ڸ� �Է��ϼ���: ");
			int num = sc.nextInt();
			int re = tr++;

			if (rnd < num) {
				System.out.println("��ū�����Է��ϼ���");
			} else if (rnd > num) {
				System.out.println("�����������Է��ϼ���");
			} else if (rnd == num) {
				System.out.println("�����Դϴ�");

				System.out.println("Ƚ��:" + re);
				break;
			}

		}

	}

	// ����4] �� ���� �ֻ����� ������ ��, ���� ���� 6�� �Ǵ� ��� ����� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	// (for��)
	public void homework04() {
		for (int x = 1; x <= 5; x++) {
			for (int y = 1; y <= 6; y++) {

				if ((1 * x) + (1 * y) == 6) {
					System.out.println("6�� ��: " + x + "+" + y);
				}

			}
		}
	}

	// ����1]10��, 50��, 100��¥�� �������� 860���� �����ϴ� ����� ��� ����Ͻÿ�.
	// �� ��� ������ 1�� �̻� ����ؾ� �Ѵ�.(for�� ���)
	public void homework01() {
		for (int x = 1; x <= 86; x++) {
			for (int y = 1; y <= 18; y++) {
				for (int z = 1; z <= 9; z++)

					if ((x * 10) + (y * 50) + (z * 100) == 860) {
						System.out.println(" ����=10��:" + (x * 10) + " 50��:" + (y * 50) + " 100��:" + (z * 100));
					}
			}
		}
	}
}
