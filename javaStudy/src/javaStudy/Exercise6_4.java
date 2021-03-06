package javaStudy;

public class Exercise6_4 {

	public static void main(String[] args) {
		Student s = new Student();
		s.name	= "홍길동";
		s.ban	= 1;
		s.no	= 1;
		s.kor	= 100;
		s.eng	= 60;
		s.math	= 76;

		System.out.println("이름: " + s.name);
		System.out.println("총점: " + s.getTotal());
		System.out.println("평균: " + s.getAverage());
	}
} 

class Student {
	public int math;
	public int eng;
	public int kor;
	public int no;
	public int ban;
	public String name;

	// 국어 영어 수학 을 더해서 반환
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
