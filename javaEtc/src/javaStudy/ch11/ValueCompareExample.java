package javaStudy.ch11;

public class ValueCompareExample {

	public static void main(String[] args) {
		
		// ���� ��ü�� ���� ���� ���ϱ� ���� ==�� != ������ ��� �Ұ�
		// ���� ��ڽ��� ���ϰų�, equals() �޼ҵ�� ���� �� ���� ��
		System.out.println("[-128~127 �ʰ����� ���]");
		
		// �ڵ� �ڽ�(���� Ŭ���� Ÿ�Կ� �⺻���� ���Ե� ��): �⺻ Ÿ���� ���� ���� ��ü�� ����� ����
		Integer obj1 = 300;  
		Integer obj2 = 300;
		System.out.println("==���: " + (obj1 == obj2));
		System.out.println("��ڽ���  == ���: " + (obj1.intValue() == obj2.intValue()));
		System.out.println("equals() ���:" + obj1.equals(obj2));
		System.out.println();

		System.out.println("[-128~127 �������� ���]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==���: " + (obj3 == obj4));
		System.out.println("��ڽ��� ==���: " + (obj3.intValue() == obj4.intValue()));
		System.out.println("equals() ���: " + obj3.equals(obj4));
	}
}
