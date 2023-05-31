package chap11.sec03;

import java.util.HashMap; //class
import java.util.Iterator;
import java.util.Map; //interface
import java.util.Set;

public class HashExample {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		//자료 저장
		map.put(1000, "홍길동");
		map.put(1001, "이순신");
		map.put(1002, "강감찬");
		
		String name=map.get(1001);  //특정 키값을 알고 있을때 지정.
		System.out.println(name);

		Set<Integer> keySet=map.keySet();
		Iterator<Integer> iter=keySet.iterator();
		while(iter.hasNext()) {
			Integer keys=iter.next();
			System.out.println(keys+"=>"+map.get(keys));
		}
	}

}
