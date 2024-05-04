public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Tom Ellis", 50000);
        employees[1] = new Employee("Jake Brown", 60000);
        employees[2] = new Employee("Emily Clark", 55000);
        employees[3] = new Employee("Emily Brown", 52000);
        employees[4] = new Employee("David Wilson", 53000);

        System.out.println("Dane dla pracownika o indeksie 3:");
        System.out.println(employees[3]);

        employees[3].setSalary(54000);

        System.out.println("\nDane dla wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
