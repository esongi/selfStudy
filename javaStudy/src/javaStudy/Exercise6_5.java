package javaStudy;

public class Exercise6_5 {

	public static void main(String[] args) {
		
		Students s1 = new Students("한동우");

		Students s2 = new Students(100);

		Students s3 = new Students("홍길동", 1, 1, 100, 60, 76);

		System.out.println(s3.info());
		
		int	test = Math.round(((float)100/3 * 10 )/ 10);
		
		System.out.println(test);
	}
}

class Students {
	public String name;
	public int num1;
	public int num2;
	public int kor;
	public int eng;
	public int math;

	public Students(String aa) {
		this.name = aa;
	}

	public Students(int aa) {
		this.math = aa;
	}

	public Students(String name, int num1, int num2, int kor, int eng, int math) {
		this.name = name;
		this.num1 = num1;
		this.num2 = num2;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String info() {
		int sum = kor+eng+math;
		float avg = (float)(Math.round((float)sum /3*10))/10;
		return name + "," + num1 + "," + num2 + "," + kor + "," + eng + "," + math + ","+sum+","+avg;
	}
}