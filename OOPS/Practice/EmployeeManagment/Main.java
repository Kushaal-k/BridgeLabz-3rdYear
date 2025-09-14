package OOPS.Practice.EmployeeManagment;

public class Main {
    public static void main(String[] args) {
        Employee developer = new Developer("123CPP", "John", 80000, "C++");
        Employee manager = new Manager("124HR", "Cat", 100000, "HR");

        Employee employees[] = {developer, manager};

        for(Employee employee : employees)
        {
            employee.displayDetails();
            System.out.println("---------------");
        }
    }
}
