package javaStudy;

public class Variable {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;

		Integer num3 = new Integer(10);
		Integer num4 = new Integer(10);

		System.out.println("���� �� ���밪: " + num3.equals(num4));

		if (num3 == num4) {
			System.out.println("�������� ����");
		} else {
			System.out.println("�������� �ٸ���");
		}

		System.out.println("===================");

		String word1 = "JAVA";
		String word2 = "JAVA";

		System.out.println("���ڿ� �� ���밪: " + word1.equals(word2));

		if (word1 == word2) {
			System.out.println("�������� ����");
		} else {
			System.out.println("�������� �ٸ���");
		}

		System.out.println("==================");

		String word3 = new String("JAVA");
		String word4 = new String("JAVA");

		System.out.println("���ڿ� �� ���밪: " + word3.equals(word4));

		if (word3 == word4) {
			System.out.println("�������� ����");
		} else {
			System.out.println("�������� �ٸ���");
		}

		System.out.println("==================");

		String str = "example";
		System.out.println(str);
		
		str = "example";
		System.out.println(str);
		
		// ó�� ������ example �̶�� ���ڿ��� �״�� �����ְ� 
		// �ٽ� ������ ���ڿ��� �����Ѵٴ� ���� �Һ��� �Ӽ�. 
		// �׷��� ó���� ������ �ν��Ͻ��� gc(�������÷���)�� ȸ���Ѵ�
		
		String word11 = null;
		String word12 = null;
		
		if (word11 != null && word11.equals(word12)) {
			System.out.println("asdf");
		} else {
			System.out.println("�ƴ�");
		}
		
		System.out.println("Ȯ��");
	}
}
