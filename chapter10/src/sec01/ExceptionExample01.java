package sec01;

public class ExceptionExample01 {

	public static void main(String[] args) {
		try {
			methodA();
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	public static void methodA() throws ArithmeticException, Exception {
		int res = 0;
		int num = 10;
	//	try {
			for (int i = 0; i < 15; i++) {
				res = 100 / num;
				System.out.println(res);
				num--;

			}
//		} catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//		} catch (ArithmeticException e) { // ����������
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			System.out.println("�̰��� ������ ����Ǵ� ����Դϴ�");
		}

	}

//}
