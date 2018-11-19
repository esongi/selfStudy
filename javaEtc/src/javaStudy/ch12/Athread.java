package javaStudy.ch12;

// Thread 클래스를 확장(상속)하여 객체를 정의/생성하는 툴인 Athread 라는 클래스를 만듬
public class Athread extends Thread {
	public void run() {
		int i = 0;

		try {
			while (true) {

				// Thread 클래스 안의 sleep() 메서드를 호출하여 1000밀리 초(1초) 간 이 스레드를 정지한다
				Thread.sleep(1000);
				i++;

				if (i == 10) {
					System.out.println("10초");
					break;
				} else {
					System.out.println(i + "초");
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
		System.out.println("1부터 100까지의 합=" + sum);
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
