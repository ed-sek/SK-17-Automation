package lectures.lecture11.exercises.exercise2to4;

public class E2_ManageAppliances {

    static final String LINE_SEPARATOR = "_______________";

    public static void main(String[] args) {
        Appliance myWashingMachineLG = new WashingMachine("LG", 2000);
        Appliance myRefrigeratorBosch = new Refrigerator("Bosh", 700, 4);
        Appliance myRefrigeratorSamsung = new Refrigerator("Samsung", 850, 8);

        myWashingMachineLG.displayInformation();
        System.out.println(LINE_SEPARATOR);
        myRefrigeratorBosch.displayInformation();
        System.out.println(LINE_SEPARATOR);
        myRefrigeratorSamsung.displayInformation();
        System.out.println(LINE_SEPARATOR);

        // executing below code for demo purposes
        System.out.println("Turning on the Washing machine.");
        myWashingMachineLG.turnOn();
        myWashingMachineLG.displayInformation();
        myWashingMachineLG.turnOff();
        // status check below
        System.out.println(myWashingMachineLG.isTurnedOn);
    }
}
