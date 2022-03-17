package object;

public class Bike { //클래스 이름 : 일괄적으로 첫글자는 대문자

	//자전거 객체 
	//Bike라는 Class 안에 멤버변수(속성)와 메서드(기능) 또는 생성자 를 추가한다
	
	public String color; //멤버변수 (속성)
	public String gear;
	public int price;
	
	
	public Bike() { //생성자 : 클래스 이름과동일한 메서드, 외부에서 객체생성시 호출, 반환형이 없다  
		System.out.println("Bike 생성자 : 객체생성시 처음 호출되는 로직");
	}
	
	public void run() { //메서드(기능)
		System.out.println("RUN");
	} 	
	// void는 반환형이므로 void는 반환값이 없다는것.
	// 반환값이 있다면, return으로 받아줄수 있음
	
	public void stop() {
		System.out.println("STOP");
	}
	public void info() {
		System.out.println("Bike Color : "+ color);
		System.out.println("Bike gear : "+ gear);
		System.out.println("Bike price : "+ price);

	}
}
