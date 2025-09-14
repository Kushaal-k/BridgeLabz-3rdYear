package OOPS.Practice.Shapes;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        Circle circle = new Circle(4);

        Shape arr[] = {rectangle,circle};
        System.out.println(rectangle.name);
        for(Shape shape : arr) {
            double area = shape.area();
            System.out.println("Area : " + area);
        }
    }
}
