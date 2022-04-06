public class RAM {
    private RAMType ramType;
    public double RAMWeight = 0;
    public double RAMVolume = 0;
    public RAM() {

    }
    public RAM(RAMType ramType, double RAMWeight, double RAMVolume) {
        this.ramType = ramType;
        this.RAMWeight = RAMWeight;
        this.RAMVolume = RAMVolume;
    }

    public RAMType getRamType() {
        return ramType;
    }

    public void setRamType(RAMType ramType) {
        this.ramType = ramType;
    }

    public double getRAMWeight() {
        return RAMWeight;
    }

    public void setRAMWeight(double RAMWeight) {
        this.RAMWeight = RAMWeight;
    }

    public double getRAMVolume() {
        return RAMVolume;
    }

    public void setRAMVolume(double RAMVolume) {
        this.RAMVolume = RAMVolume;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "ramType=" + ramType +
                ", RAMWeight=" + RAMWeight +
                ", RAMVolume=" + RAMVolume +
                '}';
    }
}
