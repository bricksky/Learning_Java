package ch4;

public class FlowEx23 {
    public static void main(String[] args) {
        int i = 5;

        while (i-- != 0) {
            System.out.println(i + "-> I can do it");
        }
    }
}

/*
 * while (i-- != 0) 이 부분에서 i--는 후위연산이기에 4부터 값이 출력된다.
 */