package casting;

public class Casting3 {

    public static void main(String[] args) {
        long maxIntValue = 2147483647L;  // int 최고값
        long maxIntOver = 2147483648L;  // int 최고값 + 1(초과)
        int intvalue = 0;

        intvalue = (int) maxIntValue;   // 형 변환
        System.out.println("maxIntValue casting = " + intvalue);

        intvalue = (int) 2147483648L;    // 형 변환
        System.out.println("maxIntOver casting = " + intvalue);
    }
}
