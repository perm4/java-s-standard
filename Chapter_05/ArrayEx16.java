/*
 * Date   : 2022. 10. 02.
 * Source : ArrayEx16.java
 * Author : 이진규
 * Email  : jklee050@gmail.com
 */
package Chapter_05;

class ArrayEx16 {
  public static void main(String[] args) {
    System.out.println("매개변수의 개수:" + args.length);
    for(int i = 0; i < args.length; i++) {
      System.out.println("args[" + i + "] = \"" + args[i] + "\"");
    }
  }  
}

/*
 * $ /usr/bin/env C:\\tools\\jdk\\jdk-11\\bin\\java.exe -cp
 * C:\\Users\\moddi\\AppData\\Roaming\\Code\\User\\workspaceStorage\\
 * 141ae764b88775197945bd6ef234b38a\\redhat.java\\jdt_ws\\java\'s\
 * standard_671e3c5d\\bin Chapter_05.ArrayEx16
 * 매개변수의 개수:0
 * 
 * $ /usr/bin/env C:\\tools\\jdk\\jdk-11\\bin\\java.exe -cp
 * C:\\Users\\moddi\\AppData\\Roaming\\Code\\User\\workspaceStorage\\
 * 141ae764b88775197945bd6ef234b38a\\redhat.java\\jdt_ws\\java\'s\
 * standard_671e3c5d\\bin Chapter_05.ArrayEx16 abc 123 "Hello world"
 * 매개변수의 개수:3
 * args[0] = "abc"
 * args[1] = "123"
 * args[2] = "Hello world"
 */