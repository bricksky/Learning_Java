package ch4;

public class FlowEx21 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                if (i == j) {
                    System.out.printf("[%d,%d]", i, j);
                } else {
                    System.out.printf("%5c", ' ');
                }
            }
            System.out.println();
        }

    }

}

/*
 * 이 코드에서 System.out.printf("%5c", ' '); 부분은 출력문을 정렬하는 기능을 수행합니다.
 * 
 * %5c에서 %c는 문자(character)를 출력하기 위한 포맷 코드이며,
 * %5c는 문자를 출력할 때 전체 폭(width)을 5로 지정하는 것을 의미합니다.
 * 따라서 이 부분은 너비가 5인 공백 문자(' ')를 출력하여 출력문을 정렬하는 역할을 합니다.
 * 
 * 즉, i와 j가 같을 때는 "[%d,%d]"와 같은 문자열을 출력하고,
 * 그렇지 않을 때는 너비가 5인 공백을 출력하여 각 문자열이 정렬되게 합니다.
 * 
 */