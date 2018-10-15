package javaStudy.assignment;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {

		try {
			FileWriter fw = new FileWriter("accountList.txt");
			FileReader fr = new FileReader("accountList.txt");

			while (true) {

				Scanner sc = new Scanner(System.in);
				int account_number = 1000;
				int index;

				System.out.println("���ϴ� ������ ��ȣ�� �Է��ϼ���. 1)���°���, 2)���� ������ ���� ���� ����, 3)�ý��� ����");
				int menu_num = sc.nextInt();

				if (menu_num == 1) {
					System.out.print("������: ");
					String account_guest = sc.next();

					System.out.println("������ �ݾ�: ");
					int account_price = sc.nextInt();

					fw.write("���¹�ȣ: " + account_number + ", ������: " + account_guest + ", �ܾ�: " + account_price);
					System.out.println("������ " + account_guest + " �� ������ ������ ���� ��ȣ�� " + account_number + " �Դϴ�");
					fw.close();
				} else if (menu_num == 2) {
					while ((index = fr.read()) != -1) {
						char c = (char) index;
						System.out.print(c);
					}
				} else if (menu_num == 3) {
					fw.close();
					fr.close();

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
