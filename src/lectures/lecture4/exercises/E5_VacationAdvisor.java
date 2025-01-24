package lectures.lecture4.exercises;

// import a scanner utility
import java.util.Scanner;

public class E5_VacationAdvisor {

    // declare Scanner as class-level field
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        vacationAdvisorProgram();

        sc.close(); // close the scanner
    }

    // vacation advisor
    static void vacationAdvisorProgram() {
        System.out.println("Please input your preferred type of vacation: Beach or Mountain: ");
        String vacationType = sc.nextLine();
        vacationType = vacationType.toLowerCase(); // convert input to lowercase to ensure case-insensitive match

        System.out.println("Please input your budget per day per person: ");
        float budget = sc.nextFloat();

        switch (vacationType) {
            case "beach":
                if (budget < 50) {
                    System.out.println("Advised destination: Bulgaria");
                } else {
                    System.out.println("Advised destination: Outside Bulgaria");
                }
                break;
            case "mountain":
                if (budget < 30) {
                    System.out.println("Advised destination: Bulgaria");
                } else {
                    System.out.println("Advised destination: Outside Bulgaria");
                }
                break;
            default: {
                System.out.println("There is no information about this type of vacation");
            }
        }
    }
}


