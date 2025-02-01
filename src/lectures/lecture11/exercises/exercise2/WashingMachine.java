package lectures.lecture11.exercises.exercise2;

public class WashingMachine extends Appliance {
    int loadCapacity;
    boolean isWashCycleStarted = false;

    public WashingMachine(String brand, int powerConsumption, int loadCapacity){
        super(brand, powerConsumption);
        this.loadCapacity = loadCapacity;
    }

    public void startWashCycle() {
        this.isWashCycleStarted = true;
        System.out.println("The wash cycle is started.");
    }

    @Override
    public void turnOn(){
        super.turnOn(); // calling the existing method functionality from the superclass
        this.isWashCycleStarted = true;
        System.out.println("The wash cycle is started.");
    }

    @Override
    public void displayInformation(){
        super.displayInformation(); // calling the existing method functionality from the superclass
        System.out.println("This Washing machine's load capacity is: " + this.loadCapacity + "kg");
        System.out.println("Is the wash cycle started? " + this.isWashCycleStarted);
    }
}
