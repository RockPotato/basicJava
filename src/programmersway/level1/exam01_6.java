package programmersway.level1;

import java.util.Scanner;

public class exam01_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number= sc.nextInt();
		int temp=1;
		for(int i=0;i<number;i++)
		{
			for(int j=1;j<=number-i;j++)
			{
				System.out.printf("%4d",temp);
				temp++;
			}
			System.out.println();
		}
	}
}
