package javaStudy;

public class Exercise4_12 {

	public static void main(String[] args) {

		// 2단부터 시작하여 9단까지 출력, 다음 행에선 3단 이후로
		for (int z = 2; z <= 9; z += 3) {

			// 한 행에 3단씩 출력하기 위해
			for (int i = 1; i <= 3; i++) {

				// 한 단씩 세번 출력 하기 위해 + 9단까지 출력하기 위해
				for (int j = z; j <= z + 2 && j <= 9; j++) {
					System.out.print(j + "*" + i + "=" + j * i + "\t");
				}

				// 한 행에 3단을 출력하고 다음 행으로 넘기기 위해
				System.out.println();
			}

			// 행간
			System.out.println();
		}
	}
}
