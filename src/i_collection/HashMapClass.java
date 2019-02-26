package i_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapClass {
	public static void main(String[] args) {
		/*
		 * put()	: 지정된 키와 값을 저장
		 * remove() : 지정된 키로 저장된 값을 제거
		 * get()	: 지정된 키의 값을 저장(없으면 null)
		 * keySet()	: 저장된 모든 키를 Set으로 변환
		 */
		HashMap<String, String> map = new HashMap<String,String>();
		map.put("title","제목");
		map.put("content","내용");
		map.put("user","사용자");
		map.put("user","사용자2");
		
		map.remove("user");
		System.out.println(map.get("title"));
		System.out.println(map.get("content"));
		System.out.println(map.get("user"));
		
		//map에 저장된 모든 내용 출력
		Set<String> keys =map.keySet();
		Iterator<String> itr = keys.iterator();
		while(itr.hasNext())
		{
			String key = itr.next();
			String value = map.get(key);
			System.out.println(key + " : "+value);
		}
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String,Object>>();
		list.add(new HashMap<String,Object>());
		for(int i=0;i<list.size();i++)
		{
			HashMap<String,Object> map2 =list.get(i);
			map2.put("title", "제목");
			map2.put("chair", 1);
			
			System.out.println(map2.get("chair"));
		}
	}
}
