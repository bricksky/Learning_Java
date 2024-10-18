package lang.string.immutable;

public class StringImmutable2 {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1.concat(" java");

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        // String은 불변객체이기에, 변경이 필요한 경우에는 기존 값을 변경하는 것이 아닌!
        // 새로운 결과를 만들어서 반환해야 한다.
    }
}