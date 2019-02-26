package b_operator;

public class ComparisonOperator 
{
	public static void main(String[] args) 
	{
		/*
		 *  1. 비교연산자
		 *   - <(작다), >(크다), <=(작거나 같다.), >=(크거나 같다.), ==같다, !=(같지 않다).
		 *   - 두개의 값을 비교하는 연산자이다.
		 *   - 비교결과가 참이면 true, 거짓이면 false를 반환한다.
		 *   - 대소비교는 숫자 값 비교에 사용 가능하다.
		 *   - 등가비교는 모든 자료형에 사용 가능하다. 
		 */
		
		boolean b = 1 < 2;
		System.out.println(b);
		b = 1 > 2;
		System.out.println(b);
		b = 1 <= 1;
		System.out.println(b);
		b = 1 >= 1;
		System.out.println(b);
		b = 1 == 1.0f;
		System.out.println(b);
		b = 0.1 == 0.1f;
		System.out.println(b);
		System.out.printf("%22.20f%n",0.555555555555555555f);
		System.out.printf("%22.20f%n",0.555555555555555555);
		b = 0.1f == (float)0.1;
		
		b = "abcd" == "abcd";
		System.out.println(b);
		String str = new String("abcd");
		str = "abcd";
		b= "abcd" == new String("abcd");
		System.out.println(b);
		
		b= "abcd".equals(new String("abcd"));
		System.out.println(b);
	}
}
