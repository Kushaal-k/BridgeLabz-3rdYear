package OOPS.MultipleInheritance;

public class ChildImpl implements IParent1, IParent2{
    @Override
    public void m1()
    {
        System.out.println("Hello i am inheriting two parent");
    }
}
