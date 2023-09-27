public class TricycleCar extends Car {
    public TricycleCar(String mark, String model, String color, String bodyType, String fuelType,
            String transmissionType, double engineVolume) {
        super(mark, model, color, bodyType, 3, fuelType, transmissionType, engineVolume);
    }

    @Override
    public void move() {
        System.out.println("Tricycle car is moving");
    }

    @Override
    public void service() {
        System.out.println("Tricycle car is being serviced");
    }

    @Override
    public void switchGear() {
        System.out.println("Tricycle car is switching gears");
    }

    @Override
    public void turnOnLights() {
        System.out.println("Tricycle car lights are on");
    }

    @Override
    public void turnOnWipers() {
        System.out.println("Tricycle car wipers are on");
    }
}