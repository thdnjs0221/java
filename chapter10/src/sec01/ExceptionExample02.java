package sec01;

public class ExceptionExample02 {

	public static void main(String[] args) {
		try {
			throw new CustomException("���� ���� ���� Ŭ����"); // throw ������ ���� �߻� ���Ѷ�
		}catch(CustomException e) {
			e.printStackTrace();
		}
	}
}
//����� ���� ����Ŭ����
//�Ϲݿ���Ŭ����: Exception Ŭ������ ��� �޾� ����
//���࿹��Ŭ����: RuntimeException Ŭ������ ��ӹ޾� ����
class CustomException extends Exception{
	CustomException(){}  //�Ű��������� ����Ŭ���� ���鶧 �� �Ⱦ� 
	CustomException(String message){ 
		super(message);		
	}
}