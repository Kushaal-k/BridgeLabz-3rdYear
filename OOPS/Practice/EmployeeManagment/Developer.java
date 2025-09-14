package OOPS.Practice.EmployeeManagment;

public class Developer extends Employee{
    String programmingLanguage;

    Developer(String id, String name, int salary, String programmingLanguage)
    {
        super(id, name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Developer Programming Language: " + programmingLanguage);
    }
}
