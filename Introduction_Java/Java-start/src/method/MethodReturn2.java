package method;

public class MethodReturn2 {
    public static void main(String[] args) {
        checkAge(20);
    }
    public static void checkAge(int age){
        if(age<18){
            System.out.println("미성년자는 출입이 불가능해요");
            return;
        }
        System.out.println(age+ "살이군요. 입장하세요");
    }
}
