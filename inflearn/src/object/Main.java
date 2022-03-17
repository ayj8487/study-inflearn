package object;

public class Main {
// JVM이 가장먼저 실행하는 main메서드를 가지고 있는 Main 클래스

	public static void main(String[] args) {

		Bike bike = new Bike(); //객체 생성 : new키워드를 사용하는 순간 bike의 생성자가 호출
		bike.color = "red"; // Bike를 래퍼런스하는 bike의 . 도트접근자를 이용해서 접근
		bike.gear = "auto"; 
		bike.price = 200000;
		
		bike.run();
		bike.stop();
		bike.info();
		
		System.out.println();
		
		Bike bike2 = new Bike(); //Bike의 Class는 틀이기 때문에 무한대로 생성가능
								// bike와 bike2는 다른객체이며 Bike의 주소값만 가지고있다 
		bike2.color = "black";
		bike2.gear = "manual"; 
		bike2.price = 500000;
		
		bike2.run();
		bike2.stop();
		bike2.info();
		
		System.out.println();
		
		//Car 객체 생성
		Car car = new Car("blue", 2323232); // 파라메터로 값을 바로 줌
		
//		car.color = "blue";
//		car.price = 2222222;
		
		car.info();

		car.color = "yellow"; //파라메터로 값을 받더라도 값을 다시 바꿀 수 있다 
		car.info();
	
	}
}
