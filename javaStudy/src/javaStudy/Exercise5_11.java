package javaStudy;

public class Exercise5_11 {

	public static void main(String[] args) {
		int[][] score = { { 100, 100, 100 }, { 20, 20, 20 }, { 30, 30, 30 }, { 40, 40, 40 }, { 50, 50, 50 } };
		int[][] result = new int[score.length + 1][score[0].length + 1];
		
		System.out.println(score.length);
		System.out.println(score[0].length);
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {

				// score 배열의 값을 result 배열에 그대로 대입
				result[i][j] = score[i][j];

				// 새로 추가된 열의 위치에 각 열의 값을 더함
				result[i][score[0].length] += score[i][j];

				// 새로 추가된 행의 위치에 각 행의 값을 더함
				result[score.length][j] += score[i][j];
			}

			// 새로 추가된 열의 값들의 합계 = 총합
			result[score.length][score[0].length] += result[i][score[0].length];
		}

		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.printf("%4d", result[i][j]);
			}
			System.out.println();
		}
	}
}
