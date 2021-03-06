package javaStudy.programmers;

public class Solution6 {
	public String solution(String s) {
		String answer = "";

		if (s.length() % 2 == 1) {
			// 홀수
			answer = s.substring(s.length() / 2, (s.length() / 2) + 1);
		} else if (s.length() == 2) {

			answer = s.substring(0, 2);
		} else {
			// 짝수
			answer = s.substring((s.length() / 2) - 1, (s.length() / 2) + 1);
		}

		// 4일때 - (3/2)=1, 3
		// 5일때 - (4/2)=2, 3
		// 6일때 - 2,4 가 필요 >> 0부터 시작.. 이렇게 해보면서 식을 찾는듯?
		answer = s.substring((s.length() - 1) / 2, (s.length() / 2) + 1);

		return answer;
	}

	public static void main(String[] args) {
		Solution6 solution6 = new Solution6();
		System.out.println(solution6.solution("abcdf"));
	}
}
