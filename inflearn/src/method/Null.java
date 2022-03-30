package method;

public class Null {

	public static void main(String[] args) {
	//  객체와 메모리 
		
		// 생성한 객체의 주소를 변수에 저장하는것을 래퍼런스라고 한다.
		
		Method m = new Method();
		Method m2 = new Method();
		Method m3 = new Method();

		// 클래스가 같더라도 ,자료형이 같아도 다른공간에 존재하는 객체는 다른 객체이다.
		System.out.println(m);
		System.out.println(m2);
		System.out.println(m3);

		
		
	// Null값 과 NullPointException
		//래퍼런스에 null저장되면 객체의 연결이 끊기며, 더 이상 객체를 이용할 수 없다.

		m.info();
		
//		m = null;
//		m.info();
	}
}
