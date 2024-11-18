package test;

import java.time.LocalDateTime;

public class TestPlus {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2024, 11, 18, 11, 07);
        LocalDateTime futureDateTime = dateTime.plusDays(1).plusHours(2);
        System.out.println("기준 시각: " + dateTime);
        System.out.println("미래 시간: " + futureDateTime);

    }
}
