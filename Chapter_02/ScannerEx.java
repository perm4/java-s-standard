/*
 * Date   : 2022. 08. 22.
 * Source : StringEx.java
 * Author : 이진규
 * Email  : jklee050@gmail.com
 */
import java.util.Scanner;

class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("두자리 정수를 하나 입력해주세요.>");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("입력내용 :"+input);
        System.out.printf("num=%d%n", num);
    }
}
