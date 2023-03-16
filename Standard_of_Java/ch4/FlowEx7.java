package ch4;

import java.util.*;

public class FlowEx7 {
    public static void main(String[] args) {
        System.out.printf("가위(1), 바위(2), 보(3) 중 하나를 입력하세요. -> ");

        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();
        int com = (int) (Math.random() * 3) + 1;
    }
}
