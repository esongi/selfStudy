package javaStudy.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SendThread extends Thread {

	// ���� ��û�� ������ �ۼ����� ����ϴ� �Ϲ� ������ �����ϴ� Socket Ŭ������ ��ü�� ��� socket ������ ����
	Socket socket;

	// SendThread Ŭ������ ��ü �ʵ带 �ʱ� �����ϴ� �����ڸ� ����� Socket Ŭ������ ��ü�� ��� socket �Ķ���� ������ ����
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
				System.out.println("****ä�ù��� �����ϴ�****");
				socket.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}