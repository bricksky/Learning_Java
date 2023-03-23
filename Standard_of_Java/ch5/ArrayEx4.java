public class ArrayEx4 {
    public static void main(String[] args) {
        char[] abc = { 'A', 'B', 'C', 'D' };
        char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
        System.out.println(abc);
        System.out.println(num);

        // 배열 abc와 베열 num을 붙여서 하나의 배열 (result)로 만든다.
        char[] result = new char[abc.length + num.length];
        System.arraycopy(abc, 0, result, 0, abc.length); // abc 0에서 result0으로 abc.length개의 데이터를 복사한다.
        System.arraycopy(num, 0, result, abc.length, num.length); // num 0에서 result0으로 abc.length개의 데이터를 복사한다.
        System.out.println(result);

        // 배열 abc를 배열 num의 첫 번째 위치부터 배열 abc의 길이만큼 복사.
        System.arraycopy(abc, 0, num, 0, abc.length); // abc 0에서 num0 으로 abc.length개의 데이터를 복사한다.
        System.out.println(num);

        // number의 인덱스 6 위치에 3개를 복사
        System.arraycopy(abc, 0, num, 6, 3);
        System.out.println(num);
    }
}

/*
 * 15행, 16행 추가 설명:
 * 따라서, 실행 결과로는 abc 배열의 데이터가 num 배열의 처음부터 출력됩니다.
 * 예를 들어, abc 배열이 {'A', 'B', 'C', 'D'}이고, num 배열이 {'0', '1', '2', '3', '4', '5',
 * '6', '7', '8', '9'}인 경우,
 * 위 코드를 실행하면 num 배열의 값은 {'A', 'B', 'C', 'D', '4', '5', '6', '7', '8', '9'}가
 * 됩니다.
 */