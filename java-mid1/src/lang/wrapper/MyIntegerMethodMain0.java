package lang.wrapper;

public class MyIntegerMethodMain0 {
    public static void main(String[] args) {
        int value = 20;

        // compareTo()라는 외부 메서드를 이용함.
        int int1 = compareTo(value, 5);
        int int2 = compareTo(value, 30);
        int int3 = compareTo(value, 20);

        System.out.println("int1 = " + int1);
        System.out.println("int2 = " + int2);
        System.out.println("int3 = " + int3);
    }

    public static int compareTo(int value, int target){
        if(value < target){
            return -1;
        } else if(value > target){
            return 1;
        } else {
            return 0;
        }
    }
}
