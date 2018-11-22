package javaStudy.example;

public class Exercise4_12 {

	public static void main(String[] args) {

		for (int z = 2; z <= 9; z += 3) {

			for (int i = 1; i <= 3; i++) {

				for (int j = z; j <= z + 2 && j <= 9; j++) {
					System.out.print(j + "*" + i + "=" + j * i + "\t");
				}

				System.out.println();
			}

			System.out.println();
		}
	}
}
