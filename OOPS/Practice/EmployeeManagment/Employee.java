package OOPS.Practice.EmployeeManagment;

public class Employee {
    private String id;
    private String name;
    private int salary;

    Employee(String id, String name, int salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public int getSalary()
    {
        return salary;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void displayDetails()
    {
        System.out.println("Employee Id: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}
