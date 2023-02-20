package ch3;

public class OperatorEx5 {
    public static void main(String args[]) {

        int a = 10;
        int b = 4;

        System.out.printf("d + %d = %d%n", a, b, a + b);
        System.out.printf("d - %d = %d%n", a, b, a - b);
        System.out.printf("d * %d = %d%n", a, b, a * b);
        System.out.printf("d / %d = %d%n", a, b, a / b);
        System.out.printf("d / %f = %f%n", a, (float) b, a / (float) b);
    }
}

/*
 * - print : 괄호안 내용을 단순히 출력. 개행문자(=줄바꿈문자=\n) 포함안됨.
 * - println : 괄호안 내용을 출력한 후 마지막에 개행문자가 포함되어 있어 출력후 한 줄 띄워짐.
 */