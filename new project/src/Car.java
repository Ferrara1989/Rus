public class Car {
    private Wheel wheel;
    private Transmission gearboxType;
    private Body bodyType;
    private Motor motor;

    public Car() {

    }
    public Car(Wheel wheel, Transmission gearboxType, Body bodyType, Motor motor) {
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

    public void print() {
        wheel.print();
        gearboxType.print();
        bodyType.print();
        motor.print();
    }

}
