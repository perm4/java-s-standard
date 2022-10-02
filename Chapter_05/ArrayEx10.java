/*
 * Date   : 2022. 09. 25.
 * Source : ArrayEx10.java
 * Author : 이진규
 * Email  : jklee050@gmail.com
 */
package Chapter_05;

class ArrayEx10 {
  public static void main(String[] args) {
    int[] numArr = new int[10];

    for(int i = 0; i < numArr.length; i++) {
      System.out.print(numArr[i] = (int)(Math.random() * 10));
    }
    System.out.println();

    for(int i = 0; i < numArr.length-1; i++) {
      boolean changed = false; // 자리바꿈이 발생했는지를 체크한다.

      for(int j = 0; j < numArr.length - 1 - i; j++) {
        if(numArr[j] > numArr[j+1]) { // 옆의 값이 작으면 서로 바꾼다.
          int temp = numArr[j];
          numArr[j] = numArr[j+1];
          numArr[j+1] = temp;
          changed = true; // 자리바꿈이 발생했으니 changed를 true로.
        }
      } // end for j

      if(!changed) break; // 자리바꿈이 없으면 반복문을 벗어난다.

      for(int k = 0; k < numArr.length; k++)
        System.out.print(numArr[k]); // 정렬된 결과를 출력한다.
      System.out.println();
    } // end for i
  } // end of main
} // end of class

/*
 * 길이가 10인 배열에 0과 9사이의 임의의 값으로 채운 다음, 버블정렬 알고리즘을 통해서 크기순으로 정렬하는 예제이다.
 * 배열의 길이가 n일 때, 배열의 첫 번째부터 n-1까지의 요소에 대해, 근접한 값과 크기를 비교하여 자리 바꿈을 반복하는 것이다.
 * 버블정렬 - 서로 인접한 두 원소를 검사하여 정렬하는 알고리즘
 * https://gmlwjd9405.github.io/2018/05/06/algorithm-bubble-sort.html
 * 자바의정석 203페이지
 * bubble sort
 */
