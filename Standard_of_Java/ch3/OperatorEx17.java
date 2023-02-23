package ch3;

public class OperatorEx17 {
    public static void main(String args[]) {
        double pi = 3.141592;
        double shortPi = (int) (pi * 1000 + 0.5) / 1000.0; // 3141.5 + 0.5 -> 3142

        System.out.println(shortPi);
    }

}
