package day13_Constructor_Inheritance;

class Singleton04{
	private static Singleton04 si;
	private Singleton04() { //private으로 외부의 접근을 막는다
		System.out.println("기본 생성자 실행");
	}
	public static Singleton04 getInstance() {
		System.out.println("si : "+si);
		if(si == null) {
			si = new Singleton04();					
		}
		// si가 null이면 객체 생성하고 리턴(즉, 맨처음에만 객체를 만듬)
		return si;
		// 그렇지 않으면(처음이 아니면) 
		// 객체를 생성하지 않고 이미 만들어진 si값을 리턴
	}
}

public class Ex04_Singleton {
	public static void main(String[] args) {
		Singleton04 si01 = Singleton04.getInstance();
		System.out.println("si01 : "+si01);
		Singleton04 si02 = Singleton04.getInstance();
		System.out.println("si02 : "+si02);
	}
}
