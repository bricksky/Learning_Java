package ch4;

public class FlowEx14 {
    public static void main(String[] args) {
        for (int i = 1, j = 10; i <= 10; i++, j--)
            System.out.printf("%d \t %d%n", i, j);
    }
}

/*
 * i와 j를 더한 값이 11로 일정하다.
 * 따라서, j = 11 - i 라고 설정해두어도 된다.
 * 그러면 식이,
 * for(int i=1; i<=10; i++){
 * System.out.printf("%d \t %d%n", i, 11-i);
 * }
 */