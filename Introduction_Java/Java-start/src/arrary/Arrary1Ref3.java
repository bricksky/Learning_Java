package arrary;

public class Arrary1Ref3 {
    public static void main(String[] args) {
        int [] students;    //배열 변수 선언
        students = new int[]{90, 80, 70, 90, 100};  // 배열 생성과 초기화

        for(int i=0; i<students.length; i++){
            System.out.println("학생" + (i+1) +" 점수: " + students[i]);
        }
    }
}
