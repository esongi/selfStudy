package javaStudy.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {

	public static void main(String[] args) {
		// ������ ����ϴ� ���� ������ �����ϴ� ServerSockct Ŭ������ ��ü�� ���
		// serverSocket ������ �����ϰ� �ƹ� �͵� ���ٴ� �ǹ̷� null�� ����
		ServerSocket serverSocket = null;

		// ���� ��û�� ������ �ۼ����� ����ϴ� �Ϲ� ������ �����ϴ� Socket Ŭ������ ��ü�� ��� socket ���� ����
		Socket socket = null;
		try {
			// serverSocket ������ �ش� ���α׷��� ��Ʈ ��ȣ�� 5050 ���� ������
			// ServerSocket Ŭ������ ��ü�� ���� �����Ͽ� ����
			serverSocket = new ServerSocket(5050);
			System.out.println("ready to cnnect..");

			// socket ������ serverSocket�� accept() �޼��带 ȣ���Ͽ�
			// Ŭ���̾�Ʈ�κ��� ���� ��û�� ��ٸ��� ��û�� ���� ������ ���� �� ������ ���� ��ü�� ����
			socket = serverSocket.accept();

			System.out.println("connected!");

			// �� ������ �����͸� �о� ���� BufferedReader Ŭ������ ��ü�� ��� reader ������ Ŭ���� ���� ���� ����
			// socket ������ getInputStream() �޼��带 ȣ���Ͽ� ������ ������ �Է� ��Ʈ���� �Ķ���ͷ�,
			// InputStreaReader Ŭ������ ��ü�� ���� �����Ͽ� ���� ��Ʈ������ �ٲ��ش�
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			// ���ڽ�Ʈ���� ����Ʈ ��Ʈ������ �ٲ��ִ� PrintWriter Ŭ������ ��ü�� ��� writer ������
			// socket ������ getOutputStream() �޼��带 ȣ���Ͽ� ������ ������ ��� ��Ʈ����
			// ����Ʈ ��Ʈ������ �ٲ��ִ� PrintWriter Ŭ������ ��ü�� ���� �����Ͽ� ����
			PrintWriter writer = new PrintWriter(socket.getOutputStream());

			// reader�� readLine() �޼��带 ȣ���Ͽ� �� ���� ���ڿ� �����͸� �о� �ͼ� �ý��� �ֿܼ� ����ϰ� �� �� ����
			System.out.println(reader.readLine());
			writer.println("HI, Im server!");

			// writer�� flush() �޼��带 ȣ���Ͽ� ���� �ִ� �����͸� ��Ʈ������ ���������
			writer.flush();

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				socket.close();
			} catch (Exception e) {
			}
			
			try {
				serverSocket.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

}
