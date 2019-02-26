package exam;

import java.util.Scanner;

public class mainclass {
	public static void main(String[] args)
	{
		Academy daedeok = new Academy();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("현재 시간(시간,분 HH24) 입력 : ");
			for(int i=0;i<daedeok.time.length;i++)
			{
				int num = sc.nextInt();
				daedeok.time[i]=num;
			}
			if(daedeok.time[0]<0||daedeok.time[0]>24)
			{
				System.out.println("시간입력을 잘못하셨습니다.");
			}
			else if(daedeok.time[1]<0||daedeok.time[1]>60)
			{
				System.out.println("분을 잘못입력하셨습니다.");
			}
			if(daedeok.time[0]<9)
			{
				daedeok.timecnt=0;
				daedeok.gotoacademy();
			}
			else if(daedeok.time[0]>=20)
			{
				daedeok.timecnt=0;
				daedeok.gohome();
				sc.close();
				break;
				
			}
			else if((daedeok.time[1]==50&&daedeok.time[0]<12)||(daedeok.time[0]>13&&daedeok.time[1]==20))
			{
				daedeok.timecnt=1;
				daedeok.breaktime();
			}
			else if((daedeok.time[1]==50&&daedeok.time[0]==12))
			{
				daedeok.timecnt=2;
				daedeok.breaktime();
			}
			else
			{
				daedeok.timecnt=0;
				System.out.println("수업중..");
			}
		}
	}
}
