package i_collection;

import java.util.ArrayList;

public class ArrayListClass 
{
	public static void main(String[] args) 
	{
		/*
		 * add()	: 마지막 위치에 객체를 추가
		 * get()	: 지정된 위치의 객체를 반환
		 * size()	: 저장된 개체의 수 반환
		 * remove() : 지정된 위치의 객체를 제거
		 */
		ArrayList<Object> list = new ArrayList<Object>();
		
		list.add(1);
		list.add("abc");
		list.add(true);
		list.add(new ArrayListClass());
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("abc");
		list2.add("123");
		
		for(int i=0;i<list2.size();i++)
		{
			System.out.println(list2.get(i));
			list2.remove(i);
		}
		
	}
}
