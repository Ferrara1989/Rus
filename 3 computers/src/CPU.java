public class CPU {
    private Frequency frequency;
    private Manufacturer manufacturer;
    private NumberOfCores numberOfCores;
    public double weightCPU = 0;

    public CPU() {

    }

    public CPU(Frequency frequency, Manufacturer manufacturer, NumberOfCores numberOfCores, double weightCPU) {
        this.frequency = frequency;
        this.manufacturer = manufacturer;
        this.numberOfCores = numberOfCores;
        this.weightCPU = weightCPU;


    }

    public Frequency getFrequency() {

        return frequency;
    }

    public void setFrequency(Frequency frequency) {

        this.frequency = frequency;
    }

    public Manufacturer getManufacturer() {

        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {

        this.manufacturer = manufacturer;
    }

    public NumberOfCores getNumberOfCores() {

        return numberOfCores;
    }

    public void setNumberOfCores(NumberOfCores numberOfCores) {

        this.numberOfCores = numberOfCores;
    }

    public double getWeightCPU() {

        return weightCPU;
    }

    public void setWeightCPU(double weightCPU) {
        this.weightCPU = weightCPU;

    }

    @Override
    public String toString() {
        return "CPU{" +
                "frequency=" + frequency +
                ", manufacturer=" + manufacturer +
                ", numberOfCores=" + numberOfCores +
                ", weightCPU=" + weightCPU +
                '}';
    }
}

