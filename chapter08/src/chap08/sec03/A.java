package chap08.sec03;

interface I{
	public void methodB(); //�������̽��� b�� ����
}

public class A {//�����
	public void methodA (I i) {  //a�� �������̽��ۿ� ��
		i.methodB();
	}

}
class B implements I {//������
	@Override
	public void methodB() {   //�������̽� ���������ذ�
		System.out.println("methodB()");
	}
}
