package ramdasik;

public class Main {
// 람다식 : 함수를 만들어 사용하는 것 
// 기존 객체 지향형 프로그램이 아닌 익명함수 를 이용하여 익명 객체를 생성하기 위한 식이다

// 기존 인터페이스를 사용하려면 클래스에서 implements한 후, 구현 하며 메서드를 오버드라이브 해야지 사용가능 하지만
// 람다식으로 위 과정을 없애며 매게변수만 받고 내용만 작성하여 변수에 대입하여 로직을 작성할수 있다.

	// 메개변수와 실행문만으로 작성한다.(접근자, 반환형, return 키워드 생략)
	public static void main(String[] args) {
	Lamda1 lam1 = (String s1, String s2, String s3) -> {System.out.println(s1 + " " + s2 + " " + s3 );};
	lam1.method("Hello", "Java", "World");
 
	System.out.println();
	
	// 메개변수가 1개이거나 타입이 같을때는 데이터 타입을 생략할 수 있다.
	Lamda2 lam2 = (s1) -> {System.out.println(s1);};
	lam2.method("Hello");
	
	// 실행문이 1개일 때 {} 중괄호를 생락할수 있다.
	Lamda2 lam3 = (s1) -> System.out.println(s1);
	lam3.method("Hello");

	//매게 변수와 실행문이 1개일때, () 와 {} 를 생략할 수 있다
	Lamda2 lam4 = s1 -> System.out.println(s1);
	lam4.method("Hello");
	
	//매게 변수가 없을때 () 만 작성한다.
	Lamda3 lam5 = () -> System.out.println("no parameter");
	lam5.method();
	
	}
	}
