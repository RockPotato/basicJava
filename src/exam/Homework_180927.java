package exam;

public class Homework_180927 {

	public static void main(String[] args) {
		//숙제 1. 숫자를 입력받아 1부터 입력받은 수까지 홀수의 합과 짝수의 합을 출력하시오.
		/*답 :	int num=0;
			int oddsum=0;
			int evensum=0;
			System.out.println("숫자 입력 : ");
			Scanner sc = new Scanner(System.in);
			num=sc.nextInt();
			for(int i=1;i<=num;i++)
			{
				if(i%2==0)
				{
					evensum+=i;
				}
				else
				{
					oddsum+=i;
				}
			}
			System.out.println("홀수의 합 : "+oddsum);
			System.out.println("짝수의 합 : "+evensum);*/
		//숙제 2. 직각이 오른쪽에 있는 삼각형 모양의 별을 출력해주세요.
		/*
		 *     *
		 *    **
		 *   ***
		 *  ****
		 * *****
		 */
		/*답 :	int cnt=1;
				for(int a=0;a<5;a++)
				{
					for(int i=4;i>a;i--)
					{
						System.out.print(" ");
					}
					for(int j=0;j<cnt;j++)
					{
						System.out.print("*");
					}
					cnt++;
					System.out.println();
				}*/
		
		//숙제 3. 직각이 오른쪽에 있는 역삼각형 모양의 별을 출력해주세요.
		/*
		 * *****
		 *  ****
		 *   ***
		 *    **
		 *     *
		 */
		/*답 : 	int cnt=5;
				for(int a=0;a<5;a++)
				{
					for(int i=0;i<a;i++)
					{
						System.out.print(" ");
					}
					for(int j=0;j<cnt;j++)
					{
						System.out.print("*");
					}
					cnt--;
					System.out.println();
				}*/
		//숙제 4. 이등변 삼각형 모양의 별을 출력해주세요.
		/*
		 *     *
		 *    ***
		 *   *****
		 *  *******
		 * *********
		 */
		/*답 :	int cnt=1;
				for(int a=0;a<5;a++)
				{
					for(int i=4;i>a;i--)
					{
						System.out.print(" ");
					}
					for(int j=0;j<cnt;j++)
					{
						System.out.print("*");
					}
					cnt+=2;
					System.out.println();
				}*/
		//숙제 5. 역 이등변 삼각형 모양의 별을 출력해주세요.
		/*
		 * *********
		 *  *******
		 *   *****
		 *    ***
		 *     *
		 */
		/*답 : int cnt=9;
				for(int a=0;a<5;a++)
				{
					for(int i=0;i<a;i++)
					{
						System.out.print(" ");
					}
					for(int j=0;j<cnt;j++)
					{
						System.out.print("*");
					}
					cnt-=2;
					System.out.println();
				}*/
/*		for(int i =9;i>=1;i-=2)
		{
			for(int j=0;j<9-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<2*i-j;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		/*졸업예정증명서
		통장사본
		증명사진*/
	}

}
