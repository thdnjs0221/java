package chap11.sec03;

import java.util.HashMap; //class
import java.util.Iterator;
import java.util.Map; //interface
import java.util.Set;

public class HashExample {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		//�ڷ� ����
		map.put(1000, "ȫ�浿");
		map.put(1001, "�̼���");
		map.put(1002, "������");
		
		String name=map.get(1001);  //Ư�� Ű���� �˰� ������ ����.
		System.out.println(name);

		Set<Integer> keySet=map.keySet();
		Iterator<Integer> iter=keySet.iterator();
		while(iter.hasNext()) {
			Integer keys=iter.next();
			System.out.println(keys+"=>"+map.get(keys));
		}
	}

}
