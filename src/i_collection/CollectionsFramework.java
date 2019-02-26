package i_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class CollectionsFramework 
{
	public static void main(String[] args) 
	{
		/*
		 * 1. CollectionsFramework
		 *  - Collections	: 다수의 데이터
		 *  - Framework		: 표준화된 프로그래밍 방식
		 *  
		 * 2. List
		 *  - Vector		: ArrayList의 구버전
		 *  - ArrayList		: 저장순서 유지, 중복 혀용
		 *  - LinkedList	: 데이터 추가 및 삭제시간 단축
		 *  - Stack			: LIFO(Last In First Out)
		 *  - Queue			: FIFO(First In First Out)
		 *  
		 * 3. Set
		 *  - HashSet		: 중복 허용 안함, 저장순서 유지 안함
		 *  - TreeSet		: 정렬, 검색 기능 향상
		 *  
		 * 4. Map
		 *  - HashTable		: HashMap의 구버전
		 *  - HashMap		: 키(Key)와 값(value)을 한쌍으로 저장
		 *  - TreeMap		: 정렬, 검색 기능 향상
		 */
		
		LinkedList ll = new LinkedList();
		ArrayList<ArrayList<Integer>> list3 = new ArrayList<ArrayList<Integer>>(); // int형 2차원 배열
		list3.add(new ArrayList<Integer>());
		list3.add(new ArrayList<Integer>());
		ArrayList<Integer> al = list3.get(0);
		al.add(10);
		list3.get(0).add(10);
		System.out.println(list3.get(0));
		System.out.println(list3.get(1));
		
		for(int i=0;i<list3.size();i++)
		{
			ArrayList<Integer> list4 = list3.get(i);
			for(int j=0;j<list4.size();j++)
			{
				System.out.println(list4.get(j));
			}
		}
		

	}
}
