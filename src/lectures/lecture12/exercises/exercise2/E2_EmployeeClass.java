package lectures.lecture12.exercises.exercise2;

public class E2_EmployeeClass {

    public static void main(String[] args) {

        Employee newEmployee = new Employee(15, "Johnny", "Bravo", 1800);

        // print default values
        System.out.println(newEmployee);

        // raising the salary by given percent
        newEmployee.raiseSalary(10);

        // printing the information again
        System.out.println(newEmployee);
    }
}



