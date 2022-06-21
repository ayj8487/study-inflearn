package exception;

public class Main {
// 예외처리 
	// 프로그램에 문제가 발생ㅁ시 시스템 동작에 문제가 없도록 사전에 예방하는 코드를 작성하는 방법

	// 1) 예외 란?
	// 프로그램에 문제가 있는것을 말하며, 예외로 인해 시스템 동작이 멈추는 것을 막는 것을 '예외처리' 라고한다.

	//Checked Exception : '예외처리'를 반드시 해야하는경우 (네트워크,파일시스템 등) 
	//UnChecked Exception : '예외처리' 를 개발자의 판단에 맞기는 경우(데이터 오류 등)

	// 2) Exception 클래스
	// Exception클래스 하위 클래스로 NullPointException,NumberfomatException 등이 있다.
	// NullPointException : 객체를 가리키지 않고 있는 래퍼런스를 이용할 때,
	// ArrayIndexOutException : 배열에서 존재하지 않는 인덱스를 가리킬 때,
	// NumberFomatException : 숫자 데이터에 문자 데이터를 넣었을 때  등

	// 3) try ~ catch 
	// 개발자가 예외처리 하기 가장 쉽고, 많이 사용되는 방법 이다.
	
	/*
		try {
			예외가 발생할 수 있는 코드
		} catch (Exception) {
			예외가 발생했을 때 처리할 코드
		} finally {
			예외가 발생해도 무조건 실행 되야하는 코드
		}
		
	*/	
	 public static void main(String[] args) {
		 int i = 10;
		 int j = 0;
		 int r = 0;
		 System.out.println("예외 처리 전");
		
		 try {
		 r = i / j;  // 0을 10으로 나눌 수 없기 때문에 에러 발생
		 } catch (Exception e) {
			 e.printStackTrace(); //예외가 발생했을 경우 콘솔창에 찍어주는 로직
			 String msg = e.getMessage();
			 System.out.println("msg : " + msg);		 
		 }
	 // 4) finally 
	 // 예외 발생 여부에 상관없이 반듯이 실행된다.
		 finally {
		System.out.println("finally : 예외 발생 여부에 상관없이 언제나 실행");	
		}
	 
		 System.out.println("예외 처리 후");
	 }
	 
	 // 5) throws 
	 // 예외 발생시 예외처리를 직접 하지 않고 호출한 곳으로 넘어간다.
	 // 직접 예외를 처리하지 않고 호출한 메서드로 예외를 던진다.
	 

	
}
