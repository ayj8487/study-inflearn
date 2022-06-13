package inheritance;

public class ParentClass {

	public ParentClass() { //부모 클래스의 딥볼트 생성자
		System.out.println(" 부모 클래스 생성자 ");
	}
	public void parentInfo() {
		System.out.println("--- 부모 클래스 인포 ---");
	}
	
	private void par1() {
		System.out.println(" private 속성 부모클래스 메서드 ");
	}
}
