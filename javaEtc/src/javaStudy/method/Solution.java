package javaStudy.method;

class Solution1 {

	public String solution(String[] participant, String[] completion) {
		String answer = "";

		for (int i = 0; i < participant.length; i++) {
			for (int j = 0; j < completion.length; j++) {
				if (participant[i].equals(completion[j])) {
					System.out.println(participant[i] + "는 있네");
					break;

				} else if (j == completion.length - 1) {
					if (!participant[i].equals(completion[completion.length - 1])) {
						System.out.println(participant[i] + "이녀석이다");
						answer = participant[i];

						return answer;
					}
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		String[] participant = { "marina", "josipa", "nikola", "vinko", "filipa" };
		String[] completion = { "marina", "josipa", "nikola", "filipa" };

		Solution1 tempSolution = new Solution1();
		System.out.println(tempSolution.solution(participant, completion));
	}
}
