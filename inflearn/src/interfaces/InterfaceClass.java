package interfaces;

// 인터페이스A,B 를 정의하는 클래스

public class InterfaceClass implements InterfaceA, InterfaceB{

	// extends인 상속과 다르게 인터페이스 정의는 implements이며 다형성으로 인해 
	// 상속은 1클래스당 1클래스를 상속할수 있지만 인터페이스는 원하는 만큼 정의가 가능하다

	public InterfaceClass() {
		System.out.println(" -- InterFaceClass -- ");
	}
	
	@Override
	public void funA() {
		System.out.println("-- funA() --");
	}
	
	@Override
	public void funB() {
		System.out.println("-- funB() --");
	}

	
}
