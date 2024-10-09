package lang.object.poly;

public class ObjectPolyExample2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Object();

        Object[] objects = {dog, car, object};
        size(objects);

    }

    // size 메서드는 배열에 담긴 객체의 수를 세는 역할을 함
    // Object 타입을 사용했기에, 모든 객체를 담을 수 있음
    private static void size(Object[] objects) {
        System.out.println("전달된 객체의 수: " + objects.length);
    }
}
