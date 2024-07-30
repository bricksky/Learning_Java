package oop1.ex;

public class RectangleOopMain {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.width = 8;
        rectangle.height = 8 ;

        rectangle.calculateArea();
        System.out.println("넓이: " + rectangle.calculateArea());
        rectangle.calculatePerimeter();
        System.out.println("둘레 길이: " + rectangle.calculatePerimeter());
        rectangle.isSquare();
        System.out.println("정사각형 여부: " + rectangle.isSquare());
    }
}
