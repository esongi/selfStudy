package javaStudy;

public class Exercise6_4 {

	public static void main(String[] args) {
		Student s = new Student();
		s.name	= "ȫ�浿";
		s.ban	= 1;
		s.no	= 1;
		s.kor	= 100;
		s.eng	= 60;
		s.math	= 76;

		System.out.println("�̸�: " + s.name);
		System.out.println("����: " + s.getTotal());
		System.out.println("���: " + s.getAverage());
	}
} 

class Student {
	public int math;
	public int eng;
	public int kor;
	public int no;
	public int ban;
	public String name;

	// ���� ���� ���� �� ���ؼ� ��ȯ
	public int getTotal() {
		return kor + eng + math;
	}
	
	// 78.66666
	// 786.66666
	// 787
	// 78.7
	public float getAverage() {
		return (float) Math.round(((float) getTotal() / 3) * 10) / 10;
	}
}