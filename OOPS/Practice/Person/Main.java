package OOPS.Practice.Person;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Kushaal", 22, 41);
        s1.displayInfo();

        Teacher t1 = new Teacher("XYZ", 41, "CS");
        t1.displayInfo();
    }
}
