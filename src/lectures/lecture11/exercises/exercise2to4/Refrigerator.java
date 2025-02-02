package lectures.lecture11.exercises.exercise2to4;

public class Refrigerator extends Appliance {
    int loadCapacity;
    int temperatureSetting;

    public Refrigerator(String brand, int powerConsumption, int temperatureSetting) {
        super(brand, powerConsumption);
        if (temperatureSetting >= -3 && temperatureSetting <= 5) {
            this.temperatureSetting = temperatureSetting;
        } else {
            this.temperatureSetting = 0;
        }
    }

    @Override
    public void displayInformation() {
        super.displayInformation(); // calling the existing method functionality from the superclass
        System.out.println("This Refrigerator's load capacity is: " + this.loadCapacity);
        System.out.println("This Refrigerator's temperature setting is: " + this.temperatureSetting + "°C");
    }

    @Override
    public void factoryReset() {
        super.factoryReset();
        this.temperatureSetting = 0;
        this.loadCapacity = 0;
    }

    // method to update the temperature
    public void setTemperatureSetting(int newTemperatureSetting) {
        if (newTemperatureSetting >= -3 && newTemperatureSetting <= 5) {
            this.temperatureSetting = newTemperatureSetting;
        } else {
            this.temperatureSetting = 0;
        }
    }
}

