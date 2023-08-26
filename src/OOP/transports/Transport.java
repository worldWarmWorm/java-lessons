package OOP.transports;

public abstract class Transport {
    protected float speed, weight;

    protected String color;

    protected byte[] coordinates;

    public Transport(
        float speed,
        float weight,
        String color,
        byte[] coordinates
    ) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinates = coordinates;
    }

    protected String getCoordinates() {
        StringBuilder coordinates = new StringBuilder("{");
        int length = this.coordinates.length;

        for (int i = 0; i < length; i++) {
            coordinates.append(this.coordinates[i]);

            if (i < length - 1) {
                coordinates.append(", ");
            }
        }

        return coordinates + "}";
    }

    protected abstract void startMoving();

    protected abstract String getFields();

    public class Engine {
        private boolean isReady;

        private int odo;

        public Engine(boolean isReady, int odo) {
            this.isReady = isReady;
            this.odo = odo;
        }

        public void info() {
            System.out.println(
                isReady
                    ? "Engine is ready to start. Current ODO: " + this.odo + " km."
                    : "Engine isn't ready to start. Current ODO: " + this.odo + " km."
            );
        }
    }
}
