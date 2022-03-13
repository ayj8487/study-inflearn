package grammar;

public class Character {

	public static void main(String[] args) {
	
		// 4. 특수문자와 서식문자
			
		//1. 특수문자 : 일반문자가 아닌 특수한 목적으로 사용되는 문자
		
		/* : 주석

		\t : 탭
		\n : 줄바꿈
		\' : 작은따옴표
		\" : 큰따옴표
		\\ : 역슬래쉬

		 */
		
		System.out.println("Good \t JAVA!"); //탭 
		System.out.println("Good \n JAVA!"); //줄바꿈 
		System.out.println("Good \' JAVA!\'"); //작은따옴표 
		System.out.println("Good \" JAVA!\""); //큰따옴표 
		System.out.println("Good \\ JAVA!\\"); //역슬래쉬 

		System.out.println();
		
		//2. 서식문자 : 일반문자가 아닌 서식에 사용되는 문자
		//서식문자는 printf()메서드를 이용
		
		/*
		
		%d : 10진수
		%o : 8진수
		%x : 16진수
		%c : 문자
		%s : 문자열
		%f : 실수
		
		 */
		
		// 10진수 서식문자
		System.out.println("오늘의 기온은 10 도 입니다.");
		System.out.printf("오늘의 기온은 %d 도 입니다. \n", 10);
		
		int num1 = 20;
		System.out.println("오늘의 기온은 "+ num1 + " 도 입니다.");
		System.out.printf("오늘의 기온은 %d 도 입니다. \n", num1);
		
		System.out.printf("홍길동 : %d학년 %d반 %d번 \n", 6, 2, 10);
		
		//정수 
		int num2 = 30;
		System.out.printf("num2(10진수) : %d \n", num2);
		System.out.printf("num2(8진수) : %o \n", num2);
		System.out.printf("num2(16진수) : %x \n", num2);
		
		//문자 
		System.out.printf("소문자 %c 의 대문자는 %c 입니다. \n", 'a', 'A');
		
		//문자열
		System.out.printf("%s 를 대문자로 바꾸면 %s 입니다. \n", "java", "JAVA");
		
		//실수
		float f =1.23f;
		System.out.printf("f = %f \n",f);
		
		double d =1.23456d;
		System.out.printf("d = %f \n",d);
	
		System.out.println();
		
		//3. 서식문자 정렬기능
		System.out.printf("%d \n", 123);
		System.out.printf("%d \n", 1234);
		System.out.printf("%d \n", 12345);
		
		System.out.println();

		// 오른쪽 정렬 
		// %숫자x  숫자만큼 앞에공간을 확보
		System.out.printf("%8d \n", 123);
		System.out.printf("%8d \n", 1234);
		System.out.printf("%8d \n", 12345);

		System.out.println();
		
		//서식문자 소수점 제한기능
		// %.숫자x .숫자만큼 소수점 표기 
		System.out.printf("%f \n", 1.23);
		System.out.printf("%.0f \n", 1.23);
		System.out.printf("%.1f \n", 1.23);
		System.out.printf("%.2f \n", 1.23);
		System.out.printf("%.3f \n", 1.23);

	}
}
