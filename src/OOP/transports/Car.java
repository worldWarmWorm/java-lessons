package OOP.transports;

import org.jetbrains.annotations.NotNull;

final public class Car extends Transport implements ILights {
    private final boolean isSport;

    private boolean isOn;

    public Engine engine = new Engine(true, 150);

    public Car(float speed, float weight, String color, byte[] coordinates, boolean isSport) {
        super(speed, weight, color, coordinates);
        this.isSport = isSport;
    }

    @Override
    public void startMoving() {
        System.out.println("Car is start moving");
    }

    @NotNull
    @Override
    public String getFields() {
        return "Car speed: " + speed +
            "\nCar weight: " + weight +
            "\nCar color: " + color +
            "\nCar coordinates: " + getCoordinates() +
            "\nCar is sport: " + isSport;
    }

    @Override
    public void setLights(boolean value) {
        this.isOn = value;
    }

    @Override
    public void blinkLight() {
        System.out.println("Car is blinking lights!");
    }
}
