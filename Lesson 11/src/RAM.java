public class RAM {
    private RAMType ramType;
    public double amountOfRAM = 16;
    public double weightRAM = 0.2;

    public RAM() {

    }
    public RAM(RAMType ramType, double amountOfRAM, double weightRAM) {
        this.ramType = ramType;
        this.amountOfRAM = amountOfRAM;
        this.weightRAM = weightRAM;
    }

    public RAMType getRamType() {

        return ramType;
    }

    public void setRamType(RAMType ramType) {

        this.ramType = ramType;
    }

    public double getAmountOfRAM() {

        return amountOfRAM;
    }

    public void setAmountOfRAM(double amountOfRAM) {

        this.amountOfRAM = amountOfRAM;
    }

    public double getWeightRAM() {

        return weightRAM;
    }

    public void setWeightRAM(double weightRAM) {

        this.weightRAM = weightRAM;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "ramType=" + ramType +
                ", amountOfRAM=" + amountOfRAM +
                ", weightRAM=" + weightRAM +
                '}';
    }
}
