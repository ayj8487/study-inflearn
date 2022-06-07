package concealment;

public class Student {

	private String name;
	private int score;
	// 만약 홍길동의 점수(score)를 변경하고싶을시 
	// 현재상태에서는 private이기 때문에 변경 할수 없다.
	// 이럴 때 getter/setter를 사용한다.
	
	public Student(String n, int s) {
		this.name = n;
		this.score = s;
	}
	
	
	public void getIn() {
		System.out.println("-- getInfo--");
		System.out.println(" name : " + name);
		System.out.println(" score : " + score);
	}


	
	public String getName() {
		return name;
	}// 속성의 데이터를 return 받는 메서드


	public void setName(String name) {
		this.name = name;
	}// 파라메터로 받은 값을 this.name 에 set 해주는 메서드


	public int getScore() {
		return score;
	}

	// 접근제한자를 public으로 해서 바로 접근하면되지 왜
	// private로 하고 굳이 setter/getter를 public으로 만드는가?

	// 그 이유는 setter /getter에 문법을 추가하여 안전장치를 둘 수 있기 때문.
	// 밑에서와같이 50보다 커야지 score 변경이 되게끔 설정.
	public void setScore(int score) {
		if(score > 50) 
			this.score = score;
		}
	

	
}
