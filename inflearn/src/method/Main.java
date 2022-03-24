package method;

public class Main {

	public static void main(String[] args) {
		
		Method method = new Method();
		
//		method.name = "youngJun";
//		method.gender = "M";
//		method.age = 15;

		method.newInfo("youngJun", "M", 15);
		//파라메터로 속성값을 바로 호출할수 있다.
		
		method.info();
		//메서드 호출부
		
		// private메서드는 외부에서 호출할수 없다. 
	}
}
