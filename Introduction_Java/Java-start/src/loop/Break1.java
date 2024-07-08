package loop;

public class Break1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while(true) {
            sum = sum + i;
            if(sum > 10){
                System.out.println("합이 10보다 커서 종료했습니다." + "i= " + i);
                break;
            }
            i++;
        }
    }
}
