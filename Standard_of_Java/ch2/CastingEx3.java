public class CastingEx3 {
    public static void main(String[] args) {
        float f = 9.1234567f;
        double d = 9.1234567;
        double d2 = (double) f;

        System.out.printf("f=%20.18f\n", f);
        System.out.printf("d=%20.18f\n", d); // 전체 20자리 중에서 18자리는 소수점 이하의 수를 출력하세요! (교재 70쪽 참고)
        System.out.printf("d2=%20.18f\n", d2);
    }
}