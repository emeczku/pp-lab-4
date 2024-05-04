import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        employees.Employee[] employees = new employees.Employee[5];

        employees[0] = new Manager("John Doe", 80000);
        employees[1] = new Worker("Jane Smith", 60000, "Junior Developer");
        employees[2] = new employees.Employee("Michael Johnson", 55000);
        employees[3] = new Worker("Emily Brown", 52000, "Designer");
        employees[4] = new Worker("David Wilson", 53000, "Senior Developer");

        int nonManagerEmployeesCount = 0;
        for (employees.Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                nonManagerEmployeesCount++;
            }
        }

        ((Manager) employees[0]).setNumberOfSubordinates(nonManagerEmployeesCount);

        employees[0].setSalary(75000);

        System.out.println("Dane dla wszystkich pracowników:");
        for (employees.Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
