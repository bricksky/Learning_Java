package poly.ex.pay1;

public class DefaultPay implements Pay{

    @Override
    public boolean pay(int amunt){
        System.out.println("결재 수단이 없습니다.");
        return false;
    }
}
