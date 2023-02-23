package ch3;

public class OperatorEx15 {
    public static void main(String[] args) {
        char lowerCase = 'a';
        char uppercase = (char) (lowerCase - 32);
        System.out.println(uppercase);
    }
}

/*
 * a의 아스키 코드 값: 97
 * A의 아스키 코드 값: 65
 * 소문자 a와 대문자 A의 아스키코드 값의 차이는 32이다.
 * 소문자에서 대문자로 변환하고 싶다면 32를 빼면되고, 대문자에서 소문자로 변환하고 싶다면 32를 더하면 된다.
 */