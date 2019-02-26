package e_oop;

public class OOPtest {
	public static void main(String[] args)
	{
		//문제1. TV라는 클래스를 생성해 전원상태,채널,음량을 변경하는 메서드를 만들어주세요.(생성시 TV이름 지정)
		//채널과 음량은 제한이 필요하고, TV상태 변경 후 현재 상태를 출력해주세요.
		TV tv1 =new TV("SAMSUNG");
		//문제2. TV클래스를 사용해서 두대의 TV를 생성하고, 두대의 채널과 음량 상태를 각각 3번 이상씩 변경해주세요.
		TV tv2 =new TV("LG");
		tv1.RemotePower();
		tv2.RemotePower();
		tv1.ChannelDown();
		tv2.ChannelDown();
		tv1.ChannelChange(500);
		tv2.ChannelUp();
		tv1.ChannelUp();
		tv2.ChannelUp();
		tv1.VolumeDown();
		tv2.VolumeUp();
		tv1.VolumeDown();
		tv2.VolumeUp();
		tv1.VolumeDown();
		tv2.VolumeUp();
		
		
	}
}

class TV
{
	private String name; // TV 이름
	private boolean power; //전원 상태
	private int channel; // 채널
	private int volume; // 음량
	
	private final int CHANNEL_MIN;
	private final int CHANNEL_MAX;
	private final int VOLUME_MAX;
	private final int VOLUME_MIN;
	
	{
		CHANNEL_MIN=1;
		CHANNEL_MAX=200;
		VOLUME_MIN=0;
		VOLUME_MAX=10;
	}
	void printState()
	{
		System.out.println(this.name+" TV's Recent Channel : "+this.channel);
		System.out.println(this.name+" TV's Recent Volume : "+this.volume);
	}
	TV(String name) {
		this.name=name;
		System.out.println("TV의 이름은 : "+this.name+" 입니다.");
		this.channel=1;
		this.volume=5;
	}
	void ChannelChange(int num)
	{
		if(num>CHANNEL_MAX||num<CHANNEL_MIN)
		{
			System.out.println("Wrong Number try again");
			printState();
		}
		else
		{
			this.channel=num;
			System.out.println(this.name+" TV's Channel Change");
			printState();
		}
	}
	void RemotePower()
	{
		this.power=!this.power;
		if(this.power)
		{
			System.out.println(this.name+" TV's Power On");
		}
		else
		{
			System.out.println(this.name+" TV's Power Off");
		}
	}
	
	void VolumeUp()
	{
		if(this.power&&this.volume<VOLUME_MAX)
		{
			this.volume++;
			System.out.println(this.name+" TV's Volume Up");
			printState();
		}
		else
		{
			System.out.println(this.name+" TV's Power Off or Volume is max");
		}
	}
	void VolumeDown()
	{
		if(this.power&&this.volume>VOLUME_MIN)
		{
			this.volume--;
			System.out.println(this.name+" TV's Volume Down");
			System.out.println(this.name+" TV's Recent Volume : "+this.volume);
		}
		else
		{
			System.out.println(this.name+" TV's Power Off or Volume is min");
		}
	}
	void ChannelUp()
	{
		ChannelChange(channel+1);
	}
	void ChannelDown()
	{
		ChannelChange(channel-1);
	}
}