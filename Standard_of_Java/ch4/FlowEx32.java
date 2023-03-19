package ch4;

import java.util.*;

public class FlowEx32 {
    public static void main(String[] args) {
        int menu = 0;
        int num = 0;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.print("원하는 메뉴(1~3)를 선택하세요. (종료:0)");

            String tmp = scanner.nextLine();
            menu = Integer.parseInt(tmp);

            if (menu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("메뉴를 잘못 선택하셨습니다. (종료:0)");
                continue;
            }
            System.out.println("선택하신 메뉴는" + menu + "번 입니다.");
        }
    }
}

/*
 * 23행에서 ! (논리 부정 연산자)는 해당 조건식의 결과값을 반대로 바꾸는 역할을 합니다.
 * 따라서 !(1 <= menu && menu <= 3)은 "menu가 1 이상 3 이하가 아닌 경우"를 의미합니다.
 * 즉, 사용자가 입력한 메뉴가 1~3 사이의 값이 아닌 경우를 처리하는 조건문입니다.
 */