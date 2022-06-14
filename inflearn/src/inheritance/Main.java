package inheritance;

public class Main {

	public static void main(String[] args) {

		//1 ) 상속
		//부모클래스를 상속받은 자식클래스는 부모클래스의 메서드도 담고 있다.

		ChildClass child = new ChildClass();
		child.childInfo();
		child.parentInfo();

	//	child.par1();
	// 자식 클래스는 부모 클래스의 모든 자원을 사용할 수 있지만, private접근자의 속성과 메서드는 사용할 수 없다.	//
	
		//2 ) 오버라이딩
		child.makeJJajang();
	
	
		//3 ) 익명 클래스
		// 클래스의 이름을 붙히지 않고 바로 new 키워드로 접근 
		// 로직 끝에 .method를 붙혀 바로 재정의가 가능하지만 재사용은 불가함
		new AnomymousClass() {
			
			@Override
			public void method() {
				System.out.println("-- 익명클래스의 재정의 --");
			};
		}.method();
		
		
	}
	
	
	
	
}
