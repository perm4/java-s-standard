/*
 * Date   : 2022. 08. 24.
 * Source : CastingEx3.java
 * Author : 이진규
 * Email  : jklee050@gmail.com
 */
package Chapter_02;
class CastingEx3 {
  public static void main(String[] args) {
    float f = 9.1234567f;
    double d = 9.1234567;
    double d2 = (double)f;

    System.out.printf("f =%20.18f\n", f);
    System.out.printf("d =%20.18f\n", d);
    System.out.printf("d2=%20.18f\n", d2);
  }
}
