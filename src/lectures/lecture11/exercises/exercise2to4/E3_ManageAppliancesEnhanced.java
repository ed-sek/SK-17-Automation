package lectures.lecture11.exercises.exercise2to4;

public class E3_ManageAppliancesEnhanced {

    static final String LINE_SEPARATOR = "_______________";

    public static void main(String[] args) {
        WashingMachine myWashingMachineWhirpool = new WashingMachine("Whirpool", 2400);
        Refrigerator myRefrigeratorBeko = new Refrigerator("Beko", 675, 7);


        // default-state information display
        myWashingMachineWhirpool.displayInformation();
        System.out.println(LINE_SEPARATOR);
        myRefrigeratorBeko.displayInformation();
        System.out.println(LINE_SEPARATOR);


        // fridge demo
        myRefrigeratorBeko.setTemperatureSetting(4); // setting custom temp
        myRefrigeratorBeko.displayInformation();
        System.out.println(LINE_SEPARATOR);

        // washing machine demo
        myWashingMachineWhirpool.turnOn(); // turning on the washing machine
        myWashingMachineWhirpool.displayInformation();
        System.out.println(LINE_SEPARATOR);

        myWashingMachineWhirpool.turnOff(); // turning off the washing machine
        myWashingMachineWhirpool.displayInformation();
        System.out.println(LINE_SEPARATOR);

        // factory reset demo
        myWashingMachineWhirpool.factoryReset();
        myRefrigeratorBeko.factoryReset();
        System.out.println(LINE_SEPARATOR);
        myWashingMachineWhirpool.displayInformation();
        myRefrigeratorBeko.displayInformation();
    }
}

