package javaStudy.topicSingleton;

public class BestSingle {
	private BestSingle() {
	}

	private static class Singleton {
		private static final BestSingle instance = new BestSingle();
	}

	public static BestSingle getInstance() {
		System.out.println("create instance");
		return Singleton.instance;
	}
}
