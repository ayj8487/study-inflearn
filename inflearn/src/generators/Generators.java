package generators;

public class Generators {

	//생성자와 소멸자, 그리고 this 키워드
	
	// 1. 디폴트 생성자 
	// 객체가 생성될 때 가장 먼저 호툴되는 상성자로, 만약 개발자가 
	// 명시하지 않아도 컴파일 시점에 자동 생성된다
	
	public Generators() { // 디폴트 생성자
	}
	
	// 2. 사용자 정의 생성자
	// 디폴트 생성자 외에 특정 목적에 의해서 개발자가 만든 생성자로 매개변수에 차이가 있다.
	public Generators(String s, int[] i) { //사용자 정의 생성자 
		System.out.println("-- 사용자 정의 생성자");
		
		System.out.println("s : "+ s);
		System.out.println("i : "+ i);
	}
	
	// 3.소멸자
	// 객체가 GC에 의해서 메모리에서 제거 될때 finalize() 메서드가 호출된다.
	@Override
	protected void finalize() throws Throwable {
		System.out.println("-- 소멸자");
		
		super.finalize();
	}
	
	// 4. this키워드
	public int x; //전역변수 x,y (객체가 생성될때부터 메모리에 남아있는변수)
	public int y;
	
	public Generators(int x, int y) { // 지역변수 x,y (파라메터로만 활용되고 메모리에서 바로 사라지는 변수)
		// 파라메터로 이용 후 메모리에 담고싶을때, 즉
		// 지역변수 x,y를 전역변수x,y에 담고싶을때 
		
//		x = x; 
//		y = y; 
		
		// 앞의 x는 전역변수, 뒤의 x는 지역변수를 뜻함
		// 위처럼 헷갈리기 때문에 
		
		this.x = x;
		this.y = y;
		
		// 위처럼 this를 붙여준다. this란 현재 작업을 하고있는 객체를 가르킴. 즉
		// this는 Generators 객체의 전체를 가르키고 this안의  .x 는 전역변수를 가르킴
		// this(Generators객체) .(도트접근자)의 안에 x (전역변수) = x(지역변수를 대입)
	}
	
	public void Info() {
		System.out.println("x =" + x);
		System.out.println("x =" + y);

	}
}
