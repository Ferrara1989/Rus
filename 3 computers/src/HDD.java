public class HDD {
    private HDDType hddType;
    public double HDDWeight = 0;
    public double HDDVolume = 0;

    public HDD() {

    }
    public HDD(HDDType hddType, double HDDWeight, double HDDVolume) {
        this.hddType = hddType;
        this.HDDWeight = HDDWeight;
        this.HDDVolume = HDDVolume;
    }
    public double weightVariable() {

        return HDDWeight;
    }
    public double volumeVariable() {

        return HDDVolume;
    }

    public HDDType getHddType() {

        return hddType;
    }

    public void setHddType(HDDType hddType) {

        this.hddType = hddType;
    }

    public double getHDDWeight() {

        return HDDWeight;
    }

    public void setHDDWeight(double HDDWeight) {
        this.HDDWeight = HDDWeight;
    }

    public double getHDDVolume() {

        return HDDVolume;
    }

    public void setHDDVolume(double HDDVolume) {

        this.HDDVolume = HDDVolume;
    }

    @Override
    public String toString() {
        return "HDD{" +
                "hddType=" + hddType +
                ", HDDWeight=" + HDDWeight +
                ", HDDVolume=" + HDDVolume +
                '}';
    }
}
