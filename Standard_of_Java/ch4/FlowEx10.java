package ch4;

import java.util.*;

public class FlowEx10 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        System.out.print("당신의 점수를 입력하세요. (1~100) -> ");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine(); // 화면을 통해 입력받은 내용을 tmp로 전환
        score = Integer.parseInt(tmp); // 입력받은 문자열(tmp)를 숫자로 변환

        switch (score / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            default:
                grade = 'F';
        } // end of switch
        System.out.println("당신의 학점은" + grade + "입니다.");
    }
}

/*
 * int형 나누기 int형은 int이다.
 * 함수를 선언할 때, score를 int형으로 바꾸었고, switch문에서 int형으로 나누기에 값도 int형으로 나온다.
 * 88 나누기 10은 정수형으로 나오기에 8.8이 아닌 8로 값이 출력된다.
 * 책에서도 나왔지만, switch부분에서 간략하게 식을 작성해 코드를 짧게 쓰는 것이 좋다고 한다.
 * 
 * 실수
 * -switch 문 이후 break를 작성하지 않았다.
 */
