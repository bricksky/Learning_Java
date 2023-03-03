package ch4;

public class FlowEx12 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++)
            System.out.println(i); // i의 값을 출력한다.

        for (int i = 1; i <= 5; i++)
            System.out.print(i); // print() 를 쓰면 가로로 출력된다.

        System.out.println();
    }
}

/*
 * print를 출력하면 값이
 * 1
 * 2
 * 3
 * 4
 * 5
 * 이렇게 안나오고,
 * 1 2 3 4 5 이렇게 나온다.
 */