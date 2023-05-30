package chap11.sec01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

//Class: Ŭ������ ���� ��ȯ
public class ClassExample {

	public static void main(String[] args) throws Exception {
		Class c1 = Member.class;
		Class c2 = Byte.class;
//		System.out.println("Ŭ���� �̸�: "+c2.getName());
//		System.out.println("Ŭ���� �̸�(��Ī): "+c2.getSimpleName());
//		System.out.println("�Ҽ� ��Ű����: "+c2.getPackage());

		// �����ڸ޼���-�迭�� ��ȯ
		Constructor[] constructors = c1.getConstructors();
		Member member = null;
		for (Constructor c : constructors) {
			member = (Member) c.newInstance("1");
			System.out.println(member.getModifiers());
		}

		// ����ʵ�- �迭�� ��ȯ
		Field[] fields = c1.getFields();// public field �� ��ȯ
		Field[] fieldInher = c1.getDeclaredFields();// ��� ���� �ʵ常 ��ȯ
		for (Field field : fields) {
			System.out.println("�ʵ��: " + field.getName());
			System.out.println("�ʵ�Ÿ��:" + field.getType());
		}
		// �޼���- �迭�� ��ȯ
		Method[] methods = c1.getDeclaredMethods();// ��ӹ��� �޼���
													// ������ �޼��� ��ȯ
		for (Method method : methods) {
			System.out.println("�޼����: " + method.getName());
			System.out.println("��ȯŸ��:" + method.getReturnType());
			
		}
		


	}
}
