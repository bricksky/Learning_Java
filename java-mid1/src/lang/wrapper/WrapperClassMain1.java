package lang.wrapper;

public class WrapperClassMain1 {
    public static void main(String[] args) {
        Integer newInteger = new Integer(10);   // 곧 삭제될 예정
        Integer integerObj = Integer.valueOf(10);

        Long newLong = Long.valueOf(30);
        Long longObj = Long.valueOf(30);

        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObj = " + integerObj);

        System.out.println("newLong = " + newLong);
        System.out.println("longObj = " + longObj);

        System.out.println("내부 값 읽기");

        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);

        System.out.println("비교");
        System.out.println("==: " + (newInteger == integerObj));
        System.out.println("equals: " + (newInteger.equals(integerObj)));
    }
}
