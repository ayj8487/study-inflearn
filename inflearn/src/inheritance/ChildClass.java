package inheritance;

public class ChildClass extends ParentClass{ //상속

	//1) 상속
	public ChildClass() {
		System.out.println(" 자식 클래스 생성자 ");
	}
	
	public void childInfo() {
		System.out.println(" ---자식클래스 인포--- ");
	}
	
	//자바 언어는 단일상속만 지향한다. 다중상속x 
	// ex) 한개의 클래스는 한개의 클래스만 상속받을 수 있다.

	//2) 메서드 오버라이딩
	// 부모 클래스의 짜장면 만드는레시피를 수정하여 더 맛있는 레시피를 생성
	@Override
	public void makeJJajang() {
		System.out.println("-- 더 맛있는 짜장면 만드는 레시피 --");
	}
}
