package javaStudy.topicSingleton;

public class BestTest {

	public static void main(String[] args) {
		BestSingle t1 = BestSingle.getInstance();
		BestSingle t2 = BestSingle.getInstance();
		System.out.println(t1 == t2);
	}
}
