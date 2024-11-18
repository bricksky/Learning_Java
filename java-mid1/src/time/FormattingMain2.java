package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {
    public static void main(String[] args) {
        // 포맷팅: 날짜와 시간을 문자로
        LocalDateTime localDateTime = LocalDateTime.of(2024, 11, 18, 10, 55);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyy-MM-dd HH:mm:ss");
        String formattedDateTime = localDateTime.format(dateTimeFormatter);
        System.out.println("날짜와 시간 포맷팅: " + formattedDateTime);

        // 파싱: 문자를 날짜와 시간으로
        String dateTimeString = "2024-11-14 10:58:00";
        LocalDateTime parssedDateTime = LocalDateTime.parse(dateTimeString, dateTimeFormatter);
        System.out.println("문자열 파싱 날짜와 시간: " + parssedDateTime);
    }
}