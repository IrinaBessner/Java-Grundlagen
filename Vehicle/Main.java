public class Main {

    public static void main(String[] args) {
        Vehicle car1 = new Vehicle("BMW", 120);
        Vehicle car2 = new Vehicle("Audi", 130);

        car1.drive();
        car2.drive();

        System.out.println("Fahrzeugegesamt: " + Vehicle.vehicleCount);

        ElectricCar ec1 = new ElectricCar("BMW", 120, 3);
        ec1.charge();

        FuelType type = FuelType.ELECTRIC;

        System.out.println(type.getName());
       
    }
}
