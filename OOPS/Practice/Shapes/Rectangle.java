package OOPS.Practice.Shapes;

public class Rectangle extends Shape{
    private double length, width;
    public final String name = "Rectangle";

    Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area()
    {
        return length*width;
    }
}
