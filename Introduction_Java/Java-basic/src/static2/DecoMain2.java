package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s);
        // 클래스 자체에 바로 접근할 수 있음.

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
