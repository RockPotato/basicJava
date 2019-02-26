package c_statement;

import java.util.Scanner;

public class RepetitiveStatement {
	public static void main(String[] args) {
		/*
		 * 1. 반복문 
		 * 	- for,while, do-while 
		 * 	- 규칙적으로 반복되는 작업을 할 때 사용한다. 
		 * 	- 조건식이 만족하는 동안 계속 반복된다.
		 * 
		 * 2. for문 - 반복횟수를 알 수 있을 때 사용한다. 
		 * 	- 조건식이 세부분으로 나뉘어 있다. (초기화; 조건식; 증감식) 
		 * 	- 1. 변수를 초기화 한다. 
		 * 	- 2. 조건식을 주행해서 값을 얻는다. 
		 * 	- 3. 조건식의 값이 true이면 {}블럭안의 문장을 수행한다. 
		 * 	- 4. 증감식을 수행한다. 
		 * 	- 5. 조건식을 수행해서 값을 얻는다. 
		 * 	- 6. 조건식의 값이 false이면 for문을 벗어난다.
		 * 
		 * 3. while문 
		 * 	- 반복횟수를 알 수 없을때 사용한다. 
		 * 	- 조건식이 있어야 한다. 
		 * 	- 조건식의 값이 true이면 {}안의 문장을 수행하고 false이면 while문을 벗어난다.
		 * 
		 * 4. do-while문 
		 * 	- while문의 변형이다.(while문과 동일한 특징을 가진다.) 
		 * 	- while문과는 조건식과 {}의 순서가 다르다. 
		 * 	- 최소 1번의 수행이 보장된다.
		 * 
		 * 5. break와 continue 
		 * 	- 반복문 안에서 특정조건에 반복문을 탈출하기 위해 사용한다. 
		 * 	- 자신이 속한 가장 가까운 반복문 하나만 탈출한다. 
		 * 	- break는 반복문을 완전히 탈출한다. 
		 * 	- continue는 현재 수행하고 있는 반복회차만 탈출한다.
		 */

		for (int i = 0; i < 10; i++) 
		{
			System.out.println(i);
		}

		int total = 0;
		for (int i = 1; i <= 100; i++)
		{
			// total = total +i;
			total += i;
		}

		System.out.println(total);

		for (int i = 100; i >= 1; i--)
		{
			total += i;
		}

		System.out.println(total);

		for (int i = 1; i <= 9; i++) 
		{
			System.out.println("2 x " + i + " : " + (2 * i));
		}

		// 문제1. 0부터 99까지 1씩 증가하는 반복문을 만들어주세요.
		total = 0;
		
		for (int i = 0; i < 100; i++) 
		{
			total++;
		}
		System.out.println(total);
		
		// 문제2. 1부터 50까지 3씩 증가하는 반복문을 만들어주세요.
		total = 0;
		for (int i = 1; i <= 50; i += 3) {
			total += i;
		}
		System.out.println(total);
		
		// 문제3. 100부터 1까지 1씩 감소하는 반복문을 만들어주세요.
		for (int i = 100; i > 0; i--) 
		{
			System.out.println(i);
		}
		
		// 문제4. 1부터 1024까지 2배씩 증가하는 반복문을 만들어주세요.
		for (int i = 1; i <= 1024; i *= 2)
		{
			System.out.println(i);
		}
		
		// 문제5. 1부터 100까지 짝수의 합을 출력해주세요.
		total = 0;
		for (int i = 1; i <= 100; i++) 
		{
			if (i % 2 == 0) 
			{
				total += i;
			}
		}
		System.out.println(total);
		
		// 문제 6. 1부터 100까지 3의 배수의 합을 출력해주세요.
		total = 0;
		for (int i = 1; i <= 100; i++) 
		{
			if (i % 3 == 0) 
			{
				total += i;
			}
		}
		System.out.println(total);

		// 문제 7. 구구단 3단을 출력해주세요.
		int num = 3;
		for (int i = 1; i < 10; i++) 
		{
			System.out.println(num + " * " + i + " = " + num * i);
		}
		for (int i = 0; i <= 5; i++) 
		{
			for (int j = 0; j < i; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 문제 8. 구구단 전체를 출력해주세요.
		for (num = 2; num < 10; num++) 
		{
			for (int i = 1; i < 10; i++) 
			{
				System.out.println(num + " * " + i + " = " + num * i);
			}
			System.out.println();
		}

		// 문제 9. 역삼각형 모양의 별을 출력해주세요.
		for (int i = 5; i > 0; i--) 
		{
			for (int j = 0; j < i; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		int a=0;
		while(a<10)
		{
			System.out.println(a);
			a++;
		}
/*		num =0;
		int sum =0;
		while(true)
		{
			System.out.print("값 입력 : ");
			Scanner sc =new Scanner(System.in);
			num=sc.nextInt();
			if(num==0)
			{
				System.out.println("합은 : "+sum);
				break;
			}
			else
			{
				sum+=num;
			}
		}
		do
		{
			System.out.println(a);
			a++;
		}while(a < 20);*/
		int res = 0;
		int ans = 0;
		res=(int)(Math.random()*100)+1;
		
		do
		{
			System.out.print("1부터 100까지의 정수 입력 :");
			Scanner sc = new Scanner(System.in);
			ans=sc.nextInt();
			if(res==ans)
			{
				System.out.println("정답!");
			}
			else if(res>ans)
			{
				System.out.println("정답보다 작습니다.");
			}
			else
			{
				System.out.println("정답보다 큽니다.");
			}
		}while(res!=ans);
		outer :
			for(int i=2;i<9;i++)
			{
				for(int j=5;j<= 9;j++)
				{
					if(j==5)
					{
						break outer;
	//					break
	//					continue outer
//						continue;					
					}
					System.out.println(i+ " " +j +" "+i*j);
				}
				System.out.println();
			}
	}
}
