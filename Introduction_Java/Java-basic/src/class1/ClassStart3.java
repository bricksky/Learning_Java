package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        // Student는 클래스로 선언된 타입이고, student2는 변수이다.
        // new Student()에서 new는 java에서 새로운 객체를 힙 메모리에 할당할 때 사용된다.
        // Student()는 Student 클래스의 생성자를 호출하여 새로운 Student 객체를 생성한다.

        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름: "+student1.name + " 나이: " +student1.age + " 성적: " +student1.grade);
        System.out.println("이름: "+student2.name + " 나이: " +student2.age + " 성적: " +student2.grade);
    }
}
