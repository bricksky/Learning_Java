package ch3;

public class OperatorEx13 {
    public static void main(String[] args) {
        char c1 = 'a';

        // char c2 = c1 + 1;
        // char c2 = (char) (c1 + 1);
        // char c2 = 'a' + 2;
        char c2 = 'a' + 2;

        System.out.println(c2);
    }
}

/*
 * 
 * 오답: char c2 = c1 + 1; ->
 * 정답: char c2 = (char) (c1 + 1); ->
 * 
 */