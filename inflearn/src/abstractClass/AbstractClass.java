package abstractClass;

public abstract class AbstractClass { //abstract을 선언
// 추상클래스

	int num; // 멤버변수를 가질수 있음
	String str;
	
	public AbstractClass() { //생성자 또한 가질수 있음
		System.out.println("--추상클래스 생성자--");
	}
	
	public AbstractClass(int n,String s) {
		this.num = n; //메개 변수를 가지고있는 생성자도 가질수 있음
		this.str = s;
	}
	
	public void info() { //일반 메서드도 가질수 있음
		System.out.println("--추상클래스의 일반 메서드--");
	}
	
	public abstract void info2(); //추상메서드의 특징, 추상메서드
	// 선언만 되어있고 정의되지않음, 즉 상속을 할 클래스에서 반드시 구현해야함
	
}
