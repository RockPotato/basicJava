package programmersway.level1;

import java.util.Scanner;

public class exam01_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number= sc.nextInt();
		int temp=1;
		for(int i=1;i<=number;i++)
		{
			for(int j=1;j<=number;j++)
			{
				System.out.printf("%4d",temp);
				temp++;
			}
			System.out.println();
		}
	}
}
