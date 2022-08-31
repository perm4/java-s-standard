/*
 * Date   : 2022. 08. 22.
 * Source : PrintfEx1.java
 * Author : 이진규
 * Email  : jklee050@gmail.com
 */
package Chapter_02;
class PrintfEx2 {
  public static void main(String[] args) {
    String url = "www.codechobo.com";

    float f1 = .10f; // 0.10, 1.0e-1
    float f2 = 1e1f; // 10.0, 1.0e1, 1.0e+1
    float f3 = 3.14e3f;
    double d = 1.23456789;

    System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
    System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
    System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);

    System.out.printf("d=%f%n", d);
    System.out.printf("d=%14.10f%n", d); // 전체 14자리 중 소수점 10자리

    System.out.printf("[12345678901234567890]%n");
    System.out.printf("[%s]%n", url);
    System.out.printf("[%20s]%n", url);
    System.out.printf("[%-20s]%n", url);
    System.out.printf("[%.8s]%n", url);
  }
}

/*
 * 형식화된 출력 printf - 실수
 * 실수형 값의 출력에 사용되는 지시자
 * %f: 주로 쓰이는 형태, 기본적으로 소수점 이하 6자리까지만 출력, 7자리에서 반올림
 * System.out.printf("d=14.10f%n", d); // 전체 14자리 중 소수점 10자리
 * [참고] 지시자를 '%014.10'으로 지정했다면, 양쪽 빈자리를 모두 0으로 채웠을 것이다
 * %e: 지수형태로 출력
 * %g: 값을 간략하게 표현
 */