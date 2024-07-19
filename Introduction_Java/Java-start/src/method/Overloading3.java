package method;

public class Overloading3 {
    public static void main(String[] args) {
        System.out.println("1: " + add(10,20));
        System.out.println("2: " + add(23.5,45.8));
    }

    public static int add(int a, int b){
        System.out.println("1번 호출");
        return a + b;
    }
    public static double add(double a, double b){
        System.out.println("2번 호출");
        return a + b;
    }
}
