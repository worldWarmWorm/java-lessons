package OOP.transports;

public class Truck extends Transport {
    private final boolean isLoaded;

    public Engine engine = new Engine(false, 2000);

    public Truck(float speed, float weight, String color, byte[] coordinates, boolean isLoaded) {
        super(speed, weight, color, coordinates);
        this.isLoaded = isLoaded;
    }

    @Override
    protected void startMoving() {
        System.out.println("Truck is start moving");
    }

    @Override
    public String getFields() {
        return "Truck speed: " + this.speed +
            "\nTruck weight: " + this.weight +
            "\nTruck color: " + this.color +
            "\nTruck coordinates: " + this.getCoordinates() +
            "\nTruck is loaded: " + this.isLoaded;
    }
}
