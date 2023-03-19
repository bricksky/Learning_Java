package ch4;

public class FlowEx31 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 3 == 0) // 3,6,9의 경우 나머지가 없으므로 continue문을 만나 가장 아래로 이동한다.
                continue;
            System.out.println(i);
        }
    }
}

// continue문의 경우, 반복이 진행되는 도중에 continue문을 만나면 반복문의 끝으로 이동하여 다음 반복으로 이동하게된다.