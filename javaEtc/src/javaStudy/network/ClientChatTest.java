package javaStudy.network;

import java.net.ServerSocket;
import java.net.Socket;

public class ClientChatTest {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;

		try {
			// serverSocket = new ServerSocket("***.***.***.***", 7050);
			System.out.println("***채팅방에 들어왔습니다***");

			SendThread st = new SendThread(socket);
			ReceiveThread rt = new ReceiveThread(socket);

			st.start();
			rt.start();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}