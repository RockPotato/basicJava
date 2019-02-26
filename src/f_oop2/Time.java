package f_oop2;

public class Time 
{
	
	private int hour;
	private int minute;
	private int second;
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		while(hour>=24)
		{
			hour-=24;
		}
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	@Override
	public String toString() {
		
		return hour +" : "+  minute+" : "+ second;
	}
	public void setMinute(int minute) {
		if(minute>59)
		{
			int temp1[]=timeLogic(minute);
			hour+=temp1[0];
			minute=temp1[1];
			while(hour>=24)
			{
				hour-=24;
			}
		}
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public int[] timeLogic(int num){
		//분과 초를 위한 메서드
		int temp[]=new int[2];//몫과 나머지
		temp[0]=num/60;//몫
		temp[1]=num%60;//나머지
		return temp;
	}
	public void setSecond(int second) {
		if(second>59)
		{
			int temp[]=timeLogic(second);
			second=temp[1];//나머지
			minute+=temp[0];//몫으로 분추가
			if(minute>59)
			{
				int temp1[]=timeLogic(minute);
				hour+=temp1[0];//몫으로 시간추가
				minute=temp1[1];//나머지
				while(hour>=24)
				{
					hour-=24;
				}
			}
		}
		this.second = second;
	}
	
	
}
