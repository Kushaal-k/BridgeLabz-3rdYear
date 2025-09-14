package OOPS.Abstraction;

//We cannot inherit abstract class to normal class without overriding the non-conrete function
//We can inherite abstract class to abstract class though without overriding

public class Hello extends Demo{

    @Override
    public void m1()
    {
        System.out.println("Hii");
    }
    public void m3()
    {
        System.out.println("Hello m3");
    }
}
