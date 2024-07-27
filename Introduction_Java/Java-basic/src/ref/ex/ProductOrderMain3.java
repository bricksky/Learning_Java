package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("입력할 주문의 개수를 입력하세요");
        int count = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] orders = new ProductOrder[count];

        for(int i=0; i<orders.length; i++){
        System.out.println((i+1)+"번째 주문 정보를 입력하세요");

        System.out.println("상품명: ");
        String production = scanner.nextLine();

        System.out.println("가격: ");
        int price = scanner.nextInt();

        System.out.println("수량: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        orders[i] = createOrder(production,price,quantity);
    }

        printOrders(orders);
        int totalPrice = getTotalPrice(orders);
        System.out.println("총 결재 금액: " + totalPrice);
    }
    static ProductOrder createOrder(String production, int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.production = production;
        order.price = price;
        order.quauntity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders){
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.production + " 수량: " + order.quauntity + " 가격: " + order.price);
        }
    }
    static int getTotalPrice(ProductOrder[] orders){
        int totalPrice = 0;
        for (ProductOrder order : orders) {
            totalPrice += order.price * order.quauntity;
        }
        return totalPrice;
    }
}
