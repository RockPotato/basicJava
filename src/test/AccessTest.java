package test;

import f_oop2.AccessModifier;

public class AccessTest extends AccessModifier {

	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		System.out.println(am.publicVar);
		am.publicMethod();
		
		//상속을 받아도 상속받은 클래스로는 protected에 접근이 불가능하다.
		//상속을 받은 자기 클래스에서 접근해야 한다.
		AccessTest at = new AccessTest();
		at.protectedTest();
	}
	void protectedTest(){
		System.out.println(protectedVar);
		protectedMethod();
	}

}
