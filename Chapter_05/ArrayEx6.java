/*
 * Date   : 2022. 09. 25.
 * Source : ArrayEx6.java
 * Author : 이진규
 * Email  : jklee050@gmail.com
 */
package Chapter_05;

class ArrayEx6 {
  public static void main(String[] args) {
    int[] score = {79, 88, 91, 33, 100, 55, 95};

    int max = score[0]; // 배열의 첫 번째 값으로 최댓값을 초기화 한다.
    int min = score[0]; // 배열읭 첫 번째 값으로 최솟값을 초기화 한다.

    for(int i = 0; i < score.length; i++) {
      if(score[i] > max) {
        max = score[i];
      } else if (score[i] < min) {
        min = score[i];
      }
    } // end of for

    System.out.println("최댓값 : " + max);
    System.out.println("최솟값 : " + min);
  } // end of main
} // end of class

/**
 * 배열에 저장된 값 중에서 최댓값과 최솟값을 구하는 예제이다.
 */
