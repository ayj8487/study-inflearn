package grammar;

public class DataType {

	// 2. 기본자료형과 객체자료형
	
	//자료형 - 데이터의 형식
	
	//기본자료형은 데이터가 변수에 직접 저장되고,
	//객체자료형은 객체 메모리 주소가 변수에 저장된다.
	
	/*
		기본자료형
	
	정수형 
		byte 1byte
		char 2byte
		short 2byte
		int  4byte
		long 8byte
	실수형
		float 4byte
		double 8byte
	논리형
		boolean 1byte
	 */
	
	public static void main(String[] args) {
		
		char c = 'c';
		System.out.println(c);

		int i =10;
		System.out.println(i);

		double d = 10.123;
		System.out.println(d);
	
		boolean b = false;
		System.out.println(b);
		
		String s = "Hello"; //String은 객체 자료형이다 
		System.out.println(s);
		
		s = "Good";
		System.out.println(s);
	}
}
