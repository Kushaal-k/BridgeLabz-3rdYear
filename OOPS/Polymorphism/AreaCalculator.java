package OOPS.Polymorphism;

public class AreaCalculator {
    public static int area(int side){
        return side*side;
    }

    public static int area(int length, int breadth){
        return length*breadth;
    }

    public static double area(double radius){
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        System.out.println(area(4));
        System.out.println(area(4.5));
        System.out.println(area(4,5));
    }
}
