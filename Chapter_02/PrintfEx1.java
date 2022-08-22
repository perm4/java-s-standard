/*
 * Date   : 2022. 08. 22.
 * Source : PrintfEx1.java
 * Author : 이진규
 * Email  : jklee050@gmail.com
 */
package Chapter_02;

class PrintfEx1 {
  public static void main(String[] args) {
    byte b = 1;
    short s = 2;
    char c = 'A';

    int finger = 10;
    long big = 100_000_000_000L;
    long hex = 0xFFFF_FFFF_FFFF_FFFFL; // long hex = 0xFFFFFFFFFFFFFFFFL;

    int octNum = 010; // 8진수 10, 10진수로는 8
    int hexNum = 0x10; // 16진수 10, 10진수로는 16
    int binNum = 0b10; // 2진수 10, 10진수로는 2

    System.out.printf("b=%d%n", b);
    System.err.printf("s=%d%n", s);
    System.out.printf("c=%c, %d %n", c, (int)c);
    System.out.printf("finger=[%5d]%n", finger);
    System.out.printf("finger=[%-5d]%n", finger);
    System.out.printf("finger=[%05d]%n", finger);
    System.out.printf("big=%d%n", big);
    System.out.printf("hex=%x%n", hex);
    System.out.printf("hex=%#x%n", hex); // '#'은 접두사(16진수 0x, 8진수 0)
    System.out.printf("hex=%#X%n", hex); // '#'은 접두사(16진수 0x, 8진수 0)
    System.out.printf("octNum=%o, %d%n", octNum, octNum);
    System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
    System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);
  }  
}

/*
 * 형식화된 출력 printf - 정수
 * 지시자: 설명
 * %b: 불리언(boolean)
 * %d: 10진수(decimal integer)
 * %o: 8진수(octal integer)
 * %x, %X: 16진수(hexadecimal integer)
 * %f: 10진수(decimal float)
 * %e, %E: 지수형태표현(exponent)
 * %c: 문자(character)
 * %s: 문자열(string)
 * %n, \n: 개행문자(new line)
 * [참고] '%n'대신 '\n'을 사용해도 되지만, OS마다 줄바꿈 문자가 다를 수 있기 때문에 '%n'을 사용하는 것이 더 안전하다
 * [참고] 지시자의 전체 목록을 보려면, Java API에서 Formatter클래스(java.util패키지)를 찾아보자
 */