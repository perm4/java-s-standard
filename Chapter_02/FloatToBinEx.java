/*
 * Date   : 2022. 08. 24.
 * Source : FloatToBinEx.java
 * Author : 이진규
 * Email  : jklee050@gmail.com
 */
package Chapter_02;
class FloatToBinEx {
  public static void main(String[] args) {
    float f = 9.1234567f;
    int i = Float.floatToIntBits(f);

    System.out.printf("%f%n", f);
    System.out.printf("%X%n", i); // 16진수로 출력
  } // main의 끝
}
