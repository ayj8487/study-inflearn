package grammar;

public class ChangeType {

	public static void main(String[] args) {
		// 3. 형변환
		
		//묵시적(자동) 형변환 :
		//작은 공간의 메모리에서 큰 공간의 메모리로 이동
		byte b = 10;
		int i = b;
		System.out.println("i = "+ i);
		
		//명시적 형변환:
		//큰 공간의 메모리에서 작은 공간의 메모리로 이동
		int j = 100;
		byte by = (byte)j; //괄호로 명시를 해줘야함
		System.out.println("by = "+ by);
	
		j = 123456; // 명시해준 데이터타입보다 값을 초과할경우 데이터가 누실된다 
		by = (byte)j;
		System.out.println("by = "+ by);
	}
}
