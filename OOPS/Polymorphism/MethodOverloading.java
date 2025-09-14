package OOPS.Polymorphism;

public class MethodOverloading {
    public void add(){
        
    }
    public int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        MethodOverloading o = new MethodOverloading();

        o.add();
        o.add(0, 0);
    }
}
