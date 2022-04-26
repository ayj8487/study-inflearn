package statics;

public class Main {

	public static void main(String[] args) {
		
		Statics youngJun = new Statics("영준1");
		youngJun.sumMoney(100);

		Statics youngJun2 = new Statics("영준2");
		youngJun2.sumMoney(300);

		//영준1 의 sumMoney와 영준2의 sumMoney는
		//서로다른 객체이지만 static 을 이용하여 정보를 공유해 합쳐진 결과를 볼 수 있다.
		
	}
}
