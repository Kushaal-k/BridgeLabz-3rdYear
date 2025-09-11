package Polymorphism.Casting;

public class MainClass {
    public static void main(String[] args) {
        Parent obj = new Child();
        //UpCasting
        obj.show();
        // obj.display();

        //DownCasting
        Child c = (Child) obj;
        c.display();
    }
}
