package day13_Constructor_Inheritance;


class Calc01{
	public Calc01(String s) {	// Calc01의 생성자
		System.out.println("calc 부모 생성자");
	}
	public void disply() {
		System.out.println("나는 계산기야");
	}
}

class Computer01 extends Calc01{
	public Computer01() {	// Computer01의 생성자
		super("값 전달");	
		//부모가 값(아규먼트)을 받아야 하므로 super를 사용해서 값 전달
		System.out.println("com 자식 생성자");
	}
	public void print() {
		System.out.println("나는 컴퓨터야");
	}
}
public class Ex05_Inheritance {
	public static void main(String[] args) {
		/*
		상속
		- Extends를 통해 만든다.
		- 새로운 기능을 추가한다. 
		*/
//		Calc01 ca = new Calc01();
//		ca.disply();
		
		Computer01 com = new Computer01();
		// 객체가 생성될 때 생성자가 자동으로 실행됨
		// 그리고 상속을 받기 때문에 부모 생성자먼저 실행됨
		com.print(); 
		com.disply();
		
		// 결과
		/*
		calc 부모 생성자	────────────────────────────────┬> (부모생성자)
		com 자식 생성자	────┬>(자식 생성자)	            │
							├ [자식]		                ├ [부모]
		나는 컴퓨터야		────┴>(자식클래스의 print()메서드)  │
		나는 계산기야		────────────────────────────────┴> (부모 클래스의 disply()메서드) 

		*/
	}
}
