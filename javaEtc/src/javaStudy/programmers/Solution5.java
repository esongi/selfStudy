package javaStudy.programmers;

public class Solution5 {

	public String solution(int num) {

		// 간단한 거는 3항 연산자을 이용해보자
		return num % 2 == 0 ? "Even" : "Odd";
	}

	public static void main(String[] args) {
		Solution5 solution5 = new Solution5();
		System.out.println(solution5.solution(3));
	}
}
