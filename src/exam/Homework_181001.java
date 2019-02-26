package exam;

import java.util.Scanner;

public class Homework_181001 {

	public static void main(String[] args) {
		//문제1. 숫자를 입력받아 입력받은 숫자에 3자리 마다 콤마(,)를 붙여 출력
		setComma();
		//문제2. 하이픈(-)이 있는 전화번호를 입력받아 하이픈을 제거해 출력
//		removeHyphen();
		//문제3. 하이픈(-)이 없는 전화번호를 입력받아 하이픈을 삽입
//		setHyphen();
	}
	private static void setHyphen() {
		int hyp=2;
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] num=str.toCharArray();
		char[] res=new char[num.length+hyp];
		int j=0;
		int a=0;
		for(int i=0;i<res.length;i++)
		{
			if(j==3&&i<6)
			{
				res[i]='-';
				
				j=0;
			}
			else if(j==4)
			{
				res[i]='-';
				j=0;
			}
			else if(a<num.length)
			{
				res[i]=num[a];
				a++;
				j++;
			}
			System.out.print(res[i]);
		}
		
	}

	private static void removeHyphen() {
		System.out.print("하이픈이 있는 전화번호 입력");
		Scanner sc = new Scanner(System.in);
		String pnum =sc.nextLine();
		String[] spl=pnum.split("-");
		for(int i=0;i<spl.length;i++)
		{
			System.out.print(spl[i]);
		}
		
		
	}

	private static void setComma() {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		
		char[] cnum=num.toCharArray();
		int cnt=cnum.length/3;
		char[] res=new char[cnum.length+cnt];
		cnt=0;
		int j=cnum.length-1;
		for(int i =res.length-1;i>=0;i--)
		{
			
			if(i!=0&&cnt==3)
			{
				res[i]=',';
				cnt=0;
			}
			else if(j>=0)
			{
				res[i]=cnum[j];
				cnt++;
				j--;
			}
		}
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]);
		}
		
		
	}
}
