package javaStudy.problem01;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] arr = {-20, 10, -10, 20, 5};

    findMaxProduct(arr);
  }

  public static void findMaxProduct(int[] arr) {

    // 하나씩 꺼내서 a, b를 정함
    int temp = 0;
    int a = 0;
    int b = 0;

    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (temp < arr[i] * arr[j]) {
          temp = arr[i] * arr[j];
          a = arr[i];
          b = arr[j];
        }
      }
    }

    int[] arr2 = new int[2];
    arr2[0] = a;
    arr2[1] = b;
    System.out.println(Arrays.toString(arr2));

  }
}
