package networking;

import java.net.ServerSocket;
import java.net.Socket;

public class Main {
//  네트워킹
	//네트워크에 연결되어 있는 대상 사이에 데이터를 전송하는 방법

	// 1)네트워크 데이터 입력 및 출력
	// 네트워크 대상(객체) 사이에 입/출력(inputStream,outputStream) 을 이용해서 데이터를 입력하고 출력한다.

	// 2) 소캣 : 네트워크 상에서 데이터를 주고받기 위한 장치 

	// 3) 소캣 클래스 : 서버는 클라이언트를 맞을 준비를 하고 있다가 클라이언트의 요청에 반응한다. 클라이언트 -> 서버
	
	// 서버소켓
	public static void main(String[] args) {

		ServerSocket serverSocket = null; // 네트워크에 관련된것은 기본적으로 예외처리를 해야하기 때문에 변수만 선언하고 초기와 x
		Socket socket = null;
		
		try {
			serverSocket= new ServerSocket(9191); // 포트 번호 (9191)
			System.out.println("서버소켓 생성후 클라이언트를 맞을 준비");
		
			socket = serverSocket.accept(); //클라이언트 연결로직
			System.out.println("클라이언트 연결");
			System.out.println("soket : " + socket);

		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(socket != null) socket.close(); // 소켓과 서버소켓이 null이 아니라면 종료시킨다
				if(serverSocket != null) serverSocket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
	
	}
	
}
