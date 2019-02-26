package programmersway.level1;

import java.util.Scanner;

public class exam01_9 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number= sc.nextInt();
		for(int i=0;i<number;i++)
		{
			for(int j=1;j<=number-i;j++)
			{
				System.out.printf("%4d",i+j);
			}
			for(int j=0;j<i;j++)
			{
				System.out.printf("%4d",j+1);
			}
			System.out.println();
		}
	}
}
