package javaStudy;

class Exercise6_20 {

	static int[] shuffle(int[] arr) {
		int len = arr.length;

		for (int i = 1; i < len - 1; i++) {
			for (int j = 0; j < len - i; j++) {
				System.out.println(j + " 과 " + (j + 1) + " 을 비교");

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;

				}
				System.out.println((i) + "번째:" + java.util.Arrays.toString(arr));
			}
		}

		// 배열로 리턴
		return arr;
	}

	public static void main(String[] args) {
		int[] original = { 5, 3, 4, 1, 2, 9, 8, 7, 6 };
		System.out.println(java.util.Arrays.toString(original));

		int[] result = shuffle(original);
		System.out.println("답: " + java.util.Arrays.toString(result));
	}
}
