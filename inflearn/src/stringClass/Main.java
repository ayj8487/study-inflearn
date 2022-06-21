package stringClass;

public class Main {

// String 객체와 메모리
	// 문자열을 다루는 String 클래스는 데이터가 변화면 메모리상의 변화가 많아 속도가 느려진다.
	
	public static void main(String[] args) {

		String str = "JAVA";
		str = str + "_8";
		
	System.out.println(str);
// 문자열이 변경되면 기존의 객체를 버리고 새로운 객체를 메모리에 생성한다.
// 이때 기존객체는 GC에 의해서 메모리 회수가 이루어진다.
		
// StringBuffer, StringBuilder 
	// String 클래스의 단점을 보완한 클래스로 데이터가 변경 되면 메모리에서 기존 객체를 재활용한다.
	// 문자열이 변경되면 기존의 객체를 재활용
	// 데이터 안전성은 StringBuffer가 조금더 좋으며 속도는 StringBuilder가 좋다	
	StringBuffer sf = new StringBuffer ("JAVA");
	sf.append("_9");
	
	System.out.println(sf);

	StringBuilder sb = new StringBuilder("Java World");
	System.out.println(sb );
	
	}
	
}
