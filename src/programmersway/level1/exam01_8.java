package programmersway.level1;

import java.util.Scanner;

public class exam01_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number= sc.nextInt();
		for(int i=number-1;i>=0;i--)
		{
			for(int j=1;j<=number;j++)
			{
				System.out.printf("%4d",i*number+j);
			}
			System.out.println();
		}
	}
}
