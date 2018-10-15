package javaStudy.assignment;

import java.util.Calendar;
import java.util.Scanner;

public class BankSystem {

	public static void main(String[] args) {
		Account acc_arr[] = new Account[100];
		int acc_idx = 0;
		boolean flag = true;

		Scanner sc = new Scanner(System.in);

		while (flag) {
			System.out.println("원하는 서비스의 번호를 입력하세요. 1)계좌 개설, 2)현재 개설된 계좌 정보 보기, 3)시스템 종료");

			int service_num = sc.nextInt();

			switch (service_num) {
			case 1:
				System.out.println("예금주:");
				Account acc = new Account();
				acc.depositor = sc.next();

				System.out.println("예금할 금액:");
				acc.balance = sc.nextInt();

				Calendar cal = Calendar.getInstance();
				acc.date = cal.get(Calendar.YEAR) + "-" + (cal.get(Calendar.MONTH) + 1) + "-" + cal.get(Calendar.DATE);
				acc.account_num = "1002-" + (int) ((Math.random() * 99) + 1) + "-"
						+ (int) ((Math.random() * 999999) + 1);
				System.out.println("예금주" + acc.depositor + " 님 앞으로 생성된 계좌 번호는 " + acc.account_num + " 입니다");
				System.out.println();
				acc_arr[acc_idx++] = acc;
				break;

			case 2:
				System.out.println("********************* 개설된 계좌 정보 ************************");
				for (int i = 0; i < acc_idx; i++) {
					System.out.println("계좌번호:" + acc_arr[i].account_num + ", 예금주:" + acc_arr[i].depositor + ", 잔액:"
							+ acc_arr[i].balance);
				}
				System.out.println("****************************************************");
				System.out.println();
				break;

			case 3:
				flag = false;
				break;

			default:
				break;

			}
		}
	}
}
