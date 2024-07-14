package arrary;

public class ArraryDi0 {
    public static void main(String[] args) {
        // 2* 3의 2차원 배열을 만든다.
        int[][] arr = new int[2][3];

        arr[0][0] = 1;  // 0행 0렬
        arr[0][1] = 2;  // 0행 1렬
        arr[0][2] = 3;  // 0행 2렬
        arr[1][0] = 4;  // 1행 0렬
        arr[1][1] = 5;  // 1행 1렬
        arr[1][2] = 6;  // 1행 2렬

        // 0행 출력
        System.out.print(arr[0][0] + " "); // 0열 출력
        System.out.print(arr[0][1] + " "); // 1열 출력
        System.out.print(arr[0][2] + " "); // 2열 출력
        System.out.println();
        // 1행 출력
        System.out.print(arr[1][0] + " "); // 0열 출력
        System.out.print(arr[1][1] + " "); // 1열 출력
        System.out.print(arr[1][2] + " "); // 2열 출력
    }
}
