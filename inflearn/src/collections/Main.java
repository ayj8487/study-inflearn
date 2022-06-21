package collections;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
// List와 Map 자료형
	//배열과 같이 자료(데이터)를 효율적으로 관리하기 위한 방법

public static void main(String[] args) {
// List는 인터페이스로 이를 구현한 클래스는 인덱스를 이용하여 데이터를 관리한다.
// 특징 : 인덱스를 이용, 데이터 중복이 가능

//List : 구현 -> Vector , ArrayList, LinkedList

// ArrayList 객체 생성
	ArrayList<String> list = new ArrayList<String>();
//해당 ArrayList라는 객체는 <String>문자열 데이터로 인덱스로 관리 된다는 명시 
	
	System.out.println("list.size : " +list.size());
	
	//데이터 추가
	list.add("Hello");
	list.add("Java");
	list.add("World");
	System.out.println("list.size : " +list.size());
	System.out.println("list : " + list);
	
	list.add(2, "Pro"); // 2번째 인덱스에 끼워놓기 
	System.out.println("list : " + list);
	
	list.set(1, "C");  //1번째 인덱스값을 바꾸기 
	System.out.println("list : " + list);
	
	//데이터 추출
	String str = list.get(2); //2번째 인덱스 값을 추출
	System.out.println("list.get(2) : " + str);
	System.out.println("list : " + list);
	
	//데이터 제거
	str = list.remove(2);
	System.out.println("list.remove(2) : " + str);
	System.out.println("list : " + list);
	
	//데이터 전체 제거
	list.clear();
	System.out.println("list.clear() : " + list);
	System.out.println("list : " + list);
	
	//데이터 유무
	boolean b = list.isEmpty();
	System.out.println("list.isEmpty() :" + b);
	
	System.out.println("============================");


// Map 은 인터페이스로 이를 구현한 클래스는 key를 이용해서 데이터를 관리한다.

	// Map : 구현 -> HashMap 
	// 특징 : key를 이용한다, key는 중복될수 없다, 데이터는 중복이 가능하다.

// HashMap 객체 생성 HashMap<K, V> - key값과 데이터를 입력
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	System.out.println("map.size() : " + map.size());

	//데이터 추가
	map.put(5, "Hello");
	map.put(6, "Java");
	map.put(7, "World");
	System.out.println(" map : "+ map );
	System.out.println("map.size() : " + map.size());

	map.put(8, "!!!!");
	System.out.println(" map : "+ map );

	//데이터 교체 
	map.put(6, "C");
	System.out.println(" map : "+ map );

	//데이터 추출
	str = map.get(5);
	System.out.println(" map.get(5) : "+ str );

	//데이터 제거
	map.remove(8);
	System.out.println(" map : "+ map );

	//특정 데이터 포함 유무 
	b = map.containsKey(7);
	System.out.println("map.containsKey(7) : "+ b);

	//데이터 전체 제거 
	map.clear();
	System.out.println("map : "+ map);
	
	//데이터 유무
	b = map.isEmpty();
	System.out.println("map.isEmpty() : "+ b);
	
}
	
}
