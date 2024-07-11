package scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        // Scanner은 자바 표준 라이브러리에 포함된 클래스이다.
        Scanner scanner = new Scanner(System.in);
        // Scanner scanner에서 scanner은 클래스의 변수이다.

        while(true) {
            System.out.print("문자열을 입력하세요: (exit: 종료)");
            String str = scanner.nextLine();
            // String 클래스의 scanner에 입력 받은 내용을
            if(str.equals("exit")){
                break;
            }
            System.out.println("입력한 문자열: " + str);
            System.out.println("프로그램을 종료합니다.");
        }
    }
}
