//Спроектировать абстрактный класс «Car» у которого должны быть свойства: марка, модель, цвет, тип кузова, число колёс, тип топлива, тип коробки передач, объём двигателя; методы: движение, обслуживание, переключение передач, включение фар, включение дворников.
//Создать конкретный автомобиль путём наследования класса «Car».
// Расширить абстрактный класс «Car», добавить метод: подметать улицу. Создать конкретный автомобиль путём наследования класса «Car». Провести проверку принципа SRP.
// Расширить абстрактный класс «Car», добавить метод: включение противотуманных фар, перевозка груза. Провести проверку принципа OCP.
// Создать конкретный автомобиль путём наследования класса «Car», определить число колёс = 3. Провести проверку принципа LSP.

public class Main {
    public static void main(String[] args) {
        Toyota myCar = new Toyota("Camry", "blue", "sedan", "бензин", "автоматическая", 4, 2.5);
        TricycleCar myCar2 = new TricycleCar("Tricycle", "red", "tricycle", "бензин",
                "ручная", 3, 1.5);
        myCar.isLightOn(true);
        myCar.move();
        myCar.service();
        myCar.switchGear();
        myCar.turnOnLights();
        myCar.turnOnWipers();
        myCar.transportCargo();
        myCar.turnOnFogLights();
        myCar2.move();
        myCar2.service();
        myCar2.switchGear();
        myCar2.turnOnLights();
        myCar2.turnOnWipers();
        myCar2.transportCargo();
        myCar2.turnOnFogLights();
    }
}