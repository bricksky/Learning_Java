package ch4;

import java.util.*;

public class FlowEx5 {
    public static void main(String[] args) {
        int score = '0';
        char grade = ' ', opt = '0';

        System.out.print("정수를 입력해주세요. ->");

        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        System.out.printf("당신의 점수는 %d입니다. %n", score);

        if (score >= 90) { // 90점 이상이면 A
            grade = 'A';
            if (score >= 98) { // "90점 이상이면 A"를 만족시키면서 98을 넘기면 +
                opt = '+';
            } else if (score < 94) { // "90점 이상이면 A"를 만족시키면서 94보다 작으면 -
                opt = '-';
            }
        } else if (score >= 80) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if (score < 84) {
                opt = '-';
            }
        } else {
            grade = 'C'; // 90점 이상, 80점 이상을 모두 만족시키지 못하면 바로 C학점
        }
        System.out.printf("당신의 학점은 %c%c입니다.", grade, opt);
    }
}
