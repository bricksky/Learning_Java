package ch3;

public class OperatorEx26 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        System.out.printf("a=%d, b=%d%n", a, b);
        System.out.printf("a!=0 || ++b!=0 = %b%n", a != 0 || ++b != 0);
        System.out.printf("a=%d, b=%d%n", a, b);
        System.out.printf("a==0 && ++b!=0 = %b%n", a == 0 && ++b != 0);
        System.out.printf("a=%d, b=%d%n", a, b);
    }
}

/*
 * 내 생각
 * a=5, b=0
 * false -> a=0이 아니니까 true이고, b도 0이 아니니까 둘 중 하나를 만족해서 true
 * a=5, b=0
 * true -> a=0이 아니니까 false이고, b도 0이 아니니까 true인데, 둘다 만족하지 못해서 false
 * a=5, b=0
 */

/*
 * 정답:
 * a=5, b=0
 * a!=0 || ++b!=0 = true
 * a=5, b=0
 * a==0 && ++b!=0 = false
 * a=5, b=0
 */