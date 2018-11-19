package javaStudy.ch11;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialTest {

	public static void main(String[] args) {

		try {

			// ��ü�� ����ȭ�Ͽ� ���� ��Ʈ�� Ŭ������ ��ü�� ��� out ������ ����ȭ ��ü�� �� �� �ְ� "a.dat" �� ������ ����
			// FileOutputStream Ŭ������ ��ü�� ���� �����ϰ�
			// �̸� ���ڷ� ObjectOutputStream Ŭ������ ��ü�� ���� �����Ͽ� �����Ѵ�
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("a.dat"));
			
			// StuInfo Ŭ������ ��ü�� ��� s1�̶�� ������ �����ϰ� "hin"�� 27�� �ʱ�ȭ�� StuInfo Ŭ������ ��ü�� ���� �����Ͽ� ����
			StuInfo s1 = new StuInfo("hin", 27);
			StuInfo s2 = new StuInfo("John", 25);
			
			// out���� writeObject() �޼��带 ȣ���Ͽ� ��ü s1�� ����ȭ�Ͽ� ����
			out.writeObject(s1);
			out.writeObject(s2);
			out.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
