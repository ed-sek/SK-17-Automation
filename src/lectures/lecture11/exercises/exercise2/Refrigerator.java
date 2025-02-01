package lectures.lecture11.exercises.exercise2;

public class Refrigerator extends Appliance {
    int temperatureSetting;

    public Refrigerator(String brand, int powerConsumption, int temperatureSetting){
        super(brand, powerConsumption);
        if (temperatureSetting >= -3 && temperatureSetting <= 5) {
            this.temperatureSetting = temperatureSetting;
        } else {
            this.temperatureSetting = 0;
        }
    }

    public void displayInformation(){
        super.displayInformation(); // calling the existing method functionality from the superclass
        System.out.println("This Refrigerator's temperature setting is: " + this.temperatureSetting + "°C");
    }
}

