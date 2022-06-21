package abstractClass;

public class ClassEx extends AbstractClass{ 
//AbstractClass의 선언만 된 메서드를 상속받는 ClassEx 클래스에서 반드시 구현해야함

	public ClassEx() {
		System.out.println("ClassEx의 생성자");
	}
	
	public ClassEx(int n, String s) {
		super(n,s);
	}
	
	
	@Override //반드시 구현, 구현 안 할시 에러 
	public void info2() {
		System.out.println("--추상클래스의 메서드2--");
	}
}
