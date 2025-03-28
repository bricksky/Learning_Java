package class1;

public class ClassStart5 {
    public static void main(String[] args) {

        // 클래스에 의해 만들어진 student1은 "객체 또는 인스턴스"
        Student student1 = new Student();

        // .은 메모리에 존재하는 객체에 접근하는 키워드이다.
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 18;
        student2.grade = 80;

        Student[] students = {student1, student2};

/*        for(int i=0; i<students.length; i++) {
            Student s = students[i];
            System.out.println("이름: " + s.name + ", 나이: " + s.age + ", 성적: " + s.grade);
        }*/

        for(Student s : students) {
            System.out.println("이름: " + s.name + ", 나이: " + s.age + ", 성적: " + s.grade);
        }
    }
}
