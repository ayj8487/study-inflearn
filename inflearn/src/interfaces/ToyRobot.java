package interfaces;

public class ToyRobot implements Toy{

	@Override
	public void walk() {
		System.out.println("걷기 메서드, 로봇에 필요함");
	}

	@Override
	public void run() {
		System.out.println("달리기 메서드, 로봇에 필요함");
	}

	@Override
	public void alarm() {
		System.out.println("신호 메서드, 로봇에 필요없음");
	}

	@Override
	public void light() {
		System.out.println("불빛 메서드");
	}

	
}
