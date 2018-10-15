package javaStudy.ch11;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserialTest {

	public static void main(String[] args) {

		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("a.dat"));
			StuInfo s;

			while ((s = (StuInfo) in.readObject()) != null) {
				s.printInfo();
			}
			in.close();
		} catch (EOFException e) {
			System.out.println("���� ���� �����Ͱ� �����ϴ�");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
