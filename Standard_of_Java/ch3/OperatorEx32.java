package ch3;

public class OperatorEx32 {
    public static void main(String[] args) {
        int x, y, z;
        int absX, absY, absZ;
        char signX, signY, signZ;

        x = 10;
        y = -5;
        z = 0;

        absX = x >= 0 ? x : -x; // 값이 음수인 경우 -를 곱해서 음수에서 양수로 값을 바꾼다.
        absX = y >= 0 ? y : -y;
        absX = z >= 0 ? z : -z;

        signX = x > 0 ? '+' : (x == 0 ? ' ' : '-'); // 조건 연산자를 중첩
        signY = y > 0 ? '+' : (y == 0 ? ' ' : '-');
        signZ = z > 0 ? '+' : (z == 0 ? ' ' : '-');

        System.out.printf("x=%c%d%n", signX, absX);
        System.out.printf("y=%c%d%n", signY, absY);
        System.out.printf("z=%c%d%n", signZ, absZ);
    }
}