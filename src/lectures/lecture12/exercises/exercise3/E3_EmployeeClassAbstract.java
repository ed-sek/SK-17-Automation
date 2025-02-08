package lectures.lecture12.exercises.exercise3;

public class E3_EmployeeClassAbstract {

    public static void main(String[] args) {

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(10, "Clark", "Kent", 35000);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(12, "Bruce", "Wayne", 30, 18);

        // printing default values after constructing
        fullTimeEmployee.printEmployeeFullNameAndMonthlySalary();
        partTimeEmployee.printEmployeeFullNameAndMonthlySalary();

        // adjusting hoursWorked for the part-time employee
        partTimeEmployee.setHoursWorked(40);
        partTimeEmployee.printEmployeeFullNameAndMonthlySalary();
    }
}
