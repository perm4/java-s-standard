/*
 * Date   : 2022. 08. 22.
 * Source : VarEx2.java
 * Author : 이진규
 * Email  : jklee050@gmail.com
 */
package Chapter_02;

class VarEx2 {
  public static void main(String[] args) {
    int x = 10;
    int y = 20;
    int tmp = 0;

    System.out.println("x:" + x + "y:" + y);

    tmp = x;
    x = y;
    y = tmp;

    System.out.println("x:" + x + "y:" + y);
  }  
}

/*
 * 두 변수의 값 교환하기
 */