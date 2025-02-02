package lectures.lecture11.exercises.exercise2to4;

public class WashingMachine extends Appliance {
    int loadCapacity;
    boolean isWashCycleStarted = false;

    public WashingMachine(String brand, int powerConsumption) {
        super(brand, powerConsumption);
    }

    public void startWashCycle() {
        this.isWashCycleStarted = true;
        System.out.println("[status] The wash cycle is started!");
    }

    public void stopWashCycle() {
        this.isWashCycleStarted = false;
        System.out.println("[status] The wash cycle is stopped!");
    }

    @Override
    public void turnOn() {
        super.turnOn(); // calling the existing method functionality from the superclass
        this.startWashCycle();
    }

    @Override
    public void turnOff() {
        super.turnOff();
        this.stopWashCycle();
        this.loadCapacity = 0;
    }

    @Override
    public void displayInformation() {
        super.displayInformation(); // calling the existing method functionality from the superclass
        System.out.println("This Washing machine's load capacity is: " + this.loadCapacity);
        System.out.println("Is the wash cycle started? " + this.isWashCycleStarted);
    }

    @Override
    public void factoryReset() {
        super.factoryReset();
        this.stopWashCycle();
        this.loadCapacity = 0;
    }
}


