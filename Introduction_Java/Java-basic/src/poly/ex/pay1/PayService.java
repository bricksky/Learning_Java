package poly.ex.pay1;

public class PayService {

    public void processPay(String option, int amount){

        boolean result = false;
        System.out.println("결재를 시작합니다: option= "+ option + ", amount" + amount);

        Pay pay = findPay(option);
        if(pay != null) {
            result = pay.pay(amount);
        }

        if(result){
            System.out.println("결재가 성공했습니다.");
        } else {
                System.out.println("결재가 실패했습니다");
            }
    }

    public Pay findPay(String option){

        Pay pay = findPay(option);
        if(option.equals("kakao")){
           return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else if (option.equals("new")) {
            return new NewPay();
        }else {
            System.out.println("결재 수단이 없어용");
            return null;
        }
    }
}
