package javaStudy.programmers;

public class Solution5 {

	public String solution(int num) {
		String answer = "";

		if (num % 2 == 0) {
			answer = "짝수";
		} else {
			answer = "홀수";
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution5 solution5 = new Solution5();
		System.out.println(solution5.solution(0));
	}
}
