package OOPS.Polymorphism;

public class MathUtils {
    public int add(int a, int b)
    {
        return a+b;
    }

    public double add(double a, double b)
    {
        return a+b;
    }

    public int add(int a, int b, int c)
    {
        return a+b+c;
    }

    public static void main(String[] args) {
        MathUtils mu = new MathUtils();
        System.out.println(mu.add(5.8, 3.9));
        System.out.println(mu.add(5, 3));
        System.out.println(mu.add(5, 6, 7));
    }
}
