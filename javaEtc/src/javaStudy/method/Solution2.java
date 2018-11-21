package javaStudy.method;

public class Solution2 {

	public int solution(String s) {
		int answer = 0;
		answer = Integer.valueOf(s);
		System.out.println(answer);

		System.out.println("indexOf 메서드 : " + s.indexOf("2"));
		System.out.println("charAt 메서드 : " + s.charAt(1));

		return answer;
	}

	public static void main(String[] args) {
		Solution2 solution2 = new Solution2();
		solution2.solution("-1234");
	}
}