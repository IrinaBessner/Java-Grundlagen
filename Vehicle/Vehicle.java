public class Vehicle {

    //statische Eigenschaften

    public static int vehicleCount = 0;
    // nicht -statische Eigenschaften

    private String brand;
    private int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
        vehicleCount++;
    }

    public void drive() {
        System.out.println(brand + " fährt  mit " + speed + "km/st");
    }
}
