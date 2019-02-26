package d_array;

import java.util.Arrays;

public class Sort 
{
	public static void main(String[] args) 
	{
		/* 
		 * 선택정렬 : 첫번째 숫자부터 그 뒤의 모든 숫자들과 비교해서 작은 수와
		 * 			자리 바꾸기를 반복해 앞에서부터 작은 수를 채워나가는 방식
		 * 버블정렬 : 첫번째 숫자부터 바로 뒷 숫자와 비교해서 크면 자리를
		 * 			바꾸기를 반복해 뒤에서부터 큰 수를 채워나가는 방식
		 * 삽입정렬 : 두번째 숫자부터 그 앞의 모든 숫자들과 비교해서 큰 수들을 
		 * 			뒤로 밀고 중간에 삽입하는 방식
		 * 석차구하기 : 모든 점수가 1등으로 시작해서 다른 점수들과 비교해
		 * 			  자신의 점수가 작으면 1씩 증가시키는 방식
		 */
		
		int[] numbers = new int[10];
		
		for(int i=0;i<numbers.length;i++)
		{
			numbers[i] = i +1;
		}
		
		shuffle(numbers);
		System.out.println(Arrays.toString(numbers));
		
//		selectSort(numbers); //선택정렬
//		bubbleSort(numbers); //버블정렬
//		insertSort(numbers); //삽입정렬
		printRank(numbers); //석차구하기
	
		
	}

	private static void printRank(int[] numbers) 
	{
		int[] res=new int[numbers.length];
		for(int i=0;i<res.length;i++)
		{
			res[i] = 1;
		}
		for(int i=0;i<numbers.length;i++)
		{
			for(int j=0;j<numbers.length;j++)
			{
				if(numbers[i]<numbers[j])
				{
					res[i]++;
				}
			}
		}
		System.out.println("순위 : "+Arrays.toString(res));
	}

	private static void insertSort(int[] numbers) 
	{
		/*for(int i=1;i<numbers.length;i++)
		{
			int temp=numbers[i];
			int j=0;
			for(j=i-1;j>=0;j--)
			{
				if(temp < numbers[j])
				{
					numbers[j+1] = numbers[j];
				}
				else
				{
					break;
				}	
			}
			numbers[j+1]=temp;
		}*/
		
		for(int i=1;i<numbers.length;i++)
		{
			int temp=numbers[i];
			int cnt=0;
			boolean flag=false;
			for(int j=i;j>0;j--)
			{
				if(temp<numbers[j-1])
				{
					numbers[j]=numbers[j-1];
					cnt=j-1;
					flag=true;
				}
				else if(temp>numbers[j-1])
				{
					break;
				}
				System.out.println(Arrays.toString(numbers)+cnt+','+temp);
			}
			if(flag==true)
			{
				numbers[cnt]=temp;	
			}
		}
		System.out.println(Arrays.toString(numbers));
	}
	private static void bubbleSort(int[] numbers) 
	{
		for(int i=numbers.length-1;i>=0;i--)
		{
			for(int j=0;j<i-1;j++)
			{
				if(numbers[j]>numbers[j+1])
				{
					int temp=numbers[j];
					numbers[j]=numbers[j+1];
					numbers[j+1]=temp;
				}
			}
		}
	}

	private static void selectSort(int[] numbers) 
	{
		for(int i=0;i<numbers.length-1;i++)
		{
			for(int j=i+1;j<numbers.length;j++)
			{
				if(numbers[i]>numbers[j])
				{
					int temp=numbers[j];
					numbers[j]=numbers[i];
					numbers[i]=temp;
				}
			}
		}
	}

	private static void shuffle(int[] numbers) 
	{
		for(int i=0;i<numbers.length*10;i++)
		{
			int random = (int)(Math.random()*numbers.length);
			int temp = numbers[0];
			numbers[0]=numbers[random];
			numbers[random]=temp;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
