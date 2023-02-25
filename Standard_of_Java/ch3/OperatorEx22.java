package ch3;

public class OperatorEx22 {
    public static void main(String args[]) {
        float f = 0.1f;
        double d = 0.1f;
        double d2 = (double) f;

        System.out.printf("10.0==10.0f  %b%n", 10.0 == 10.0f);
        System.out.printf("0.1==0.1f    %b%n", 0.1 == 0.1f);
        System.out.printf("f = %19.17f%n", f);
        System.out.printf("d = %19.17f%n", d);
        System.out.printf("d2 = %19.17f%n", d2);
        System.out.printf("d==f %b%n", d == f);
        System.out.printf("d==d2 %b%n", d == d2);
        System.out.printf("d2==f %b%n", d2 == f);
        System.out.printf("(float)d==f %b%n", (float) d == f);
    }
}

/*
 * 정수형과 달리 실수형은 근사값으로 저장되므로 오차가 발생한다.
 * -> 10.0 은 결과값이 true로 나오지만, 0.1은 그렇지 않은 이유가 바로 이 때문이다
 */
