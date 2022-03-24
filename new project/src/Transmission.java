public class Transmission {
    private String gearboxType = "";
    private int numberOfSteps = 0;

    public Transmission() {

    }
    public Transmission(String gearboxType, int numberOfSteps) {
        this.gearboxType = gearboxType;
        this.numberOfSteps = numberOfSteps;
    }
    public String getGearboxType() {
        return gearboxType;
    }
    public void setGearboxType(String gearboxType) {
        this.gearboxType = gearboxType;
    }

    public int getNumberOfSteps() {
        return numberOfSteps;
    }

    public void setNumberOfSteps(int numberOfSteps) {
        this.numberOfSteps = numberOfSteps;
    }
    public void print() {
        System.out.println("Тип коробки передач: " + gearboxType);
        System.out.println("Количество ступеней: " + numberOfSteps);
    }
}
