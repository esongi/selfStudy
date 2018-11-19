package javaStudy.ch11;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialTest {

	public static void main(String[] args) {

		try {

			// 객체를 직렬화하여 쓰는 스트림 클래스의 객체를 담는 out 변수에 직렬화 객체를 쓸 수 있게 "a.dat" 란 파일을 쓰는
			// FileOutputStream 클래스의 객체를 새로 생성하고
			// 이를 인자로 ObjectOutputStream 클래스의 객체를 새로 생성하여 저장한다
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("a.dat"));
			
			// StuInfo 클래스의 객체를 담는 s1이라는 변수를 선언하고 "hin"과 27로 초기화한 StuInfo 클래스의 객체를 새로 생성하여 저장
			StuInfo s1 = new StuInfo("hin", 27);
			StuInfo s2 = new StuInfo("John", 25);
			
			// out안의 writeObject() 메서드를 호출하여 객체 s1을 직렬화하여 쓴다
			out.writeObject(s1);
			out.writeObject(s2);
			out.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
