public class Employee {
    private String Name;
    private String LastName;
    private double Salary;

    public Employee(String Name, String LastName, double Salary) {
        this.Name = Name;
        this.LastName = LastName;
        if (Salary > 0) {
            this.Salary = Salary;
        } else {
            this.Salary = 0;
        }
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        if (Salary > 0) {
            this.Salary = Salary;
        } else {
            System.out.println("Salary Should be positive");
        }
    }

    public double getYsalary() {
        return 12 * Salary;
    }

    public void raise(double percentage) {
        setSalary(Salary + Salary * percentage / 100);
    }
}
