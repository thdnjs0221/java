package chap11.sec01;

public class ObjectExample {

	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿");
		System.out.println("getinfo(): " + p1.getinfo());
		System.out.println("toString():" + p1.toString());

		// Person p2 = p1;
		Person p2 = new Person("ȫ���");
		if (p2.equals(p1)) {
			// = if (p2.toString().equals(p1.toString)) {
			System.out.println("���� ����");
		} else {
			System.out.println("�ٸ� ����");
		}

	}

}

class Person {
	private String name; // ��������� �ϳ��� �����ϰ����Ҷ� setter getter �޼ҵ� ����ϱ�, �ѹ��� ����ϰ��Ҷ��� toString �޼ҵ� ����ϱ�
							// private����� ���� ������ ������ �޼ҵ�� �ʱ�ȭ,

	Person(String name) { // ������ �޼ҵ�� �ʱ�ȭ , �Ű����� �ִ� ������ �޼ҵ� �����ϱ� �⺻ ������x
		this.name = name;
	}

	String getinfo() {
		return getClass().getName() + '@' + Integer.toHexString(hashCode());
		// Person�� hashCode�޸� �ּҰ� 10������ 16���� ���ڿ��� ��ȯ�ض�
		// hashCode: �޸� �ּҰ�
		// object �ֻ��� Ŭ������ toString�޼ҵ� ������
	}

	@Override
	public String toString() {
		return name;
	}
}
