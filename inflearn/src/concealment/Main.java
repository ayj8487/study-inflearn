package concealment;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student("홍길동", 90);
		student1.getIn();
		
		//private 일때 getter/setter 를 이용한 값 수정
		student1.setScore(100);
		student1.getIn();
		
		student1.setName("홍길순");
		student1.getIn();
		
		// setter/getter 에 50보다 커야만 score가 변하도록 설정
		student1.setScore(40); // 40일시 처음 지정해놓은 100으로 출력 
		student1.getIn();

		//50이 넘으면 변경이 되는것을 볼수 있다. (활용예: 최저임금 
		student1.setScore(55);
		student1.getIn();
	}
}
