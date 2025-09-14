package OOPS.Practice.EmployeeManagment;

public class Manager extends Employee{
    String department;

    Manager(String id, String name, int salary,String department)
    {
        super(id, name, salary);
        this.department = department;
    }

    @Override
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Manager Department: "+ department);
    }
}
