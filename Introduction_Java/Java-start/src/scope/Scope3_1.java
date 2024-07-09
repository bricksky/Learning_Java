package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0;
        if(m > 0){
            temp = m * 2;
            System.out.println("temp = " + temp);
            // temp = 20
            // temp 변수는 if문 내에서만 사용하면 되기에 생존 범위를 늘리는겸. 굳이 main영역에 둘 필요x
            // 비효율적인 메모리 사용..
        }
        System.out.println("m = " + m);
        // m = 10
    }
}
