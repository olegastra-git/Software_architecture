public class Toyota extends Car {

    public Toyota(String model, String color, String bodyType, String fuelType, String transmissionType,
            int numWheels, double engineVolume) {
        super("Toyota", model, color, bodyType, numWheels, fuelType, transmissionType, engineVolume);
    }

    public void isLightOn(boolean isLight) {
        if (isLight) {
            System.out.println("Toyota lights are on");
        } else {
            System.out.println("Toyota lights are off");
        }
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
// Создать конкретный автомобиль путём наследования класса «Car», определить
// метод «движение» - «полёт». Провести проверку принципа LSP.
// 7. Создать интерфейс «Заправочная станция», создать метод: заправка топливом.
// 8. Имплементировать метод интерфейса «Заправочная станция» в конкретный класс
// «Car».
// 9. Добавить в интерфейс «Заправочная станция» методы: протирка лобового
// стекла, протирка фар, протирка зеркал.
// 10. Имплементировать все методы интерфейса «Заправочная станция» в конкретный
// класс «Car». Провести проверку принципа ISP. Создать дополнительный/е
// интерфейсы и имплементировать их в конкретный класс «Car». Провести проверку
// принципа ISP.
// 11. Создать путём наследования класса «Car» два автомобиля: с бензиновым и
// дизельным двигателями, имплементировать метод «Заправка топливом» интерфейса
// «Заправочная станция». Реализовать заправку каждого автомобиля подходящим
// топливом. Провести проверку принципа DIP.
