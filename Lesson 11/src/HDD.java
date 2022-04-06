public class HDD {
    private HDDType hddType;
    public double memory = 250;
    public double weightHDD = 0.2;

    public HDD() {

    }
    public HDD(HDDType hddType, double memory, double weight) {
        this.hddType = hddType;
        this.memory = memory;
        this.weightHDD = weight;
    }

    public double getMemory() {

        return memory;
    }


        public void setMemory(double memory) {

        this.memory = memory;
    }

    public double getWeight() {

        return weightHDD;
    }

    public void setWeight(double weight) {

        this.weightHDD = weight;
    }

    @Override
    public String toString() {
        return "HDD{" +
                "hddType=" + hddType +
                ", memory=" + memory +
                ", weightHDD=" + weightHDD +
                '}';
    }
}
