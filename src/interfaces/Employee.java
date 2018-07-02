package interfaces;

public class Employee implements Comparable<Employee> {
    private double salary;
    private String name;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(String name, double salary) {
        this.salary = salary;
        this.name = name;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public int compareTo(Employee other) {
        return Double.compare(salary, other.salary);
    }
}
