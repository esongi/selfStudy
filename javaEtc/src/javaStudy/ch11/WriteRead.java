package javaStudy.ch11;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// 객체를 정의/생성하는 툴인 WriteRead라는 클래스를 만든다
public class WriteRead {

	// 모든 패키지와 클래스에서 접근 가능하고 같은, 클래스에서 생성된 객체들과 값을 공유하며,
	// 리턴값이 없는 main이라는 함수를 선언하고, 문자열 값을 담는 args라는 배열을 인자로 받는다
	public static void main(String[] args) {

		// {}안을 시도해 보고 에러가 뜨면 Exception 메시지를 catch 블록으로 던진다
		try {

			// 문자열로 된 파일(텍스트 파일)을 쓰는 스트림 클래스의 객체를 담는 fw 라는 변수에
			// "cation.txt"란 파일을 쓰는 FileWriter 클래스의 객체를 새로 생성하여 저장
			FileWriter fw = new FileWriter("cation.txt");

			// 정수 값을 담는 i라는 변수에 5를 저장하고 i를 1씩 증가시키면서 i가 10보다 작을 동안 {}안을 반복
			for (int i = 5; i < 10; i++) {
				for (int j = 5; j < 10; j++) {

					// fw 안의 write() 메서드를 호출하여 내용을 쓴다
					fw.write(i + "*" + j + "=" + (i * j) + " ");
				}
				fw.write("\n");
			}

			// fw 안의 close() 메서드를 호출하여 파일을 닫는다
			fw.close();

		// Exception 메시지를 받은 경우 {} 안을 수행한다, 입출력 에러 타입의 e 변수
		} catch (IOException e) {

			System.out.println(e);

			// stack에 메서드가 호출된 기록을 남기게 되는데 이를 stackTrace라고 하며
			// 에러가 발생한 메소드의 호출 기록을 출력, stack영역에 있는 frame 정보들 출력
			e.printStackTrace();
		}

		// 텍스트 읽기
		try {
			FileReader fr = new FileReader("cation.txt");
			int i;

			// fr 안의 read() 메서드를 호출하여 파일을 읽고, 그 값을 변수 i에 저장하여 변수 i가 -1이 아닌 동안 {}안을 반복
			// read() 메서드는 읽어 온 문자를 int형으로 반환하고, 읽어 온 데이터가 없으면 -1을 리턴
			while ((i = fr.read()) != -1) {
				char c = (char) i;
				System.out.print(c);
			}
			fr.close();
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
