package enumeration.ex3;

public class DiscountService {
    public int discount(Grade classGrade, int price){
        int discountPrice = 0;

        if(classGrade == Grade.BASIC){
            discountPrice = 10;
        } else if (classGrade == Grade.GOLD) {
            discountPrice = 20;
        } else if (classGrade == Grade.DIAMOND) {
            discountPrice = 30;
        } else {
            System.out.println("할인 없음");
        }
        return price * discountPrice / 100;
    }
}