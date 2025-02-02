package lectures.lecture11.exercises.exercise2to4;

public class E4_ManageApplianceAdvanced {

    static final String LINE_SEPARATOR = "_______________";

    public static void main(String[] args) {
        Microwave myMicrowavePanasonic = new Microwave("Panasonic", 900, 100, 15);

        // default-state information display
        myMicrowavePanasonic.displayInformation();
        System.out.println(LINE_SEPARATOR);


        // demo functionality below
        myMicrowavePanasonic.setCurrentTemperature(60); // setting valid temperature setting
        myMicrowavePanasonic.putFoodIn(13);
        myMicrowavePanasonic.startHeating();
        myMicrowavePanasonic.setCurrentTemperature(140); // setting invalid temperature setting
        myMicrowavePanasonic.displayInformation();
        myMicrowavePanasonic.factoryReset();
        myMicrowavePanasonic.displayInformation();
        myMicrowavePanasonic.setCurrentTemperature(40);
        myMicrowavePanasonic.getCurrentAndMaxTemp();
    }
}
