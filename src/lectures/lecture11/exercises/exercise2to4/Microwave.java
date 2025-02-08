package lectures.lecture11.exercises.exercise2to4;

public class Microwave extends Appliance {
    int maxTemperature;
    int currentTemperature;
    int loadCapacity;
    int currentLoad;

    public Microwave(String brand, int powerConsumption, int maxTemperature, int loadCapacity) {
        super(brand, powerConsumption);
        this.maxTemperature = maxTemperature;
        this.loadCapacity = loadCapacity;
    }

    public void getCurrentAndMaxLoad() {
        System.out.println("The load capacity is: " + this.loadCapacity);
        System.out.println("The current load is: " + this.currentLoad);
    }

    public void getCurrentAndMaxTemp() {
        System.out.println("The max temperature is: " + this.maxTemperature + "°C");
        System.out.println("The current temperature is: " + this.currentTemperature + "°C");
    }

    public void setCurrentTemperature(int setCurrentTemperature) {
        if (setCurrentTemperature < this.maxTemperature && setCurrentTemperature > 10) {
            this.currentTemperature = setCurrentTemperature;
            System.out.println("[status] Current temperature set: " + setCurrentTemperature + "°C");
        } else {
            System.out.println("[status] Invalid input. Can not set temperature outside of range: " + 10 + " - " + this.maxTemperature + "°C");
        }
    }

    public void startHeating() {
        if (currentTemperature != 0 && currentLoad > 0) {
            System.out.println("[status] Heating has started!");
        } else {
            System.out.println("[status] Heating aborted: Temperature not set.");
        }
    }

    public void putFoodIn(int putFoodIn) {
        if ((currentLoad + putFoodIn) <= loadCapacity) {
            currentLoad += putFoodIn;
            System.out.println("More food added : " + putFoodIn + 'L');
        } else {
            System.out.println("Microwave capacity reached. Cannot add more food!");
        }
    }

    @Override
    public void factoryReset() {
        super.factoryReset();
        this.currentTemperature = 0;
        this.currentLoad = 0;
    }

    @Override
    public void displayInformation() {
        super.displayInformation(); // calling the existing method functionality from the superclass
        this.getCurrentAndMaxLoad();
        this.getCurrentAndMaxTemp();
    }
}
