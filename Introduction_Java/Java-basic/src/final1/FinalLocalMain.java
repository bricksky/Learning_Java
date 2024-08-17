package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        // Final 지역 변수
        final int data1;
        data1 = 10; // 최초에 1번만 가능!
        // data1 = 20; -> 컴파일 오류

        final int data2 = 30;
    }

    static void method(final int paramater){
//        paramater = 20; -> 여기서도 수정 불가능
    }
}
