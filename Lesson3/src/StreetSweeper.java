public abstract class StreetSweeper extends Car {
    public StreetSweeper(String mark, String model, String color, String bodyType, int numWheels, String fuelType,
            String transmissionType, double engineVolume) {
        super(mark, model, color, bodyType, numWheels, fuelType, transmissionType, engineVolume);
    }

    public abstract void sweepStreet();
}