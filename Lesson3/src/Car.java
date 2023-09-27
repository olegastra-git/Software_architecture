public abstract class Car {
    protected String mark;
    protected String model;
    protected String color;
    protected String bodyType;
    protected int numWheels;
    protected String fuelType;
    protected String transmissionType;
    protected double engineVolume;

    public Car(String mark, String model, String color, String bodyType, int numWheels, String fuelType,
            String transmissionType, double engineVolume) {
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.numWheels = numWheels;
        this.fuelType = fuelType;
        this.transmissionType = transmissionType;
        this.engineVolume = engineVolume;
    }

    public abstract void move();

    public abstract void service();

    public abstract void switchGear();

    public abstract void turnOnLights();

    public abstract void turnOnWipers();

    public void turnOnFogLights() {
        System.out.println("Car fog lights are on");
    }

    public void transportCargo() {
        System.out.println("Car is transporting cargo");
    }

    public void refuel() {
        System.out.println("Car is being refueled");
    }
}