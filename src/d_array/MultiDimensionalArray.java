package d_array;

import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		/*
		 * 1. 다차원 배열
		 *  - 배열안에 배열을 가지고 있는 형태이다.
		 *  - 2차원 배열은 테이블 형태이다.
		 */
		
		/*int[][] numbers = new int[2][3];
		int numbers2[][] = new int[][]{{1,2,3},{4,5,6}};
		int[] numbers3[] =  { {1,2,3},
							  {4,5,6},
							  {7,8,9} };
		int[][] numbers4 = new int[3][];
		numbers4[0] = new int[3];
		numbers4[1] = new int[4];
		numbers4[2] = new int[10];
		
		numbers[0][0] = 0;
		numbers[0][1] = 1;
		numbers[0][2] = 2;
		numbers[1][0] = 10;
		numbers[1][1] = 11;
		numbers[1][2] = 12;
		
		System.out.println(numbers.length);
		System.out.println(numbers[0].length);
		for(int i=0; i<numbers.length;i++)
		{
			for(int j=0; j<numbers[i].length;j++)
			{
				System.out.print(numbers[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println(Arrays.toString(numbers));
		
		for(int i=0;i<numbers.length;i++)
		{
			System.out.println(Arrays.toString(numbers[i]));
		}
		
		for(int[] numberArr : numbers)//numberArr[0],numberArr[1] {{0,1,2},{10,11,12}}
		{
			for(int number : numberArr)
			{
				System.out.println(number);
			}
		}*/
		//문제 1. 우리반 모두의 Java,Oracle, HTML, JQuery, JSP 성적을
		// 			50~100까지 랜덤으로 생성시키고, 
		String[] name ={"강현욱","김난경","신유수","김도현","김주은","김지연","김현기","김현지","노대현","동혜원",
				"박경훈","박선희","박정권","박지선","윤상호","윤한수","이대용","이준호","이한화","임재우","장구현",
				"진민규","하준용","한상호","황수정"};

		int[][] score = new int[9][25];
		for(int i=0;i<score.length-4;i++)
		{
			for(int j=0;j<score[i].length;j++)
			{
				score[i][j]=(int)(Math.random()*50)+50;
			}
		}
		// 1-1) 이름,과목별 성적, 총점,평균,석차를 출력해주세요.
