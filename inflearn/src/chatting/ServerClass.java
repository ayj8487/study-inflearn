package chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerClass {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		InputStream inputStream = null;
		DataInputStream dataInputStream = null;
		
		OutputStream outputStream = null;
		DataOutputStream dataOutputStream = null;
		
		try {
			serverSocket = new ServerSocket(9292);
			System.out.println("클라이언트 맞이 준비 완료");
			
			socket = serverSocket.accept();
			System.out.println("---클라이언트 연결---");
			System.out.println("socket : " + socket);
			
			inputStream = socket.getInputStream();
			dataInputStream = new DataInputStream(inputStream);
			
			outputStream = socket.getOutputStream();
			dataOutputStream = new DataOutputStream(outputStream);
			
			while (true) {
				String clientMessage = dataInputStream.readUTF();
				System.out.println("클라이언트 메시지 : "+ clientMessage);
				
				dataOutputStream.writeUTF("메시지 전송 완료 !");
				dataOutputStream.flush();
				
				if(clientMessage.equals("종료")) break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(dataInputStream != null )dataInputStream.close();
				if(inputStream != null )inputStream.close();
				if(dataOutputStream != null )dataOutputStream.close();
				if(outputStream != null)outputStream.close();
				
				if(socket != null) socket.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
