package day13_Constructor_Inheritance;
class AAA{
	public void aaa() {
		System.out.println("다중상속");
	}
}
class Calc06 extends AAA{
	public int n = 12345;
	public String s = "부모 문자열";
	private String ss = "private 변수";	// private변수는 상속 불가능
	protected String sss = "protected 변수"; // protected 변수는 상속 가능
	public Calc06(String s) {
		System.out.println(s + " : 부모 생성자");
	}
	public void test() {
		System.out.println("부모 test 실행");
	}
}

class Computer06 extends Calc06{
	public int n = 7777;
	public Computer06(String ss) {
		super(ss);
		System.out.println(ss+" : 자식 생성자");
		super.test();	// 부모의 test()를 실행
		this.test();	// 자식(나의) test()를 실행 (this 생략 가능)
		System.out.println("n : "+n);
		// 부모와 자식이 모두 같은 n을 가지고 있다면 내가 우선임
		// this.n으로 해도 됨. 가독성이 더 좋아짐
		System.out.println("n : "+super.n);
		// super를 붙이면 부모의 n을 상속
		System.out.println("super.s : "+s);
		// 부모의 변수를 super를 사용해서 상속 후 출력 가능
		
		//System.out.println("super private ss : "+super.ss);
		// 상속 불가능
		
		System.out.println("super protected sss : "+super.sss);
		// protected변수는 자식만 상속 가능
	}
}
public class Ex06_Inheritance {
	public static void main(String[] args) {
		Computer06 com = new Computer06("아규먼트 전달");
		com.aaa();
		// 다중 상속은 안되지만 부모가 상속 받은것은 자식도 쓸 수 있다
	}
}
