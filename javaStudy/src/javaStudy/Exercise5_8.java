package javaStudy;

import java.util.HashMap;

public class Exercise5_8 {

	public static void main(String[] args) {
		int[] answer = { 5, 8, 8, 7, 5, 8, 8, 6, 5, 7, 6 };
		// int[] counter = new int[4];
		HashMap<Integer, Integer> map_count = new HashMap<Integer, Integer>();

		// 5: 3
		// 6: 2
		// 7: 2
		// 8: 4
		for (int i = 0; i < answer.length; i++) {
			if (map_count.containsKey(answer[i])) {
				map_count.replace(answer[i], map_count.get(answer[i]) + 1);
			} else {
				map_count.put(answer[i], 1);
			}
		}

		for (int key : map_count.keySet()) { // KeySet() = h�߿��� key���� �̾ƿ°͵�
			System.out.print(key + ":");
			for (int j = 0; j < map_count.get(key); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
