package employees;

public class Manager extends Employee {
    public int numberOfSubordinates;

    public Manager(String fullName, double salary) {
        super(fullName, salary);
        this.numberOfSubordinates = 0;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int newNumberOfSubordinates) {
        this.numberOfSubordinates = newNumberOfSubordinates;
    }

    @Override
    public String toString() {
        return "Manager: " + getName() + ", Salary: " + getSalary() + ", Subordinates: " + numberOfSubordinates;
    }
}
