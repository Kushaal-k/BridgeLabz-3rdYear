package OOPS.Practice.Shapes;

public class Circle extends Shape{
    private double radius;
    public final String name = "Circle";
    Circle(double radius)
    {
        this.radius = radius;
    }
    @Override
    public double area()
    {
        return 3.14*radius*radius;
    }
}
