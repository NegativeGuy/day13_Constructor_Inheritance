package day13_Constructor_Inheritance;

import java.util.Calendar;

class Singleton01{	// 생성자 생성
	public int num;
}

public class Ex03_Singleton {	
	// Singleton : 객체를 하나만 만들어서 쓰겠다
	public static void main(String[] args) {
		Singleton01 si = new Singleton01();
		//Singleton01 si02 = new Singleton01();
		// new를 사용하면 각각 새로운 저장 공간을 만들어 사용한다
		
		Singleton01 si02 = si;
		// si와 si02가 하나의 공간을 공유해서 사용(Singleton)
		// new는 처음에 si 만들때 한번만 사용

		Calendar cal = Calendar.getInstance();
		// new를 사용하지 않고 기존의 저장 공간에서 얻어오ㄴ다
		
		si.num = 12345;
		si02.num = 4444;
		
		System.out.println("si.num : "+si.num);
		System.out.println("si02.num : "+si02.num);

		System.out.println("si : "+si);		// 해당 주소값 출력
		System.out.println("si02 : "+si02);

	}
}
