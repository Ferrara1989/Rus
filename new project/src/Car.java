public class Car {
    private Wheel wheel;
    private Transmission gearboxType;
    private Body bodyType;
    private Motor motor;
    private static int count = 0;
    private static final String placeOfProduction = "Russia";

    public Car() {

        count++;
    }
    public Car(Wheel wheel, Transmission gearboxType, Body bodyType, Motor motor) {
        count++;
        this.wheel = wheel;
        this.gearboxType = gearboxType;
        this.bodyType = bodyType;
        this.motor = motor;
    }
    public Wheel getWheel() {

        return wheel;
    }

    public Transmission getGearboxType() {

        return gearboxType;
    }

    public void setGearboxType(Transmission gearboxType) {

        this.gearboxType = gearboxType;
    }

    public Body getBodyType() {

        return bodyType;
    }

    public void setBodyType(Body bodyType) {

        this.bodyType = bodyType;
    }

    public Motor getMotor() {

        return motor;
    }

    public void setMotor(Motor motor) {

        this.motor = motor;
    }

    public void setWheel(Wheel wheel) {

        this.wheel = wheel;
    }

    public static int getCount() {
        return count;
    }

    public static String getPlaceOfProduction() {
        return placeOfProduction;
    }

    public void print() {
        wheel.print();
        gearboxType.print();
        bodyType.print();
        motor.print();
    }

}
