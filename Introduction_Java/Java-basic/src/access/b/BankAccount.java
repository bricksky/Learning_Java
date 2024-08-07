package access.b;

public class BankAccount {

    private int balance;

    public BankAccount(){
        balance = 0;
    }

    // 입금
    public void deposit(int amount){
        if (isAmounntValid(amount)){
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    // 출금
    public void withdraw(int amount){
        if(isAmounntValid(amount)&&balance-amount>0){
            balance -= amount;
        }
    }

    public int getBalance(){
        return balance;
    }


    private boolean isAmounntValid(int amount){
        return amount > 0;
    }
}
