package generators;

public class Main {

	public static void main(String[] args) {
		// 디폴트 생성자
		Generators gen = new Generators();
		
		//사용자 정의 생성자
		int[] i =  {10,20,30};
		Generators gen2 = new Generators("Hellow",i ); 
		
		//소멸자
		Generators gen4;
		
		gen4 = new Generators(); //회수 될 객체 
		gen4 = new Generators();
		
		//같은객체를 만든경우 최근에 생성된 객체 이전의 객체는 GC가 회수해 간다

		System.gc(); 
		// System.gc 메서드를 사용한다고해서 GC가 바로 객체를 회수하는 것이 아니라
		//최대한 빨리 회수할것을 요청하는 것이며 어차피 자동 회수가 되므로 개발자가 직접 명시를 해주는경우는 극히 드물다 
	
		// this키워드
		// 현재 객체를 명시할때 this키워드를 사용한다.
		Generators gen5 = new Generators(10,20);
	
		gen5.Info();
	}
	
}
