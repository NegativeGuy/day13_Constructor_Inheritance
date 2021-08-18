package day13_Constructor_Inheritance;

import java.util.Scanner;

class Constructor02{
	private int age;	// 2. 아래코드로 인해 만나이로 초기화됨
	public Constructor02(int age) {	// 1. age값을 초기화하기 위해 사용
		this.age = age-1;
	}
	public int getAge() {
		return age;		// 3. 만나이로 초기화됨 age를 호출 시 보냄
	}
}

public class Ex02_Constructor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 첫번째가 대문자로 시작하는 것은 클래스로 보면 된다.
		// 스캐너도 결국 클래스임
		
		System.out.println("나이 입력");
		int age = input.nextInt();
		Constructor02 con = new Constructor02(age);
		System.out.println("(만)나이 : "+con.getAge());
	}
}
