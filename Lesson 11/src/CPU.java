public class CPU {

private NumberOfCores numberOfCores;
private Frequency frequency;
private Manufacturer manufacturer;
public double weightNumberOfCores = 0.0460;

public CPU() {

}
public CPU(NumberOfCores numberOfCores, Frequency frequency, Manufacturer manufacturer, double weightNumberOfCores) {
    this.numberOfCores = numberOfCores;
    this.frequency = frequency;
    this.manufacturer = manufacturer;
    this.weightNumberOfCores = weightNumberOfCores;
}
    public NumberOfCores getNumberOfCores() {

        return numberOfCores;
    }

    public void setNumberOfCores(NumberOfCores numberOfCores) {

        this.numberOfCores = numberOfCores;
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

    public double getWeightNumberOfCores() {
        return weightNumberOfCores;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "numberOfCores=" + numberOfCores +
                ", frequency=" + frequency +
                ", manufacturer=" + manufacturer +
                ", weightNumberOfCores=" + weightNumberOfCores +
                '}';
    }
}
