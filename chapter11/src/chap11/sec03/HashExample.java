package chap11.sec03;

import java.util.HashMap; //class
import java.util.Iterator;
import java.util.Map; //interface
import java.util.Set;

public class HashExample {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		// 자료 저장
		map.put(1000, "홍길동");
		map.put(1001, "이순신");
		map.put(1002, "강감찬");

		String name = map.get(1001); // 특정 키값을 알고 있을때 지정.
		System.out.println(name);

		
		//전체 검사 방법
		Set<Integer> keySet = map.keySet();  //map의 모든 key를 가져와서 keyset에 저장
		Iterator<Integer> iter = keySet.iterator();//keySet.iterator()를 호출하여 keySet에서 Iterator를 생성합니다. Iterator는 순차적으로 keySet의 요소를 검사할 수 있는 도구입니다.
		while (iter.hasNext()) {//has next 다음 읽어올 자료가 존재하는지 참 거짓
			Integer keys = iter.next();//next 꺼내오는 메소드
			System.out.println(keys + "=>" + map.get(keys));//value를 알고싶으면  .get쓰기
			
		}
	}

}
