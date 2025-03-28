package time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitMain {

    public static void main(String[] args) {
        ChronoUnit[] values = ChronoUnit.values();
        for(ChronoUnit value : values) {
            System.out.println("value: " + value);
        }

        System.out.println("Hours: " + ChronoUnit.HOURS);
        System.out.println("Hours duration : " + ChronoUnit.HOURS.getDuration().getSeconds());
        System.out.println("Days: " + ChronoUnit.DAYS);

        // 차이 구하기
        LocalTime lt1 = LocalTime.of(1,20,0);
        LocalTime lt2 = LocalTime.of(1,30,0);

        long secondsBetween = ChronoUnit.SECONDS.between(lt1, lt2);
        System.out.println("secondsBetween: " + secondsBetween);
    }
}