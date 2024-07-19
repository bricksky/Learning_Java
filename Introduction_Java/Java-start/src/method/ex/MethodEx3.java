package method.ex;

public class MethodEx3 {
    public static void main(String[] args) {

        int balance = 10000;

        // 입금
        int depositAmount = 1000;
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance +"원");

        // 출금
        int withdrawMoney = 2000;
        if(balance >= withdrawMoney){
            balance -= withdrawMoney;
            System.out.println(withdrawMoney +"원을 출금하였습니다. 현재 잔액: " + balance +"원");
        } else {
            System.out.println(withdrawMoney + "원을 출력하려 햇으니 잔액이 부족합니다.");
        }
        System.out.println("최종 잔액: " + balance + "원");
    }
}
