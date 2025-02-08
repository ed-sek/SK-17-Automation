package lectures.lecture12.exercises.exercise2;

public class Employee {
    private final int id;
    private final String firstName;
    private final String lastName;
    private double salaryPerMonth;

    public Employee(int id, String firstName, String lastName, double salaryPerMonth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salaryPerMonth = salaryPerMonth;
    }

    public String getName() {
        String employeeFullName = this.firstName + " " + this.lastName;
        return employeeFullName;
    }

    public double getAnnualSalary() {
        double annualSalary = this.salaryPerMonth * 12;
        return annualSalary;
    }

    public double raiseSalary(int raiseAmountPercent) {
        if (raiseAmountPercent <= 0) {
            System.out.println("Invalid raise percentage: " + raiseAmountPercent + ". Salary remains unchanged.");
            return this.salaryPerMonth;
        }
        this.salaryPerMonth += raiseAmountPercent * (this.salaryPerMonth / 100);
        return this.salaryPerMonth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + getName() + '\'' +
                ", salary=" + salaryPerMonth +
                ", annualSalary=" + getAnnualSalary() +
                '}';
    }

// additional methods outside the exercise below

//  public void printEmployeeDetails() {
//      System.out.println("Employee's  id is: " + this.id);
//      System.out.println("Employee's full name is: " + this.getName());
//      System.out.println("Employee's  monthly salary is: " + this.salaryPerMonth);
//  }

//  public double getSalary() {
//      return this.salaryPerMonth;
//  }

//  public void setSalary(double newSalaryPerMonth) {
//      this.salaryPerMonth = newSalaryPerMonth;
//  }
}

