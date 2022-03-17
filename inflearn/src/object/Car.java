package object;

public class Car {

	public String color;
	public int price; 

	public Car() { //파라메터값이 없는 생성자
		System.out.println("--Car--");
	}
	
	public Car(String c, int p) { //파라메터값으로 값을 던지는 생성자
 		System.out.println("--Car--");
 		color = c;
 		price = p;
 		// 생성자에서 파라메터값에 c,p를 대입하고 
 		// 생성자를 호출할때 값을 던져줌
	}
	
	public void info() {
		System.out.println("Car Color : " + color);
		System.out.println("Car Price : " + price);
	}
}
