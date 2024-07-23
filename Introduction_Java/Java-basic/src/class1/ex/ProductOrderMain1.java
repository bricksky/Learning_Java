package class1.ex;

public class ProductOrderMain1 {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        ProductOrder order1 = new ProductOrder();
        order1.production = "두부";
        order1.price = 2000;
        order1.quauntity = 2;
        orders[0] = order1;

        ProductOrder order2 = new ProductOrder();
        order2.production = "김치";
        order2.price = 5000;
        order2.quauntity = 1;
        orders[1] = order2;

        ProductOrder order3 = new ProductOrder();
        order3.production = "콜라";
        order3.price = 1500;
        order3.quauntity = 2;
        orders[2] = order3;

        int totalPrice = 0;
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.production + " 수량: " + order.quauntity + " 가격: " + order.price);
            totalPrice += order.price * order.quauntity;
        }
        System.out.println("총 결재 금액: " + totalPrice);
    }

}
