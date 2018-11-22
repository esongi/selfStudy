package javaStudy.programmers;

import java.util.Arrays;

public class Solution4 {

	public int[] gcdlcm(int a, int b) {
		int[] answer = new int[2];

		answer[0] = gcd(a, b);
		answer[1] = (a * b) / answer[0];
		return answer;
	}

	public static int gcd(int p, int q) {

		// 유클리드 호제법?
		if (q == 0) {
			return p;
		}

		return gcd(q, p % q);
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Solution4 solution = new Solution4();
		System.out.println(Arrays.toString(solution.gcdlcm(3, 12)));
	}
}
