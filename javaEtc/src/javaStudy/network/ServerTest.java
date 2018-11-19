package javaStudy.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {

	public static void main(String[] args) {
		// 연결을 담당하는 서버 소켓을 생성하는 ServerSockct 클래스의 객체를 담는
		// serverSocket 변수를 선언하고 아무 것도 없다는 의미로 null을 저장
		ServerSocket serverSocket = null;

		// 연결 요청과 데이터 송수신을 담당하는 일반 소켓을 생성하는 Socket 클래스의 객체를 담는 socket 변수 선언
		Socket socket = null;
		try {
			// serverSocket 변수에 해당 프로그램의 포트 번호를 5050 으로 설정한
			// ServerSocket 클래스의 객체를 새로 생성하여 저장
			serverSocket = new ServerSocket(5050);
			System.out.println("ready to cnnect..");

			// socket 변수에 serverSocket의 accept() 메서드를 호출하여
			// 클라이언트로부터 연결 요청을 기다리고 요청이 오면 연결을 맺은 후 생성된 소켓 객체를 저장
			socket = serverSocket.accept();

			System.out.println("connected!");

			// 행 단위로 데이터를 읽어 오는 BufferedReader 클래스의 객체를 담는 reader 변수에 클래스 새로 생성 저장
			// socket 변수의 getInputStream() 메서드를 호출하여 가져온 소켓의 입력 스트림을 파라미터로,
			// InputStreaReader 클래스의 객체를 새로 생성하여 문자 스트림으로 바꿔준다
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			// 문자스트림을 바이트 스트림으로 바꿔주는 PrintWriter 클래스의 객체를 담는 writer 변수에
			// socket 변수의 getOutputStream() 메서드를 호출하여 가져온 소켓의 출력 스트림을
			// 바이트 스트림으로 바꿔주는 PrintWriter 클래스의 객체를 새로 생성하여 저장
			PrintWriter writer = new PrintWriter(socket.getOutputStream());

			// reader의 readLine() 메서드를 호출하여 한 행의 문자열 데이터를 읽어 와서 시스템 콘솔에 출력하고 한 줄 띄운다
			System.out.println(reader.readLine());
			writer.println("HI, Im server!");

			// writer의 flush() 메서드를 호출하여 벞에 있는 데이터를 스트림으로 흘려보낸다
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
