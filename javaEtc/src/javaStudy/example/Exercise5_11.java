package javaStudy.example;

public class Exercise5_11 {

	public static void main(String[] args) {
		int[][] score = { { 100, 100, 100 }, { 20, 20, 20 }, { 30, 30, 30 }, { 40, 40, 40 }, { 50, 50, 50 } };
		int[][] result = new int[score.length + 1][score[0].length + 1];
		
		System.out.println(score.length);
		System.out.println(score[0].length);
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {

				// score �迭�� ���� result �迭�� �״�� ����
				result[i][j] = score[i][j];

				// ���� �߰��� ���� ��ġ�� �� ���� ���� ����
				result[i][score[0].length] += score[i][j];

				// ���� �߰��� ���� ��ġ�� �� ���� ���� ����
				result[score.length][j] += score[i][j];
			}

			// ���� �߰��� ���� ������ �հ� = ����
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
