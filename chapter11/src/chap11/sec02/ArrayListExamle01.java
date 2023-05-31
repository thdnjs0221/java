//Collection ��ü
//-List, Set, Map���� �з�            List, Set ������ �Ȱ��� �������̽���(��üx)
//1) List: ��������(1���� �迭 ����)
// - ÷��(index)�� ����ϸ� �ߺ��� ����Ͽ� �ڷ� ����
// - ��ü�� ������
// - List�� interface�̰� �̸� ������ ��ü�� ArrayList, Vector, Stack, LinkedList, Queue ���� ������
// - ArrayList: ���� �θ� ����
// - �ֿ�޼���:
// (1) add (Object obj): ArrayList�� ����
// (2) get (int idx): ArrayList idx��° ����� �ڷ� ��ȯ
// (3) boolean contains(Object obj): ArrayList�� obj�� �ִ��� ���ι�ȯ
// (4) boolean isEmpty: ArrayList�� ��� �ִ��� ���� ��ȯ
// (5) void clear(): ��� ��ü ����
// (6) E remove(int idx) : idx��° ��ü ���� 
// (7) boolean remove(Object obj): obj ��ü�� ã�� ����
// (8) int size():ArrayList�� �����ϴ� ��ü�� �� ��ȯ
package chap11.sec02;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExamle01 {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		Person p1=new Person("�̼���");
		
		list.add("ȫ�浿");
		list.add(100);    // int class ��ü�� �ڵ�����ȯ(auto boxing)
		list.add(false);  //  boolean class �ڵ�����ȯ
		list.add(p1);
		list.add(new Person("������"));
		
		System.out.println(list);
		System.out.println("[�Ϲ� for��]");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("[����� ���� for��]");
		for (Object obj:list) {				//�迭,List ��� ����(map x)
			System.out.println(obj);
		}
		System.out.println("[�ݺ���(Iterartor) ���]");
		Iterator iter=list.iterator();
		while(iter.hasNext()) { 			//���� �ڷᰡ �ִ���
			System.out.println(iter.next());
		}
	}
}
class Person {
	String name;
	
	Person(String name){
		this.name=name;
	}
	@Override
	public String toString() {
		return name;
	}
}