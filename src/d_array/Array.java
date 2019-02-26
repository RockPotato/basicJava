package d_array;

import java.util.*;

public class Array 
{
	public static void main(String[] args) 
	{
		/*
		 * 1. 배열
		 *  - 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
		 *  
		 * 2. 배열의 선언
		 *  - int[] number = new int[5];//기본값으로 초기화된다.
		 *  - int number[] = new int[]{10,20,30,40,50};
		 *  - int[] number = {10,20,30,40,50};
		 *  
		 * 3. 배열의 사용
		 *  - 변수명[인덱스](number[0])
		 *  - 인덱스는 0부터 시작
		 *  - 배열의 길이는 변수명.length(number.length)
		 *  - 배열의 출력은 Arrays.toString();
		 *  - 배열의 정렬은 Arrays.sort();
		 *  - 배열의 복사는 System.arraycopy();
		 *  - 향상된 for문 for(변수선언 : 배열){}
		 * 
		 */
		
/*		int[] numbers = new int[5];
		int numbers2[]= new int[]{1,2,3,4,5};
		int[] number3 = {1,2,3,4,5};
		
		System.out.println(Arrays.toString(numbers));
		
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = numbers[0] + numbers[1];
		numbers[3] = numbers[2] * 2;
		numbers[4] = numbers[3] > numbers[2] ? numbers[3] : numbers[2];
		
		for(int i=0; i < numbers.length; i++)
		{
			System.out.println(numbers[i]);
		}
		
		for(int i=0; i < numbers.length; i++)
		{
			numbers[i] = numbers.length-i;
		}
		System.out.println(Arrays.toString(numbers));
		
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		int[] copyNumbers = new int[10];
		System.arraycopy(numbers,0 , copyNumbers, 0, 5);
		System.out.println(Arrays.toString(copyNumbers));
		
		for(int number : numbers)
		{
			System.out.println(number);
		}
		for(int number : numbers)
		{
			number=10;//numbers에 대입되지 않는다.
		}
		System.out.println(Arrays.toString(numbers));
		*/
		int sum=0;
		float avr=0f;
		
		/*int score[]={50,62,74,83,90}; //예제 풀이
		int max=score[0];
		int min=score[0];
		int num[]={0,1,2,3,4,5,6,7,8,9};
		int tmp=0;
		int num1=0;
		int num2[]=new int[45];
		int lotto[]=new int[6];
		int ran=0;
		for(int i=0;i<num2.length;i++)
		{
			num2[i]=i+1;
		}
		
		for(int i=0;i<lotto.length;i++)
		{
			tmp=(int)(Math.random()*45);
			num2[i]=num2[tmp];
			num2[tmp]=tmp;
		}
		for(int i=0;i<6;i++)
		{
			System.out.print(num2[i]+" ");
		}
		System.out.println();
		for(int i=0;i<lotto.length;i++)
		{
			ran=(int)(Math.random()*45+1);
			lotto[i]=ran;
		}
		for(int i=0;i<lotto.length;i++)
		{
			for(int j=0;j<lotto.length;j++)
			{
				if(j!=i&&lotto[i]==lotto[j])
				{
					ran=(int)(Math.random()*45+1);
					lotto[j]=ran;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
		for(int i=0;i<100;i++)
		{
			tmp=(int)(Math.random()*10);
			for(int j=0;j<10;j++)
			{
				if(num[j]==tmp)
				{
					num1=num[i%10];
					num[i%10]=tmp;
					num[j]=num1;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(num));
		for(int i=0;i<num.length;i++)
		{
			int tmp1=(int)(Math.random()*10);
			tmp =num[i];
			num[i]=num[tmp1];
			num[tmp1]=tmp;
		}
		System.out.println(Arrays.toString(num));
		for(int i=0;i<score.length;i++)
		{
			sum+=score[i];
			if(score[i]>max)
			{
				max=score[i];
			}
			if(score[i]<min)
			{
				min=score[i];
			}
		}
		
		avr=sum/(float)score.length;
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avr);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);*/
		
		Math.random();//0이상 1미만의 값을 반환
		//문제 1. 1 ~ 10 사이의 난수를 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
		/*int cnt[]=new int[10];
		for(int i=0;i<500;i++)
		{
			int n=(int) (Math.random()*10)+1;
			cnt[n-1]++;			
		}
		System.out.println(Arrays.toString(cnt));*/
		
		//문제 2.1번의 최소값,최대값,반복횟수를 입력받아 각 숫자가 생성된 횟수를 출력해주세요.
		inputRandomCount();
		
	}
	
	private static void inputRandomCount(){
		System.out.println("최소값 입력 : ");
		Scanner sc=new Scanner(System.in);
		int min=sc.nextInt();
		System.out.println("최대값 입력 : ");
		int max=sc.nextInt();
		System.out.println("반복횟수 입력 : ");
		int cyc=sc.nextInt();
		int cnt[]=new int[max-min+1];/*최솟값 자신도포함*/
		
		for(int i=0;i<cyc;i++)
		{
			int n=(int) (Math.random()*(max-min+1))+min;
			cnt[n-min]++;
			System.out.println(n);
		}
		System.out.println(Arrays.toString(cnt));
	}
}
