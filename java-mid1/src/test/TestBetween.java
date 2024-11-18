package test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 11, 18);
        LocalDate endDate = LocalDate.of(2025, 2, 6);

        Period between = Period.between(startDate, endDate);
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("시작 날짜: " + startDate);
        System.out.println("목표 날짜: " + endDate);

        System.out.println("남은 기간: " + between.getYears() + "년 " + between.getMonths() + "월 " + between.getDays() + "일");
        System.out.println("D-day: " + daysBetween);
    }
}
