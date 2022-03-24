package method;

public class Method {

	//메서드 선언과 호출
	
	public String name;
	public String gender;
	public int age;
	
	public void info() { //메서드 선언부
/*
	메서드 선언 및 정의
	
	public  접근제한자	 :	외부에서 호출을 할수있는지 여부
	void	반환형	:	데이터의 반환 자료형 명시 
	info	메서드이름	 :	사용할 메서드이름, 주로 기능을 소문자로 시작해서 짓는다
	()		매게변수	:	호출부에서 사용	
*/
	System.out.println("---getInfo");
	
	System.out.println("name : " + name);
	System.out.println("gender : " + gender);
	System.out.println("age : " + age);
	//메서드 정의부
	
	}
	public void newInfo(String n, String g, int a) { // () 매게변수(파라메터)는 필요시 정의되며 자료형과 변수(지역변수)로 이루어진다.
		System.out.println("---- newInfo ");
		
		name = n;
		gender = g;
		age = a;

		method(); //private메서드는 내부에서만 사용 가능 
	}
	
	public Method() {
	System.out.println("생성자");	
	}
	
	//같은 메서드(오버로딩)를 호출할수는 있으나 매게변수는 달라야한다.

	// 접근제한자 
	private void method() {
		System.out.println("private 메서드");
	}
}
