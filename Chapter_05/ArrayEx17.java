/*
 * Date   : 2022. 10. 02.
 * Source : ArrayEx17.java
 * Author : 이진규
 * Email  : jklee050@gmail.com
 */
package Chapter_05;

class ArrayEx17 {
  public static void main(String[] args) {
    if(args.length != 3) {
      System.out.println("usage: java ArrayEx17 NUM1 OP NUM2");
      System.exit(0);
    }

    int num1 = Integer.parseInt(args[0]); // 문자열을 숫자로 변환한다.
    char op = args[1].charAt(0);
    int num2 = Integer.parseInt(args[2]); // 문자열을 문자(char)로 변환한다.

    int result = 0;

    switch(op) { // switch문의 수식으로 char타입의 변수도 가능하다.
      case '+':
        result = num1 + num2;
        break;
      case '-':
        result = num1 - num2;
        break;
      case '*':
        result = num1 * num2;
        break;
      case '/':
        result = num1 / num2;
        break;
      default:
        System.out.println("지원되지 않는 연산입니다.");
    }

    System.out.println("결과:" + result);
  }
}

/*
 * $ /usr/bin/env C:\\tools\\jdk\\jdk-11\\bin\\java.exe -cp
 * C:\\Users\\moddi\\AppData\\Roaming\\Code\\User\\workspaceStorage\\
 * 141ae764b88775197945bd6ef234b38a\\redhat.java\\jdt_ws\\java\'s\
 * standard_671e3c5d\\bin Chapter_05.ArrayEx17
 * usage: java ArrayEx17 NUM1 OP NUM2
 * 
 * 
 * $ /usr/bin/env C:\\tools\\jdk\\jdk-11\\bin\\java.exe -cp
 * C:\\Users\\moddi\\AppData\\Roaming\\Code\\User\\workspaceStorage\\
 * 141ae764b88775197945bd6ef234b38a\\redhat.java\\jdt_ws\\java\'s\
 * standard_671e3c5d\\bin Chapter_05.ArrayEx17 3 + 2
 * 결과:5
 */