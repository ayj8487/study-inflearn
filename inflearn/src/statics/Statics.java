package statics;

import java.util.ArrayList;
import statics.Statics; 
//import method.Method; //패키지명.클래스명
import method.*; // method패키지안에 * 모든 클래스를 사용하게끔 임포트

public class Statics {

	// 패키지와 import, static키워드
	
	//1 . 패키지
	//java 프로그램은 많은 클래스로 구성되고 이러한 클래스를 폴더 형식으로 관리하는것을 패키지라고 한다.
	
	//패키지 이름 결정 요령
	// 1. 패키지 이름은 패키지에 속해 있는 클래스가 최대한 다른 클래스와중복되는것을 방지하도록 만든다.
	// 2. 패키지 이름은 일반적으로 도메인을 거꾸로 이용한다.
	//	Ex)	com.java.main
	//			=> MainClass
	// 3. 개발 중에 패키지의 이름과 구조는 변경될수 있다.
	// 4. 패키지 이름만 보고도 해당 패키지 안에 있는 클래스가 어떤 속성과 기능을 가지고 있는 예상이 될수 있도록 이름을 만든다.

	
	//2. 임포트 
	//다른 패키지에 있는 클래스를 사용하기 위해서는 import키워드를 이용한다.
	
	//	ArrayList<> // java.utill.ArrayList 라는 패키지 안에 들어있는 자바의 기본적으로 제공하는 클래스
	//패키지에 들어있는 클래스를 사용하려면 임포트 
	//같은 패키지에 있는 클래스는 사용할수 바로 사용할수 있으나 
	//서로 다른 패키지에 있는 클래스는 임포트 하여 사용할 수 있다.

	Method met = new Method(); //statics 패키지의 Main 클래스에서 호출시 Method클래스가 정상적으로 호출됨
 
	//3. static 키워드
	//클래스의 속성과 메서드에 static키워드를 사용하면 어디서나 속성과 메서드를 공유할 수 있다.
	//하나의 클래스를 여러개 생성하면 메모리 값에 따로 존재하기 때문에 엄연히 다른객체 이다 .
	//하지만 static을 이용하여 공유 할 수 있다
	
	String name;
	static int sum = 0;
	
	public Statics(String name) {
		this.name = name;
	}
	
	public void sumMoney(int sumMoney) {
		sum += sumMoney;
		System.out.println("static을 이용한 메서드 정보공유 sum :"+ sum);
	}

	
}
