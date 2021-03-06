package javaStudy.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListStudy {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();

		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		System.out.println("add(값)");
		System.out.println(numbers);

		numbers.add(1, 50);
		System.out.println("\nadd(인덱스,값)");
		System.out.println(numbers);

		numbers.remove(2);
		System.out.println("\nremove(인덱스)");
		System.out.println(numbers);

		System.out.println("\nget(인덱스)");
		System.out.println(numbers.get(2));

		System.out.println("\nsize()");
		System.out.println(numbers.size());

		System.out.println("\nindexOf()");
		System.out.println(numbers.indexOf(30));

		// 타입을 지정해주는게 모던 자바
		Iterator<Integer> it = numbers.iterator();
		System.out.println("\niterator");
		while (it.hasNext()) {
			int value = it.next();
			if (value == 30) {
				it.remove();
			}
			System.out.println(value);
		}
		System.out.println(numbers);
	}
}
