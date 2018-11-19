package javaStudy.ch11;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// ��ü�� ����/�����ϴ� ���� WriteRead��� Ŭ������ �����
public class WriteRead {

	// ��� ��Ű���� Ŭ�������� ���� �����ϰ� ����, Ŭ�������� ������ ��ü��� ���� �����ϸ�,
	// ���ϰ��� ���� main�̶�� �Լ��� �����ϰ�, ���ڿ� ���� ��� args��� �迭�� ���ڷ� �޴´�
	public static void main(String[] args) {

		// {}���� �õ��� ���� ������ �߸� Exception �޽����� catch ������� ������
		try {

			// ���ڿ��� �� ����(�ؽ�Ʈ ����)�� ���� ��Ʈ�� Ŭ������ ��ü�� ��� fw ��� ������
			// "cation.txt"�� ������ ���� FileWriter Ŭ������ ��ü�� ���� �����Ͽ� ����
			FileWriter fw = new FileWriter("cation.txt");

			// ���� ���� ��� i��� ������ 5�� �����ϰ� i�� 1�� ������Ű�鼭 i�� 10���� ���� ���� {}���� �ݺ�
			for (int i = 5; i < 10; i++) {
				for (int j = 5; j < 10; j++) {

					// fw ���� write() �޼��带 ȣ���Ͽ� ������ ����
					fw.write(i + "*" + j + "=" + (i * j) + " ");
				}
				fw.write("\n");
			}

			// fw ���� close() �޼��带 ȣ���Ͽ� ������ �ݴ´�
			fw.close();

		// Exception �޽����� ���� ��� {} ���� �����Ѵ�, ����� ���� Ÿ���� e ����
		} catch (IOException e) {

			System.out.println(e);

			// stack�� �޼��尡 ȣ��� ����� ����� �Ǵµ� �̸� stackTrace��� �ϸ�
			// ������ �߻��� �޼ҵ��� ȣ�� ����� ���, stack������ �ִ� frame ������ ���
			e.printStackTrace();
		}

		// �ؽ�Ʈ �б�
		try {
			FileReader fr = new FileReader("cation.txt");
			int i;

			// fr ���� read() �޼��带 ȣ���Ͽ� ������ �а�, �� ���� ���� i�� �����Ͽ� ���� i�� -1�� �ƴ� ���� {}���� �ݺ�
			// read() �޼���� �о� �� ���ڸ� int������ ��ȯ�ϰ�, �о� �� �����Ͱ� ������ -1�� ����
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
