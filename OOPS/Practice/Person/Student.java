package OOPS.Practice.Person;

class Student extends Person{
    private int rollNumber;

    Student(String name, int age, int rollNumber)
    {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Roll Number: " + rollNumber);
    }
}
