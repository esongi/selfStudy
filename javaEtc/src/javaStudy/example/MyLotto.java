package javaStudy.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MyLotto {

	public static void main(String[] args) {
		ArrayList<Integer> basicList = new ArrayList<Integer>();
		ArrayList<Integer> lottoList = new ArrayList<Integer>();

		for (int i = 1; i <= 45; i++) {
			basicList.add(i);
		}

		Collections.shuffle(basicList);

		for (int i = 1; i <= 6; i++) {
			lottoList.add(basicList.get(i));
		}

		System.out.println("리스트 로또 : " + lottoList);

		int[] arrayLotto = new int[6];

		// 수정해야 함, 중복o
		for (int i = 0; i < 6; i++) {
			int randomNum = (int) (Math.random() * 45);

			arrayLotto[i] = randomNum;
		}

		System.out.println(Arrays.toString(arrayLotto));

	}

}