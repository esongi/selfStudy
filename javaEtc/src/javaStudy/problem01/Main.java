package javaStudy.problem01;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] arr = { -10, -20, 10, 20, 5 };

		findMaxProduct(arr);
	}

	public static void findMaxProduct(int[] arr) {

	    // 하나씩 꺼내서 a, b를 정함
	    int temp = 0;
	    int a = 0;
	    int b = 0;

	    for(int i = 0; i < arr.length; i++)
	    {
		for(int j = i+1; j < arr.length; j++)
		{
		    if (temp < arr[i] * arr[j])
		    {
			temp = arr[i] * arr[j];
			a = arr[i];
			b = arr[j];
		    }
		}
	    }

	    //int[] arr2 = new int[2];
	    //arr2[0]=a;
	    //arr2[1]=b;
	    //System.out.println(Arrays.toString(arr2));

	    System.out.println(a);
	    System.out.println(b);



		// 1.다 곱해서 비교하기

		// 2.양의 최대숫자 2개와 음의최대숫자 2개를 비교
		Arrays.sort(arr);


		int minArr[] = { arr[1], arr[0] };
		int maxArr[] = { arr[arr.length - 2], arr[arr.length - 1] };

		int num1 = arr[0] * arr[1];
		int num2 = arr[arr.length - 1] * arr[arr.length - 2];

		if (num1 > num2) {
			//System.out.println(Arrays.toString(minArr));
		} else {
			//System.out.println(Arrays.toString(maxArr));
		}

	}
}
