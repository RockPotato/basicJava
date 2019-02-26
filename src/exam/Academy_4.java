package exam;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Academy_4 {
	public static void main(String[] args) throws InterruptedException
	{
		
		
		Academy daedeok = new Academy();
		while(true)
		{
			long curr = System.currentTimeMillis(); 
			SimpleDateFormat sdf2 = new SimpleDateFormat("HHmmss");
			String datetime2 = sdf2.format(new Date(curr));
			System.out.println("현재 시간 : " + datetime2);
			daedeok.input();
			daedeok.allday(daedeok.flag);
			if(daedeok.flag)
			{
				break;
			}
			Thread.sleep(4000);
			long curr2=System.currentTimeMillis();
			int sec=(int) (curr2-curr)/1000;
			System.out.println(sec);
		}
	}
}

class Academy
{
	static String[] teacher = new String[2];
	static String[] Student = new String[25];
	static int[] time=new int[2];
	static int timecnt;
	boolean flag;
	void Academy()
	{
		this.flag=false;
		this.timecnt=0;
	}
	void Academy(String AcademyName)
	{
		this.flag=false;
		this.timecnt=0;
	}
	boolean allday(boolean flag)
	{
		if(this.time[0]<0||this.time[0]>24)
		{
			System.out.println("시간입력을 잘못하셨습니다.");
		}
		else if(this.time[1]<0||this.time[1]>60)
		{
			System.out.println("분을 잘못입력하셨습니다.");
		}
		if(this.time[0]<9)
		{
			this.timecnt=0;
			this.gotoacademy();
		}
		else if(this.time[0]>=20)
		{
			this.timecnt=0;
			this.gohome();
			this.flag=true;
		}
		else if((this.time[1]==50&&this.time[0]<12)||(this.time[0]>13&&this.time[1]==20))
		{
			this.timecnt=1;
			this.breaktime();
		}
		else if((this.time[1]==50&&this.time[0]==12))
		{
			this.timecnt=2;
			this.breaktime();
		}
		else if(((Academy.time[0]==12&&Academy.time[1]>50)||(Academy.time[0]==13&&Academy.time[1]>=0&&Academy.time[1]<=30)))
		{
			this.timecnt=0;
			System.out.println("식사중..");
		}
		else
		{
			this.timecnt=0;
			System.out.println("수업중..");
		}
		return this.flag;
	}
	void input()
	{
		
//		Scanner sc = new Scanner(System.in);
		System.out.println("현재 시간(시간,분 HH24) 입력 : ");
		long curr = System.currentTimeMillis(); 
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH");
		SimpleDateFormat sdf3 = new SimpleDateFormat("mm");
		String[] datetime2= new String[2]; 
		datetime2[0]= sdf2.format(new Date(curr));
		datetime2[1]= sdf3.format(new Date(curr));
		for(int i=0;i<this.time.length;i++)
		{
			int num = Integer.parseInt(datetime2[i]);
			this.time[i]=num;
		}
	}
	void gotoacademy()
	{
		System.out.println("지문 입력 : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(str + " 님이 입실하셨습니다.");
	}
	void gohome()
	{
		System.out.println("퇴실하셨습니다.");
	}
	void breaktime()
	{
		if(timecnt==1)
		{
			System.out.println("쉬세요.");
		}
		if(timecnt==2)
		{
			System.out.println("점심 맛있게 드세요.");
		}
	}
}
