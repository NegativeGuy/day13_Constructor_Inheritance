package day13_Constructor_Inheritance;
class Constructor01{
	public Constructor01(String s){
// 생성자 : 클래스 이름과 동일하고 반환타입 없음 (public은 붙여줌)
		System.out.println(s + " : 생성장 실행");
	}
	public Constructor01() {
		System.out.println("default 생성자 실행");
	}
	public void test(String s) {
		System.out.println(s + " : test 실행");
	}
	public void test() {
		System.out.println("기본 테스트"); 
	}
}
public class Ex01_Constructor {
	public static void main(String[] args) {
		/*
		생성자의 사용
		- 보통 초기화를 하고자 할때 사용
		- 객체가 생성될 때 자동으로 호출 
		- 결국 생성자도 하나의 매서드임
		
		생성자를 만드는 방법
		- 클래스 이름과 동일하게 만듬
		- 반환타입은 없어야 됨
		*/
		
		Constructor01 con = new Constructor01("생성자");
		Constructor01 con01 = new Constructor01();
		// 객체가 생성될 때 자동으로 호출 됨
		
		
		con.test("테스트");
		con.test();		// 오버 라이딩
	}	
}
