package grammar;

public class Operator {

	public static void main(String[] args) {
		// 5. 연산자

		//1. 대입 연산자 
		//오른쪽 값을 왼쪽에 대입 
		int x = 10;
		int y = 20;
		System.out.println("x = " +x );
		
		//2. 산술 연산자
		// + - % / * 등을 수행
		System.out.println("x % y =" + ( x % y )); // %는 나머지를 의미한다.

		//3. 복합대입 연산자

		// += 더하고 대입
		// -= 빼고 대입
		// *= 곱하고 대입
		// /= 나누고 대입
		// %= 나머지를 대입
		 x =10;
		 System.out.println("x += 10 : " + (x += 10));
		 // 기존 x값에서 10을 더한후 다시 x에 더함 
	
		 x =10;
		 System.out.println("x + 10 : "+ (x + 10));
		 // 두결과는 같다.
	
		 //4. 관계 연산자
		 //두개의 피연산자를 비교해서 참/거짓의 결과를 도출한다 
		 System.out.println("x > y : "+ (x > y));
		 //x가 y보다 크면 참
		 System.out.println("x >= y : "+ (x >= y));
		 //x가 y보다 같거나 크면 참
		 System.out.println("x != y : "+ (x != y ));
		 //x와 b가 같지 않으면 참
		 
		 //5. 증감연산자 
		 //1만큼 증가 하거나 감소를 수행
		 
		 // ++ : 1만큼 증가
		 // -- : 1만큼 감소
		 System.out.println("++x :" +(++x) );
		 //증감먼저 하고 출력
		 System.out.println("x++ : "+(x++) );
		 //출력먼저하고 증감, 
		 System.out.println(x); //다음값 출력시 증감되서 출력
	
		 //6. 논리연산자 
		 //피연산자의 논리곱(AND),논리합(OR),논리부정(NOT)을 수행한다.
		 // && 논리곱 (AND) : a && b : a와b가 모두 참이면 참
		 // || 논리곱 (OR) : a || b : a와b중 하나라도  참이면 참
		 // ! 논리곱 (NOT) : !a : a의 상태를 부정
		 
		 boolean b1 = false;
		 boolean b2 = true;
		 System.out.println("b1 && b2 : " + (b1 &&  b2));
		 System.out.println("b1 || b2 : " + (b1 || b2));
		 System.out.println("! b1 : " + (!b1));
		 System.out.println("! b2 : " + (!b2));
		 
		 //7. 삼항(조건)연산자
		 //삼항 연산자로 두개의 피연산자 연산 결과에 따라서 나머지 피연산자가 결정된다.
		 // 조건식 ? 식1 : 식2 = 조건식이 참이면 식1이 실행, 거짓이면 식2가 실행
		 x = 10; y = 20;
		 int i = 0;
		 i = (x > y ? 100 : 200);
		 System.out.println("i :" + i);
		 
		 i = (x < y ? 100 : 200);
		 System.out.println("i :" + i);
		 
		 i = (x == y ? 100 : 200);
		 System.out.println("i :" + i);
		 
		 //8. 비트연산자 
		 // 데이터를 비트단위로 환산하여 연산을 수행하며, 다른 연산자보다 연산속도가 향상된다.
		 // & : AND연산 = a & b : a와b가 모두 1이면 1
		 // | : OR연산 = a | b : a와중 하나라도  1이면 1
		 // ^ : XOR연산 = a ^ b : a와b가 같지 않으면 1

		 
	
	}
}
