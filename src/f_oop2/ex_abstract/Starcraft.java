package f_oop2.ex_abstract;

public class Starcraft {

}

class Marine{
	int x, y; //현재 위치
	
	//지정된 위치로 이동한다.
	void move(int x, int y)
	{
		
	}
	
	//현재 위치에서 정지한다.
	void stop()
	{
		
	}
	
	//스팀팩을 사용한다.
	void stimPack()
	{
		
	}
}

class Tank
{
	int x, y;
	
	void move(int x, int y)
	{
		
	}
	
	void stop()
	{
		
	}
	
	//시즈모드로 변환한다.
	void changeMode()
	{
		
	}
}

class Dropship extends Unit
{	
	
	//선택된 대상을 태운다.
	void load()
	{
		
	}

	//선택된 대상을 내린다.
	void unload()
	{
		
	}

	@Override
	void move(int x, int y) {
		
	}
}

abstract class Unit{
	int x,y; //현재 위치
	
	abstract void move(int x, int y);
	void stop()
	{
		
	}
}