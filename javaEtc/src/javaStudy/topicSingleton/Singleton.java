package javaStudy.topicSingleton;

public class Singleton {
	private static Singleton singleton;

	private Singleton() {
	}

	public static Singleton getInstance() {

		if (singleton == null) {
			singleton = new Singleton();
		}

		// 객체화된 singleton 변수를 리턴
		// Singleton singleton 인스턴스에 객체 주소를 미리 참조 시켜놓고, 이후 생성되는 singleton 객체에 대해서
		// singleton 인스턴스를 전달하므로써, 객체의 수를 하나로 제한
		return singleton;
	}
}