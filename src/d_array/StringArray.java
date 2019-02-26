package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		
		/*
		 * 1. String의 주요 메서드
		 *  - equals() : 문자열의 내용이 같은지 확인한다.
		 *  - toCharArray() : 문자열을 문자배열로 반환한다.
		 *  - length() : 문자열의 길이를 반환한다.
		 *  - charAt() : 문자열에서 해당 인덱스에 있는 문자를 반환한다.
		 *  - substring() : 문자열에서 해당 범위에 있는 문자열을 반환한다.(,전은 이상 ,후는 미만)
		 *  - indexOf() : 문자열 내의 특정 문자열의 인덱스를 반환한다.
		 *  - split() : 문자열을 특정 문자열을 기준으로 나누어 배열로 반환한다.
		 *  - replace() : 문자열 내의 특정 문자열을 원하는 문자열로 변경해 반환한다. 
		 */
		
		/*String str = "abcd,efg";
		char[] charrArray = str.toCharArray();
		System.out.println(charrArray);
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		}
		System.out.println(str.substring(3));
		System.out.println(str.substring(1,4));
		System.out.println(str.substring(0,str.indexOf(",")));
		System.out.println(str.substring(0,str.lastIndexOf(",")));
		
		String[] split = str.split(",");
		System.out.println(Arrays.toString(split));
		System.out.println(str.replace("efg","abcd"));
		
		for(String arg : args)
		{
			System.out.println(arg);
		}*/
		
		//문제1. 숫자를 입력받아 입력받은 숫자에 3자리 마다 콤마(,)를 붙여 출력
//		setComma();
		//문제2. 하이픈(-)이 있는 전화번호를 입력받아 하이픈을 제거해 출력
//		removeHyphen();
		//문제3. 하이픈(-)이 없는 전화번호를 입력받아 하이픈을 삽입
		setHyphen();
		
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
