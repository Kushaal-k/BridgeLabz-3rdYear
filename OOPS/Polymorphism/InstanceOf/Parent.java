package OOPS.Polymorphism.InstanceOf;

public class Parent { 
    
    public static void main(String[] args) {
        Parent p = new Parent();
        if(p instanceof Object)
        {
            System.out.println("true");
        }
    }
    

}
