package inheritance;

public class ChildClass extends ParentClass{ //상속
	
	public ChildClass() {
		System.out.println(" 자식 클래스 생성자 ");
	}
	
	public void childInfo() {
		System.out.println(" ---자식클래스 인포--- ");
	}
	
	//자바 언어는 단일상속만 지향한다. 다중상속x 
	// ex) 한개의 클래스는 한개의 클래스만 상속받을 수 있다.
}
