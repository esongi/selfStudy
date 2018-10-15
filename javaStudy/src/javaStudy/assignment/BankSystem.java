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
			System.out.println("���ϴ� ������ ��ȣ�� �Է��ϼ���. 1)���� ����, 2)���� ������ ���� ���� ����, 3)�ý��� ����");

			int service_num = sc.nextInt();

			switch (service_num) {
			case 1:
				System.out.println("������:");
				Account acc = new Account();
				acc.depositor = sc.next();

				System.out.println("������ �ݾ�:");
				acc.balance = sc.nextInt();

				Calendar cal = Calendar.getInstance();
				acc.date = cal.get(Calendar.YEAR) + "-" + (cal.get(Calendar.MONTH) + 1) + "-" + cal.get(Calendar.DATE);
				acc.account_num = "1002-" + (int) ((Math.random() * 99) + 1) + "-"
						+ (int) ((Math.random() * 999999) + 1);
				System.out.println("������" + acc.depositor + " �� ������ ������ ���� ��ȣ�� " + acc.account_num + " �Դϴ�");
				System.out.println();
				acc_arr[acc_idx++] = acc;
				break;

			case 2:
				System.out.println("********************* ������ ���� ���� ************************");
				for (int i = 0; i < acc_idx; i++) {
					System.out.println("���¹�ȣ:" + acc_arr[i].account_num + ", ������:" + acc_arr[i].depositor + ", �ܾ�:"
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
