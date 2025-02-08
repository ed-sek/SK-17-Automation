package lectures.lecture12.exercises.exercise3;

public abstract class Employee {
    private final int id;
    private final String firstName;
    private final String lastName;
    private double baseSalary;

    public Employee(int id, String firstName, String lastName, double baseSalary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.baseSalary = baseSalary;
    }

    protected double getBaseSalary() {
        return this.baseSalary;
    }

    public abstract double calculateMonthlySalary();

    public String getName() {
        String employeeFullName = this.firstName + " " + this.lastName;
        return employeeFullName;
    }

    public void printEmployeeFullNameAndMonthlySalary() {
        System.out.println("Employee's full name is: " + this.getName() +
                ". Their monthly salary is: " + this.calculateMonthlySalary());

    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + getName() + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }
// additional methods used in lecture12_E2 below

//    public double getAnnualSalary() {
//        double annualSalary = this.baseSalary * 12;
//        return annualSalary;
//    }
//
//    public double raiseSalary(double raiseAmountPercent) {
//        this.baseSalary += raiseAmountPercent * (this.baseSalary / 100);
//        return this.baseSalary;
//    }
//
//    public void setBaseSalary(double baseSalary) {
//        this.baseSalary = baseSalary;
//    }
}
