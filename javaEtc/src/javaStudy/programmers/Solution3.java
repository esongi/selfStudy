package javaStudy.programmers;

public class Solution3 {

	public int solution(int n) {
		int answer = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				answer += i;
			}
		}
		return answer + n;
	}

	public static void main(String[] args) {
		Solution3 solution3 = new Solution3();
		System.out.println(solution3.solution(12));
	}
}