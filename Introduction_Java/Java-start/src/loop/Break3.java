package loop;

public class Break3 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i=1; ; i++) {  //for문은 조건이 없으면 무한 반복한다.
            sum = sum + i;
            if(sum > 10){
                System.out.println("합이 10보다 커서 종료했습니다." + " i= " + i);
                break;
            }
        }
    }
}
