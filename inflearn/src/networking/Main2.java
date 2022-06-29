package networking;

import java.io.IOException;
import java.net.Socket;

public class Main2 {

	// 4) 클라이언트와 서버소켓 
	// 서버에 serversoket을 준비하고 클라리언트에서 socket을 이용해서 접속한다.

	// 5) 클라이언트와 서버는 inputstream, outputstream 을 이용해서 데이터 전송 양방향 통신을 할 수 있다.
	
	//클라이언트 소켓
	public static void main(String[] args) {

		Socket socket = null;
		
		try {
			socket = new Socket("localhost", 9191); //127.0.0.1 : 로컬 IP
			System.out.println("서버 연결");
			System.out.println("socket : " + socket);
		
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(socket != null)socket.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
