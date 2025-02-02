package lectures.lecture11.exercises.exercise2;

public class Appliance {
    String brand;
    int powerConsumption;
    boolean isTurnedOn = false;

    public Appliance(String brand, int powerConsumption) {
        this.brand = brand;
        this.powerConsumption = powerConsumption;
    }

    public void turnOn() {
        this.isTurnedOn = true;
        System.out.println("[status] The appliance is turned on!");
    }

    public void turnOff() {
        this.isTurnedOn = false;
        System.out.println("[status] The appliance is turned off!");
    }

    public void displayInformation() {
        System.out.println("This Appliance's brand is: " + this.brand);
        System.out.println("This Appliance's power consumption is: " + this.powerConsumption + 'W');
        System.out.println("Is this appliance turned on? " + this.isTurnedOn);
    }

    public void factoryReset() {
        this.turnOff();
        System.out.println("[status] The appliance has been factory reset!");
    }
}
