package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {
// 입/출력 이란
	// 다른곳의 데이터를 가져오는 것을 입력이라 하고 , 다른곳으로 데이터를 내보내는 것을 출력이라고 한다.
	
	//입력(input) : 파일 읽기, 이미지&동영상 불러오기
	//출력(output) : 파일쓰기, 이미지&동영상 내보내기 
	// 입출력의 호환을 스트림이라고 부른다

	//파일에 데이터를 읽고/쓰기 위한 클래스로 read(), write()메서드를 이용한다

//	FileInputStream : read(); , read(byte[]);
//		FileOutputStream : write(byte[] b); , write(byte[], int off, int len);		

	// read() : 1byte씩 읽음
	// read(byte[]) : []배열의 크기만큼 읽음
	// write(byte[] b) : 전체쓰기 
	// write(byte[],int off, int len) : off(시작점), len(길이)
	
	public static void main(String[] args) {
		
//	// 1) read();
//		InputStream inputStream = null;
//		try {
//			inputStream = new FileInputStream("C:\\java\\pjt_ex\\hello.txt");
//			int data = 0;
//			
//			while(true){
//				
//				try { // 파읽 읽기는 예외처리가 반듯이 필요하다 .
//					data = inputStream.read();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//				if(data == -1 ) break;
//				System.out.println("data : " + data);
//			}
//		
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if(inputStream != null ) inputStream.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		} // 실행 시 아스키 코드로 해당 파일을 읽음
		
		
	// 2) write()
		OutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream("C:\\java\\pjt_ex\\hellow.txt");
			String data = "Hello java world!!";
			byte[] arr = data.getBytes();
			
			try {
				outputStream.write(arr);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(outputStream != null) outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
