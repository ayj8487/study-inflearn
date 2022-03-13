package grammar;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// 8. 반복문
		
		//for,while문 : 조건이 참일 때까지 반복수행

/*
		for(int i =1; i<10; i++) 
		i가 1부터 10보다 작을 때 까지 i에 1씩 더해가며 프로그램 반복 

		for(int i =1; i<10; i+2) 
		i가 1부터 10보다 작을 때 까지 i에 2씩 더해가며 프로그램 반복
		
*/
		// for문
		System.out.println("출력할 구구단 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i =1; i<10; i++) {
			System.out.printf("%d * %d = %d  \n", num, i, (num * i));
		}
	
/*
		while(rNum < 10)
		rNum이 10보다 작을때 까지 프로그램 반복
 */

		//while문
		// while문은 for문과 다르게 
		// 초기값과 증감값이 외부에 존재한다, 조건식만 가지고 있다.
		System.out.println("출력할 구구단 : ");
		int rNum = sc.nextInt();
		
		int i = 1;
		
		while( i < 10) {
			System.out.printf("%d * %d = %d  \n", rNum, i, (rNum * i));
		
			i++;
		}
		
		//do~while문 
		//do~while문은 while문과 같지만 do{}안의 로직은 무조건 1번은 실행된다.

		int j = 100;
		
		do {
			System.out.println("무조건 1번은 실행");
			j++;
		}while(j < 10); 
		System.out.println("참이 된 경우 이 로직 실행 ");
	}
}