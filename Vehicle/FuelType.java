public enum FuelType {
    PETROL("petrol"),
    DIESEL("disel"),
    ELECTRIC("electric");

    private final String name;

    FuelType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
