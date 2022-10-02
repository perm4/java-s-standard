/*
 * Date   : 2022. 10. 02.
 * Source : ArrayEx15.java
 * Author : 이진규
 * Email  : jklee050@gmail.com
 */
package Chapter_05;

class ArrayEx15 {
  public static void main(String[] args) {
    String source = "SOSHELP";
    String[] morse = {".-", "-...", "-.-.", "-..", "."
                     ,"..-.", "--.", "....", "..", ".---"
                     ,"-.-", ".-..", "--", "-.", "---"
                     ,".--.", "--.-", ".-.", "...", "-"
                     ,"..-", "...-", ".--", "-..-", "-.--"
                     ,"--.."};
    
    String result = "";

    for(int i = 0; i < source.length(); i++) {
      result+=morse[source.charAt(i)-'A'];
    }

    System.out.println("source:" + source);
    System.out.println("morse:" + result);
  }  
}

/*
 * 문자열(String)을 모르스(morse)부호로 변환하는 예제이다.
 * 이전의 16진수를 2진수로 변환하는 예제와 같지만, char배열 대신 이번엔 String을 사용했다.
 * String의 문자의 개수는 length()를 통해서 얻을 수 있고, charAt(int i)메서드는 String의 i번째 문자를
 * 반환한다.
 * 그래서 for문의 조건식에 length()를 사용하고 charAt(int i)를 통해서 source에서 한 문자씩 차례대로 읽어 올 수
 * 있다.
 * 
 * result+=morse[source.charAt(i)-'A']; // i가 0 일때
 * result+=morse[source.charAt(0)-'A']; // source.charAt(0)는 첫 번째 문자
 * result+=morse['S'-'A']; // 'S' - 'A' -> 83 - 65 -> 18
 * result+=morse[18];
 * result+="..."; // result = result + "..."; 와 같다.
 */