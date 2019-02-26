package h_lang;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		/* 정규표현식 (Regular Expression) :문자열의 패턴을 검사하는 표현식
		 * 
		 * ^	뒷 문자로 시작(^a : a로 시작하는 문자열)
		 * $	앞 문자로 종료(a$ : a로 끝나는 문자열)
		 * .	임의의 문자(줄바꿈 제외)
		 * *	앞 문자가 0개 이상(a*)
		 * +	앞 문자가 1개 이상(a+)
		 * ?	앞문자가 없거나 1개
		 * []	문자의 집합이나 범위([a-z] : a부터 z까지, 
		 * 					  [^a-z] : a 부터 z가 아닌 것)
		 * {}	앞 문자의 개수 ({2} : 2개, {2,4} : 2개 이상 4개 이하
		 * ()	그룹화(1개의 문자처럼 인식)
		 * |	OR 연산
		 * \s	공백, 탭 , 줄바꿈
		 * \S	공백, 탭, 줄바꿈이 아닌 문자
		 * \w	알파벳이나 숫자
		 * \W	알파벳이나 숫자가 아닌 문자
		 * \d	숫자
		 * \D	숫자가 아닌 문자
		 * (?i)	뒷 문자의 대소문자 구분 안함
		 * \	정규표현식에서 사용되는 특수문자 표현
		 * [a-zA-Z]	알파벳만 구분
		 * 
		 * https://regexr.com/
		 */
		
//		Pattern p = Pattern.compile("[a-z]{3}[0-9]{1,3}");
//		Pattern p = Pattern.compile("[a-z0-9]+");
//		Pattern p = Pattern.compile("\\w*");
		Pattern p = Pattern.compile(".*");
		
		Matcher m=p.matcher("abc1234");
		
		System.out.println(m.matches());
		
		//아이디,비밀번호,전화번호, 이메일 주소의 유효성 검사 정규표현식
		
		Pattern idp = Pattern.compile("\\w{4,12}");
		Pattern pwp = Pattern.compile("\\w{8}+\\W{1,6}");
		Pattern phonep = Pattern.compile("\\d{3,4}+\\-+\\d{3,4}+\\-+\\d{4}");
		Pattern ep = Pattern.compile("\\w{4,12}\\@\\w{4,8}\\.((com)|(net)|(co)\\.[a-zA-Z]{2})");
		
		
		
		
		Matcher idm=p.matcher("tlatms128");
		Matcher pwm=pwp.matcher("eoejr123!");
		Matcher phonem=phonep.matcher("010-3903-4612");
		Matcher em=ep.matcher("tlatms128@naver.co.kr");
		System.out.println(idm.matches());
		System.out.println(pwm.matches());
		System.out.println(phonem.matches());
		System.out.println(em.matches());
	}

}
