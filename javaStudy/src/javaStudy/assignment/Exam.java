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

				System.out.println("원하는 서비스의 번호를 입력하세요. 1)계좌개설, 2)현재 개설된 계좌 정보 보기, 3)시스템 종료");
				int menu_num = sc.nextInt();

				if (menu_num == 1) {
					System.out.print("예금주: ");
					String account_guest = sc.next();

					System.out.println("예금할 금액: ");
					int account_price = sc.nextInt();

					fw.write("계좌번호: " + account_number + ", 예금주: " + account_guest + ", 잔액: " + account_price);
					System.out.println("예금주 " + account_guest + " 님 앞으로 생성된 계좌 번호는 " + account_number + " 입니다");
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
