package lectures.lecture12.exercises.exercise3;

public class PartTimeEmployee extends Employee {
    private double hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int id, String firstName, String lastName, double hoursWorked, double hourlyRate) {
        super(id, firstName, lastName, 0); // for the part-time employee I'm setting baseSalary = 0
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateMonthlySalary() {
        double partTimeEmployeeSalary = this.hourlyRate * this.hoursWorked;
        return partTimeEmployeeSalary;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }


}
