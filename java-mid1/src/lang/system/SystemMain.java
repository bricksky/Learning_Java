package lang.system;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        // 현재 시간(밀리초)를 가져온다.
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        // 현재 시간(나노초)를 가져온다.
        long currentTimeNanos = System.nanoTime();
        System.out.println("currentTimeNanos = " + currentTimeNanos);

        // 환경 변수를 읽는다.
        System.out.println("getnv = " + System.getenv());

        // 시스템 속성을 읽는다.
        System.out.println("properties = " + System.getProperties());
        System.out.println("Java version = " + System.getProperty("java.version"));

        // 배열을 고속으로 복사한다.
        char[] originalArrary = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArrary = new char[5];
        System.arraycopy(originalArrary, 0, copiedArrary, 0, originalArrary.length);

        // 배열 출력
        System.out.println("copiedArrary = " + copiedArrary);
        System.out.println("copiedArrary = " + Arrays.toString(copiedArrary));
    }
}
