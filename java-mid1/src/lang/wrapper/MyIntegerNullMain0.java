package lang.wrapper;

public class MyIntegerNullMain0 {
    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};
        System.out.println(findValue(intArr,2));
        System.out.println(findValue(intArr,3));
        System.out.println(findValue(intArr,41));
    }


    private static int findValue(int[] intArr, int targer){
        for(int value: intArr){
            if(value == targer){
                return value;
            }
        }
        return -1;
    }
}
