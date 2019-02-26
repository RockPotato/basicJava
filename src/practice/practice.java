package practice;

import java.util.ArrayList;
import java.util.HashMap;

public class practice {
	public static void main(String[] args) {
		// 숙제1. 우리반 모두의 Java,Oracle,HTML,JQuery,JSP 성적을 50~100까지 랜덤으로 생성시키고,
		// 석차순으로 석차, 이름, 과목별점수, 총점,평균을 출력해주세요.
		exp();
		scoreSort();
	}

	static void exp() {
		System.out.println("이름\t" + "번호\t" + "Java\t" + "Oracle\t" + "HTML\t"
				+ "JQuery\t" + "JSP\t" + "총점\t" + "평균\t" + "석차\t");
	}

	private static void scoreSort() {
		HashMap<Integer, Object> namelist = new HashMap<Integer, Object>();
		String[] name = new String[] { "강현욱", "김난경", "신유수", "김도현", "김주은",
				"김지연", "김현기", "김현지", "노대현", "동혜원", "박경훈", "박선희", "박정권", "박지선",
				"윤상호", "윤한수", "이대용", "이준호", "이한화", "임재우", "장구현", "진민규", "하준용",
				"한상호", "황수정" };

		for (int i = 0; i < name.length; i++) { // 이름 복사
			namelist.put(i, name[i]);
		}

		ArrayList<ArrayList<Object>> scorelist = new ArrayList<ArrayList<Object>>(); // 과목점수와 총점평균
		for (int i = 0; i < 5; i++) { // 5과목 난수 생성
			scorelist.add(new ArrayList<Object>());
			for (int j = 0; j < namelist.size(); j++) {
				scorelist.get(i).add((int) (Math.random() * 50) + 50);
			}
		}

		scorelist.add(new ArrayList<Object>());// 총점
		scorelist.add(new ArrayList<Object>()); // 평균
		for (int i = 0; i < scorelist.get(0).size(); i++) {
			int sum = 0;
			for (int j = 0; j < scorelist.size() - 2; j++) {
				sum += (int) scorelist.get(j).get(i); // 총점 계산
			}
			scorelist.get(scorelist.size() - 2).add(sum); // 총점 입력
			scorelist.get(scorelist.size() - 1).add(sum / 5); // 평균 입력
			sum = 0; // 다음 사람 총점 초기화
		}
		scorelist.add(new ArrayList<Object>());// 석차
		for (int i = 0; i < scorelist.get(0).size(); i++) // 석차 구하기 배열
		{
			scorelist.get(scorelist.size() - 1).add(1); // 1로 초기화
		}
		for (int i = 0; i < scorelist.get(scorelist.size() - 3).size(); i++)// 석차구하기
		{
			int temp = 1; // 석차 구하기 하기위한 임시 변수
			for (int j = 1; j < scorelist.get(scorelist.size() - 3).size(); j++) {
				if ((int) scorelist.get(scorelist.size() - 3).get(i) < (int) scorelist
						.get(scorelist.size() - 3).get(j)) {
					temp++;
					scorelist.get(scorelist.size() - 1).set(i, temp);
				}
			}
		}
		ArrayList<Object> sortscore = new ArrayList<Object>();
		for (int i = 0; i < scorelist.get(scorelist.size() - 1).size(); i++) {
			for (int j = 0; j < scorelist.get(scorelist.size() - 1).size(); j++) {
				if ((int) scorelist.get(scorelist.size() - 1).get(j) == i) {
					sortscore.add(j);
				}
			}
		}

		for (int i = 0; i < scorelist.get(0).size(); i++) {
			System.out.print(namelist.get(sortscore.get(i)) + "\t"
					+ ((int)sortscore.get(i)+1)   + "\t");
			for (int j = 0; j < scorelist.size(); j++) {
				System.out.print(scorelist.get(j).get((int) sortscore.get(i))
						+ "\t");
			}

			System.out.println();
		}
	}
}