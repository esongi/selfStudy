package javaStudy.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

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

		int[] arrayLotto = new int[6]; // int형 배열 선언
		Random random = new Random(); // 객체생성

		// 숫자 6개를 뽑기위한 for문
		for (int i = 0; i <= 5; i++) {

			// 1~10숫자중 랜덤으로 하나를 뽑아 a[0]~a[5]에 저장
			arrayLotto[i] = random.nextInt(45) + 1;

			// 중복제거를 위한 for문
			for (int j = 0; j < i; j++) {

				if (arrayLotto[i] == arrayLotto[j]) {
					i--;
				}
			}
		}
		System.out.println("배열 로또 : " + Arrays.toString(arrayLotto));
	}
}
