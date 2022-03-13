package grammar;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// 7. 조건문
		
		// 조건문 : 양자택일 = if문 , 다자택일 = switch문
		
		// 1. if문
		int num1 = 10;
		int num2 = 20;
		
		// if(조건식)
		if(num1 < num2 ){
			System.out.println("num1은 num2보다 적다");
		}
		
		System.out.println();
		
		// if(조건식)else
		if(num1 > num2 ){
			System.out.println("num1은 num2보다 적다");
		}else {
			System.out.println("num1은 num2보다 크거나 같다");
		}
		
		System.out.println();
		
		//if(조건식) else if(조건식)
		if(num1 < num2 ){
			System.out.println("num1은 num2보다 적다");
		}else if (num1 > num2 ) {
			System.out.println("num1은 num2보다 크다");
		}else {
			System.out.println("num1과 num2는 같다.");
		}
		
		//2. switch문
		//비교대상이 되는 결과값과 선택사항이 많을경우 주로 사용한다.
		
		System.out.println("점수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		switch (score) {
		case 100: 
		case 90:
			System.out.println("수");
		break;

		case 80:
			System.out.println("우");
		break;
		
		case 70:
			System.out.println("미");
		break;
		
		default:
			System.out.println("다시도전하세요");
		break;
		}
		sc.close();

	}
}
