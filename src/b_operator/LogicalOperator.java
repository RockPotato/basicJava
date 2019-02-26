package b_operator;

public class LogicalOperator 
{
	public static void main(String[] args) 
	{
		
	/*
	 * 1. 논리 연산자 
	 * - &&(그리고;AND)x, ||(또는; OR)+, !(아니다; NOT)
	 * - &&와 ||는 다수의 조건을 결합할때 사용할 수 있다.
	 * - &&와 ||는 boolean형 값을 피연산자로 사용한다.
	 * - !은 boolean형 값을 반대로 바꾼다. true => false, false=> true
	 */
		
		boolean b;
		b = true && true; //둘다 일일때만 일 한쪽이라도 다르면 영 
		System.out.println(b);
		b = true && false; // 
		System.out.println(b);
		b = false && true; 
		System.out.println(b);
		b = false && false; 
		System.out.println(b);
		
		b = true || true;
		System.out.println(b);
		b = true || false;   
		System.out.println(b);
		b = false || true;   
		System.out.println(b);
		b = false || false;   
		System.out.println(b);
		
		boolean b2 = false;
		b2 = !b2;
		System.out.println(b2);
		String str = "abcd";
		b2 = !str.equals("abc");
		System.out.println(b2);
		
		int x = 1, y = 2;
		boolean b3 = false;
		b3 = x + 3 * y > y - 2 || x < 3 && y >= 5;
		System.out.println(b3);
        
		/* 
		 * 비트 연산자
		 * - &(AND), |(OR), ^(XOR), ~(비트전환), <<(쉬프트), >>(쉬프트) 
		 * - 비트단위로 연산한다.
		 * - | : 피연산자 중 한쪽의 값이 1이면, 1를 그외는 0을 결과로 얻는다.
		 * - & : 피연산자 양 쪽이 모두 1이어야만 1을 그외는 0을 결과로 얻는다.
		 * - ^ : 피연산자의 값이 서로 다를 때만 1을 같을때는 0을 결과로 얻는다.
		 * - ~ : 피연산자를 0은 1로 1은 0으로 바꾼다.
		 * - << : 피연산자의 각 자리를 왼쪽으로 이동시킨다. 빈킨은 0으로 채운다.
		 * - >> : 피연산자의 각 자리르 오른쪽으로 이동시킨다. 빈칸은 앞자리와 동일한 값으로 채운다.
		 * 
		 * 기타 연산자
		 * - (type) : 형변환(캐스팅)
		 * - 조건식 ? true : false (삼항연산자)
		 * - instanceof  
		 */
		int num1 = 1;
		int num2 = 2;
		int num3 = (num1 > num2) ? num1 : num2; //참이면 num1 거짓이면 num2
	    System.out.println(num3);
	}

}