package javaStudy.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SendThread extends Thread {

	// 연결 요청과 데이터 송수신을 담당하는 일반 소켓을 생성하는 Socket 클래스의 객체를 담는 socket 변수를 선언
	Socket socket;

	// SendThread 클래스의 객체 필드를 초기 설정하는 생성자를 만들고 Socket 클래스의 객체를 담는 socket 파라미터 변수를 선언
	SendThread(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			while (true) {
				String str = reader.readLine();
				if (str.equals("BYE")) {
					break;
				}
				writer.println(str);
				writer.flush();
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				System.out.println("****채팅방을 나갑니다****");
				socket.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}