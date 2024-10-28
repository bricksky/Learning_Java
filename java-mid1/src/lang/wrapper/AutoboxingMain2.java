package lang.wrapper;

public class AutoboxingMain2 {
    public static void main(String[] args) {
        // Primative -> Wrapper
        int value = 7;
        Integer boxedValue = value; // 오토 박싱: 자동으로 자바에서 실행

        // Wrapper -> Primative
        int unboxedValue = boxedValue;  // 오토 언박싱

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
