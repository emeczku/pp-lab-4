import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        employees.Employee[] employees = new employees.Employee[7];

        employees[0] = new Manager("John Doe", 80000);
        employees[1] = new Worker("Jane Smith", 60000, "Junior Developer");
        employees[2] = new employees.Employee("Michael Johnson", 55000);
        employees[3] = new Worker("Emily Brown", 52000, "Designer");
        employees[4] = new Worker("David Wilson", 53000, "Senior Developer");
        employees[5] = new Manager("Alice Green", 70000);
        employees[6] = new Worker("Bob Jones", 58000, "QA Engineer");

        for (employees.Employee employee : employees) {
            double currentSalary = employee.getSalary();
            employee.setSalary(currentSalary + 500);
        }

        int nonManagerEmployeesCount = 0;
        for (employees.Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                nonManagerEmployeesCount++;
            }
        }

        for (employees.Employee employee : employees) {
            if (employee instanceof Manager) {
                ((Manager) employee).setNumberOfSubordinates(nonManagerEmployeesCount);
                employee.setSalary(75000);
            }
        }

        System.out.println("Zaktualizowane informacje o pracownikach:");
        for (employees.Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
