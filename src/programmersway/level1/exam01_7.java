package programmersway.level1;

import java.util.Scanner;

public class exam01_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number= sc.nextInt();
		for(int i=0;i<number;i++)
		{
			for(int j=1;j<=number;j++)
			{
				System.out.printf("%4d",i+j);
			}
			System.out.println();
		}
	}
}
