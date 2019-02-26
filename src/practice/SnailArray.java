package practice;

import java.util.Scanner;

public class SnailArray {

	public static void main(String[] args) {
		int value = 1; // 배열을 채워 나갈 값
		int row = 0, col = -1; // 행(row), 열(col) 을 나타내는 index
		int inc = 1; // index 의 증감량을 나타냄. 1 또는 -1 을 가질 수 있음
		int n;
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			n = sc.nextInt();
			if(n>0)
			{
				break;
			}
		}
		
		
		int[][] arr = new int[n][n];
		while (n > 0) {
			for (int i = 0; i < n; i++) {
				col += inc; // 열 index 를 inc 만큼 증가시킴. inc가 -1이면 감소
				arr[row][col] = value;
				value++;
			}
			n--; // 전진하는 양 1 감소
			if (n == 0)
				break; // 전진하는 양이 0이 되면 while 루프 빠져나옴
			for (int i = 0; i < n; i++) {
				row += inc; // 행 index 를 inc 만큼 증가시킴. inc 가 -1이면 감소
				arr[row][col] = value;
				value++;
			}
			inc *= -1; // inc 부호바꿈. 증가가 감소로 혹은 감소가 증가로 바뀌는 효과 }
		}

		for (int i1 = 0; i1 < arr.length; i1++) {
			for (int j1 = 0; j1 < arr[i1].length; j1++) {
				System.out.printf("%3d", arr[i1][j1]);
			}
			System.out.println();
		}
	}
}
