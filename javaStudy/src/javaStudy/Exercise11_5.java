package javaStudy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Student11_5 implements Comparable{
	String name;
	int ban;
	int no;
	int kor, eng, math;

	Student11_5(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
	}

	@Override
	public int compareTo(Object object) {
		
		int result = 0;
		
		Student11_5 test_object = (Student11_5)object;
		
		if (test_object.kor < this.kor)
		{
			result = -1;
		}
		else if (test_object.kor == this.kor)
		{
			result = 0;
		}
		else
		{
			result = 1;
		}
		
		return result;
	}

}

class Exercise11_5 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(new Student11_5("동사장", 1, 2, 90, 70, 80));
		list.add(new Student11_5("남사장", 1, 3, 80, 80, 90));
		list.add(new Student11_5("감사장", 1, 4, 70, 90, 70));
		list.add(new Student11_5("몸사장", 1, 5, 60, 100, 80));
		list.add(new Student11_5("박사장", 1, 1, 100, 100, 100));
		
		Collections.sort(list);
		Iterator it = list.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
