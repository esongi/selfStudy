package javaStudy.ch12;

// Thread Ŭ������ Ȯ��(���)�Ͽ� ��ü�� ����/�����ϴ� ���� Athread ��� Ŭ������ ����
public class Athread extends Thread {
	public void run() {
		int i = 0;

		try {
			while (true) {

				// Thread Ŭ���� ���� sleep() �޼��带 ȣ���Ͽ� 1000�и� ��(1��) �� �� �����带 �����Ѵ�
				Thread.sleep(1000);
				i++;

				if (i == 10) {
					System.out.println("10��");
					break;
				} else {
					System.out.println(i + "��");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		Mthread mt = new Mthread();
		Athread at = new Athread();

		mt.start();
		at.start();
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1���� 100������ ��=" + sum);
	}
}

class Mthread extends Thread {
	public void run() {
		for (char alp = 'A'; alp <= 'Z'; alp++) {
			System.out.println(alp + " ");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
