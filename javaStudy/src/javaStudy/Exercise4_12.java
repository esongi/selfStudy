package javaStudy;

public class Exercise4_12 {

	public static void main(String[] args) {

		// 2�ܺ��� �����Ͽ� 9�ܱ��� ���, ���� �࿡�� 3�� ���ķ�
		for (int z = 2; z <= 9; z += 3) {

			// �� �࿡ 3�ܾ� ����ϱ� ����
			for (int i = 1; i <= 3; i++) {

				// �� �ܾ� ���� ��� �ϱ� ���� + 9�ܱ��� ����ϱ� ����
				for (int j = z; j <= z + 2 && j <= 9; j++) {
					System.out.print(j + "*" + i + "=" + j * i + "\t");
				}

				// �� �࿡ 3���� ����ϰ� ���� ������ �ѱ�� ����
				System.out.println();
			}

			// �ణ
			System.out.println();
		}
	}
}