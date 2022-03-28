public class Main {
    public static void main(String[] args) {
       /*  Wheel numberOfWheels = new Wheel();
          numberOfWheels.setNumberOfWheels(6);
          Transmission gearboxType = new Transmission();
          gearboxType.setGearboxType("Автоматическая");
          gearboxType.setNumberOfSteps(5);
          Body bodyType = new Body();
          bodyType.setBodyType("Универсал");
          Motor brand = new Motor();
          brand.setBrand("BMW");
          brand.setDisplacement(10);
          Car BMW = new Car();
          BMW.setWheel(numberOfWheels);
          BMW.setBodyType(bodyType);
          BMW.setGearboxType(gearboxType);
          BMW.setMotor(brand);
          BMW.print();*/

        Wheel numberOfWheels = new Wheel(16);
        Transmission gearboxType = new Transmission("Ручная", 7);
        Body bodyType = new Body("Truck");
        Motor brand = new Motor(5, "Mercedes-Bеnz");
        Car BMW = new Car(numberOfWheels, gearboxType, bodyType, brand);
        BMW.print();
        Wheel numberOfWheels2 = new Wheel(10);
        Transmission gearboxType2 = new Transmission("Автомат", 6);
        Body bodyType2 = new Body("Sport");
        Motor brand2 = new Motor(3, "BMW");
        Car MERCEDES = new Car(numberOfWheels2, gearboxType2, bodyType2, brand2);
        MERCEDES.print();
        Wheel numberOfWheels3 = new Wheel(4);
        Transmission gearboxType3 = new Transmission("Полу-автомат", 5);
        Body bodyType3 = new Body("Кабриолетт");
        Motor brand3 = new Motor(6, "RENO");
        Car TOYOTA = new Car(numberOfWheels3, gearboxType3, bodyType3, brand3);
        TOYOTA.print();

        System.out.println("Всего машин: " + Car.getCount());
        System.out.println("Место производства: " + Car.getPlaceOfProduction());
        Body.bodyType(machineBodyType.);
    }
}
