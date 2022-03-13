package grammar;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// 6. 배열
		// 인덱스를 이용하여 자료형이 같은 데이터를 관리하는 것
		// 배열도 변수와 마찬가지로 선언과 초기화 과정을 거쳐 사용한다.
		
		//배열 선언 및 초기화
		int[] arr1 = new int[5]; //배열 선언
		//담길 데이터의 자료형이 같아야한다
		arr1[0] = 100;
		arr1[1] = 200;
		arr1[2] = 300;
		arr1[3] = 400;
		arr1[4] = 500;
		
		System.out.println("arr1[0] : " + arr1[0] );
		System.out.println("arr1[1] : " + arr1[1] );
		System.out.println("arr1[2] : " + arr1[2] );
		System.out.println("arr1[3] : " + arr1[3] );
		System.out.println("arr1[4] : " + arr1[4] );

		System.out.println();
		
		//배열 선언과 초기화를 동시에
		int[] arr2 = {10,20,30,40,50};

		System.out.println("arr2[0] : " + arr2[0] );
		System.out.println("arr2[1] : " + arr2[1] );
		System.out.println("arr2[2] : " + arr2[2] );
		System.out.println("arr2[3] : " + arr2[3] );
		System.out.println("arr2[4] : " + arr2[4] );


		// 배열과 메모리 
		// 1. 배열을 구성하는 데이터의 자료형에 따라서 배열의 메모리 크기가 결정된다.
		
		int[] arr3 = new int[3];
		// int형 은 4byte이기 때문에 3개의 int형 byte의 메모리값을 차지한다 
		// arr3 = 12byte의 메모리를 차지함
		
		// 2. 기본자료형 데이터를 담고 있는 변수와 달리 배열 변수는 배열 데이터와 주소를 담고있다.
		
		// 배열 기본속성
		int[] arrA1 = {10,20,30,40,50,60};
		int[] arrA2 = null;
		int[] arrA3 = null;

		//배열 길이 
		System.out.println("arrA1의 길이 : " + arrA1.length);
		
		//배열 요소 출력
		System.out.println("arrA1의 요소 :" + Arrays.toString(arrA1));
		
		//배열 요소 복사
		arrA3 = Arrays.copyOf(arrA1, arrA1.length);
		System.out.println("복사된 arrA3의 요소 :" + Arrays.toString(arrA3));
		//배열의 값이 같더라도 같은객체는 아니다.
		
		//배열 레퍼런스
		arrA2 = arrA1; 
		System.out.println("arrA1 : " +arrA1);
		System.out.println("arrA2 : " +arrA2);
		//  arrA2는 arrA1의 주소마저 대입하므로 같은 배열이다
		System.out.println("arrA3 : " +arrA3);
		//	arrA3는 값만 복사했으므로 arrA1과는 배열의 주소값이 틀리므로 다른배열이다.

	
		// 다차원 배열
		//배열 안에 또다른 배열이 존재함
		int[][] arrAA1 = new int[3][2]; //행과 열로 나눔
		arrAA1 [0][0] = 10;
		arrAA1 [0][1] = 100;
		arrAA1 [1][0] = 20;
		arrAA1 [1][1] = 200;
		
		System.out.println("arrAA1[0] : " + Arrays.toString(arrAA1[0]));
		System.out.println("arrAA1[1] : " + Arrays.toString(arrAA1[1]));
		
	}
}