//		scoreRank();
		// 1-2) 석차순으로 석차, 이름,과목별 성적, 총점,평균을 출력해주세요.
		scoreSort();
	}

	private static void scoreSort() {
		String[][] name = new String[][] {
				{ "강현욱", "김난경", "신유수", "김도현", "김주은", "김지연", "김현기", "김현지",
						"노대현", "동혜원", "박경훈", "박선희", "박정권", "박지선", "윤상호", "윤한수",
						"이대용", "이준호", "이한화", "임재우", "장구현", "진민규", "하준용", "한상호",
						"황수정" },
				{ "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11",
						"12", "13", "14", "15", "16", "17", "18", "19", "20",
						"21", "22", "23", "24", "25" } };
		int[][] score = new int[9][25];
		int rank[] = new int[25];

		for (int i = 1; i < rank.length; i++) // 석차 구하기 배열
		{
			rank[i] = 1;
		}

		for (int i = 2; i < score.length - 2; i++) // 5과목의 랜덤값을 담을 반복문
		{
			for (int j = 0; j < score[i].length; j++) {
				score[i][j] = (int) (Math.random() * 50) + 50;
			}
		}

		for (int j = 0; j < score[0].length; j++)// 총합,평균을 위한 반복문
		{
			for (int i = 1; i < score.length - 2; i++) {
				score[score.length - 2][j] += score[i][j];
				if (i == score.length - 3) {
					score[score.length - 1][j] = score[score.length - 2][j] / 5;
				}
			}
		}

		for (int i = 0; i < rank.length; i++)// 석차구하기
		{
			for (int j = 0; j < score[score.length - 2].length; j++) {
				if (score[score.length - 2][i] < score[score.length - 2][j]) {
					rank[i]++;
				}
			}
		}

		for (int i = 0; i < name[1].length; i++) {
			int num = Integer.parseInt(name[1][i]);
			score[0][i] = num;
			score[1][i] = rank[i];
		}
		// 석차, 이름,과목별 성적, 총점,평균 정렬 전
		System.out.println("이름\t" + "번호\t" + "석차\t" + "Java\t" + "Oracle\t"
				+ "HTML\t" + "JQuery\t" + "JSP\t" + "총점\t" + "평균\t");
		for (int j = 0; j < score[0].length; j++) {
			System.out.print(name[0][j] + "\t");
			for (int i = 0; i < score.length; i++) {
				System.out.printf(score[i][j] + "\t");
			}
			System.out.println();
		}
		int[] sort1 = new int[9];
		int[] sort2 = new int[score[1].length];
		for (int i = 0; i < score[1].length; i++) {
			sort2[i] = score[1][i];
		}
		for (int i = score[1].length - 1; i >= 0; i--) // 정렬
		{
			for (int j = 0; j < i; j++) {
				if (score[1][j] > score[1][j + 1]) {
					for (int a = 0; a < score.length; a++)

					{
						sort1[a] = score[a][j];
						score[a][j] = score[a][j + 1];
						score[a][j + 1] = sort1[a];
					}
				}
			}
		}

		System.out.println();

		// 정렬 후
		System.out.println("이름\t" + "번호\t" + "석차\t" + "Java\t" + "Oracle\t"
				+ "HTML\t" + "JQuery\t" + "JSP\t" + "총점\t" + "평균\t");
		for (int j = 0; j < score[0].length; j++) {
			for (int i = 0; i < score[0].length; i++) {
				int num = Integer.parseInt(name[1][i]);
				if (score[0][j] == num) {
					System.out.print(name[0][num - 1] + "\t");
				}
			}

			for (int i = 0; i < score.length; i++) {
				System.out.printf(score[i][j] + "\t");
			}

			System.out.println();
		}

		System.out.println(Arrays.toString(sort2));
	}

	private static void scoreRank() {
		String[][] name =new String[][]{{"강현욱","김난경","신유수","김도현","김주은","김지연","김현기","김현지","노대현","동혜원",
			"박경훈","박선희","박정권","박지선","윤상호","윤한수","이대용","이준호","이한화","임재우","장구현",
			"진민규","하준용","한상호","황수정"},{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17",
				"18","19","20","21","22","23","24","25"},{"이름","번호","Java","Oracle","HTML","JQuery","JSP","총점","평균","석차"}};
		
		int[][] score = new int[9][25];
		int rank[]=new int[25];
		for(int i=1;i<rank.length;i++)
		{
			rank[i]=1;
		}
		for(int i=1;i<score.length-3;i++)
		{
			for(int j=0;j<score[i].length;j++)
			{
				score[i][j]=(int)(Math.random()*50)+50;
			}
		}
		
		for(int j=0;j<score[0].length;j++)
		{
			for(int i=1;i<score.length-3;i++)
			{
				score[score.length-3][j]+=score[i][j];
				if(i==score.length-4)
				{
					score[score.length-2][j]= score[score.length-3][j]/5;
				}
			}
		}
		
		
		for(int i=0;i<rank.length;i++)
		{
			for(int j=0;j<score[score.length-3].length;j++)
			{
				if(score[score.length-3][i]<score[score.length-3][j])
				{
					rank[i]++;
				}
			}
		}
		
		for(int i=0;i<name[1].length;i++)
		{
			int num =Integer.parseInt(name[1][i]);
			score[0][i]=num;
			score[score.length-1][i]=rank[i];
		}
		for(int i=0;i<name[2].length;i++)
		{
			System.out.print(name[2][i]+"\t");
		}
		System.out.println();
		
		for(int j=0;j<score[0].length;j++)
		{
			System.out.print(name[0][j]+"\t");
			for(int i=0;i<score.length;i++)
			{
				System.out.printf(score[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}
}
