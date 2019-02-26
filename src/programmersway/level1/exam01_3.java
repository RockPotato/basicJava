package programmersway.level1;

import java.util.Scanner;

public class exam01_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number= sc.nextInt();
		for(int i=1;i<=number;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.printf("%4d",j);
			}
			System.out.println();
		}
	}
}
