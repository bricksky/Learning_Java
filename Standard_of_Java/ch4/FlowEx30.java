package ch4;

public class FlowEx30 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while (true) {
            if (sum > 100) // if가 100을 넘으면 바로 break문 들어감.
                break;
            ++i;
            sum += i; // sum에는 i가 1부터, 2, 3, 4, 차례로 하나씩 들어감.
        }

        System.out.println("i=" + i);
        System.out.println("sum=" + sum);
    }
}
