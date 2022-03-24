public class Wheel {
    private int numberOfWheels = 0;

    public Wheel() {

    }
    public Wheel(int numberOfWheels) {

        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfWheels() {

        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {

        this.numberOfWheels = numberOfWheels;
    }
    public void print() {
        System.out.println("Номер колёс: " + numberOfWheels);
    }
}



