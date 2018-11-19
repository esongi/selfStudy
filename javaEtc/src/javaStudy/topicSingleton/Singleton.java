package javaStudy.topicSingleton;

public class Singleton {
	private static Singleton singleton;

	private Singleton() {
	}

	public static Singleton getInstance() {

		if (singleton == null) {
			singleton = new Singleton();
		}

		// ��üȭ�� singleton ������ ����
		// Singleton singleton �ν��Ͻ��� ��ü �ּҸ� �̸� ���� ���ѳ���, ���� �����Ǵ� singleton ��ü�� ���ؼ�
		// singleton �ν��Ͻ��� �����ϹǷν�, ��ü�� ���� �ϳ��� ����
		return singleton;
	}
}