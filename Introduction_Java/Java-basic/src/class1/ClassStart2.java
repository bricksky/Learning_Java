package class1;

public class ClassStart2 {

    public static void main(String[] args) {
        String[] studentNames = {"학생1" , "학생2"};
        int[] studentsAge = {15, 16};
        int[] studentsGrade = {90, 80};

        for(int i=0; i<studentNames.length; i++){
            System.out.println("이름: " + studentNames[i] + " 나이: " + studentsAge[i] + " 성적: " +studentsGrade[i]);
        }
    }
}

// 위 코드의 경우 학생 1명의 정보가 3개의 변수에 나뉘어 담겨져 있기에 수정시 주의를 해야한다.
// 각각의 배열 요소에 접근해서 수정해야 한다는 단점이 존재한다. -> 이런 문제는 "클래스 개념"의 도입으로 해결할 수 있다!