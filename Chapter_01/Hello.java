/*
 * Date   : 2022. 08. 22.
 * Source : Hello.java
 * Author : 이진규
 * Email  : jklee050@gmail.com
 */
package Chapter_01;

class Hello {
  public static void main(String[] args) { /* 프로그램의 시작 */
    System.out.println("Hello, world."); // 화면에 글자(Hello, world.)를 출력한다.
  }
}

/*
 * 컴파일 & 실행
 * 컴파일러의 인코딩 방식과 소스파일의 인코딩 방식의 차이로 인해 오류 발생
 * -encoding UTF-8 추가하여 오류 해결
 * javac Hello.java -encoding UTF-8
 * java Hello
 */