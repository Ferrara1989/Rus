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
        Motor brand = new Motor(5,"Mercedes-Bеnz");
        Car BMW = new Car(numberOfWheels, gearboxType, bodyType, brand);
        BMW.print();
    }
}

