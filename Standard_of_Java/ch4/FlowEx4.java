package ch4;

import java.util.*;

public class FlowEx4 {
    public static void main(String[] args) {
        int score = 0; // 점수를 저장하기 위한 변수
        char grade = ' '; // 학점을 저장하기 위한 변수, 공백으로 초기화 함

        System.out.print("점수를 입력하세요. -> ");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        if (score >= 90) // 점수가 90점 이상이면 A
        {
            grade = 'A';
        } else if (score >= 80) // 점수가 80점 이상이면 B
        {
            grade = 'B';
        } else if (score >= 70) // 점수가 70점 이상이면 C
        {
            grade = 'C'; // 나머지는 D
        } else {
            grade = 'D';
        }
        System.out.println("당신의 학점은 " + grade + "입니다.");
    }
}
