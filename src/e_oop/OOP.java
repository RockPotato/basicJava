package e_oop;

import java.util.Arrays;

public class OOP 
{
	public static void main(String[] args) 
	{	
		/*
		 * 1. 객체지향 프로그래밍
		 *  - 실세계를 모델로 프로그래밍하는 방식
		 *  - 사람, 사물 : 클래스
		 *  - 행동, 동작 : 메서드
		 *  
		 * 2. 클래스의 구성
		 *  - 클래스 파일의 가장 첫줄에는 페키지(package)를 선언한다.
		 *  - 패키지와 클래스 선언 사이에 임포트(import)를 선언한다.
		 *  - [제어자] class 클래스명 [상속] {}
		 *  - 변수와 메서드로 구성할 수 있다.
		 *  
		 * 3. 전역변수와 지역변수
		 *  - 위치에 따라 전역변수와 지역변수로 나누어진다.
		 *  - 메서드 밖에 있는 변수는 전역변수로 모든 메서드가 사용할 수 있다.
		 *  - 메서드 안에 있는 변수는 지역변수로 해당 메서드 안에서만 사용할 수 있다.
		 *  
		 * 4. 메서드
		 *  - [제어자] 리턴타입 메서드명([매개변수]) {return;}
		 *  - 메서드명([인자]); -> 메서드 호출 결과 리턴값 존재시 리턴값 반환
		 *  - 참조형 매개변수는 메서드에서 수행한 연산이 변수에 반영된다.
		 *  
		 * 5. 객체 생성(인스턴스화)
		 *  - new 클래스명 (); -> 객체가 저장된 메모리 주소 반환
		 *  - 객체를 저장한 변수뒤에 점(.)을 붙여 객체의 변수와 메서드에 접근하 수 있다.
		 *  - 객체는 생성될때 마다 새로운 객체가 생성되고, 여러개의 객체가 동시에 존재할 수 있다.
		 * 
		 */
		/*Restaurant r = new Restaurant(); // 객체 생성
		String[] menu = r.getMenu(); //리턴타입이 있는 메서드 호출
		System.out.println(Arrays.toString(menu));
		String order1 = r.order(menu[2]);
		System.out.println(order1);
		
		String order2 = r.order("스테이크 덮밥");
		System.out.println(order2);
		

		r.pay(1000);		//파라미터가 있는 메서드 호출
		r.menu[0]="스테이크 덮밥";
		System.out.println(Arrays.toString(menu));*/
		
		//문제1. Calculator 클래스에 두개의 숫자를 받아서
		//더하기, 빼기, 곱하기, 나누기, 나머지를 연산한 결과를 반환하는 메서드를 만들어주세요.
		Calculator c = new Calculator();
		
		//문제2. Calculator 클래스를 사용해 다음을 계산해주세요.
		double res=c.add(123456, 654321);
		res=c.mulitple(res,123456);
		res=c.division(res,123456);
		res=c.minus(res, 654321);
		res=c.mod(res,123456);
		System.out.println((int)res);
		
		//객체 배열
		Restaurant[] res1 = new Restaurant[2]; //참조형 배열의 기본값은 null이다. 객체가 들어있지 않다.
		Restaurant[] res2 = new Restaurant[]{new Restaurant(),new Restaurant()};
		Restaurant[] res3 = {new Restaurant(),new Restaurant()};
		
		res1[0] = new Restaurant();
		res1[1] = new Restaurant();
		
		String[] menu2 = res1[0].getMenu();
		System.out.println(Arrays.toString(menu2));
		
		//참조형 파라미터
		int callTest1 = 0 ;
		System.out.println(callTest1);
		callTest1(callTest1);
		System.out.println(callTest1);
		
		Restaurant callTest2 = new Restaurant();
		System.out.println(Arrays.toString(callTest2.getMenu()));
		callTest2(callTest2);
		System.out.println(Arrays.toString(callTest2.getMenu()));
		
		//숙제 1. 현실에 존재하는 무엇이든 대상을 정해 
		//그 대상을 1개의 클래스로 만들어주세요.
		
		
		//숙제 2. 숙제1에서 만든 클래스의 객체를 생성하고 메서드들을 호출해주세요.
	}
	private static void callTest1(int callTest1) {
		callTest1=1;
	}
	private static void callTest2(Restaurant callTest2) {
		callTest2.menu[0] = "스테이크 덮밥";
	}
	
}
class Calculator
{
	double add(double num1,double num2)
	{
		return num1+num2;
	}
	double minus(double num1,double num2)
	{
		return num1-num2;
	}
	double mulitple(double num1,double num2)
	{
		return num1*num2;
	}
	double division(double num1,double num2)
	{
		return num1/num2;
	}
	double mod(double num1,double num2)
	{
		return num1%num2;
	}
}
