package ch3;

public class OperatorEx4 {
    public static void main(String[] args) {
        int i = -10;
        i = +i;
        System.out.println(i);

        i = -10;
        i = -i;
        System.out.println(i);
    }
}

// -는 부호를 반대로 바꿔준다. -는 +로, +는 -로
// 반면 +는 하는게 없다.