package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCost = 0;

        while(true){
            System.out.println("1: 상품입력, 2: 결재, 3: 프로그램 종료");
            int option = scanner.nextInt(); // 개행문자 해결을 안해주기에..

            if(option == 1){
                scanner.nextLine();

                System.out.println("상품명을 입력하세요: ");
                String product = scanner.nextLine();

                System.out.println("상품 가격을 입력하세요: ");
                int price = scanner.nextInt();

                System.out.println("구매 수량을 입력하세요: ");
                int quantity = scanner.nextInt();

                totalCost += price * quantity;
                System.out.println("상품명: " + product + ", 상품 가격: " + price + ", 구매 수령: " + quantity + ", 합계: "+price * quantity);

            } else if (option == 2) {
                System.out.println("총 비용: " + totalCost);
                totalCost = 0;
            } else if (option == 3){
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 옵션을 선택하세요");
            }
        }

    }
}
