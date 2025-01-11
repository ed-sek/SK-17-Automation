package lectures.lecture4.exercises;

// import a scanner utility
import java.util.Scanner;

public class Exercise7 {

    // declare Scanner as class-level field
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        temperatureConversionProgram();

        sc.close(); // close the scanner
    }

    // temperature C<->F converter
    static void temperatureConversionProgram() {
        System.out.println("Please enter the temperature value: ");
        float tempInput = sc.nextFloat();

        System.out.println("In which direction would you like to convert the temperature? Please type [1] or [2]:\n[1] Celsius -> Fahrenheit\n[2] Fahrenheit -> Celsius");
        int tempChoice = sc.nextInt();

        if (tempChoice == 1) {
            double celsiustoF = (tempInput*1.8)+32;
            System.out.printf("The temperature in Fahrenheit is: %.2f°F",celsiustoF);
        } else if (tempChoice == 2) {
            double fahrenheitToC = (tempInput-32)*0.555;
            System.out.printf("The temperature in Celsius is: %.2f°C", fahrenheitToC);
        } else {
            System.out.println("Unsupported value! Please provide only '1' or '2' and run the program again");
        }
    }
}
