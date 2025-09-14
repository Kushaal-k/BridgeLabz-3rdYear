package OOPS.MultipleInheritance;

public class Main {
    public static void main(String[] args) {
        IParent1 p1 = new ChildImpl();
		IParent2 p2 = new ChildImpl();
		
		p1.m1();
		p2.m1();
    }
}
