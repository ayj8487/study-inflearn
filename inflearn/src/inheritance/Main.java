package inheritance;

public class Main {

	public static void main(String[] args) {

		//부모클래스를 상속받은 자식클래스는 부모클래스의 메서드도 담고 있다.

		ChildClass child = new ChildClass();
		child.childInfo();
		child.parentInfo();

	//	child.par1();
	// 자식 클래스는 부모 클래스의 모든 자원을 사용할 수 있지만, private접근자의 속성과 메서드는 사용할 수 없다.	//
	}
	
}
