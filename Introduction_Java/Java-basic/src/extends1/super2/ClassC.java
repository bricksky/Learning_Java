package extends1.super2;

public class ClassC extends ClassB {

    public ClassC(){
//        super(); 기본 생성자가 아니기에 직접 설정해주어야 함.
//        super(10, 20);
        super(30);
        System.out.println("ClassC 생성자");

    }

}
