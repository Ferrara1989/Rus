public class Screen {
    private ScreenType screenType;
    public double ScreenDiagonal = 0;
    public double ScreenWeight = 0;
    public Screen() {

    }
    public Screen(ScreenType screenType, double ScreenDiagonal, double ScreenWeight) {
        this.screenType = screenType;
        this.ScreenDiagonal = ScreenDiagonal;
        this.ScreenWeight = ScreenWeight;
    }
    public double ScreenD() {

        return ScreenDiagonal;
    }
    public double ScreenW() {

        return ScreenWeight;
    }

    public ScreenType getScreenType() {

        return screenType;
    }

    public void setScreenType(ScreenType screenType) {

        this.screenType = screenType;
    }

    public double getScreenDiagonal() {

        return ScreenDiagonal;
    }

    public void setScreenDiagonal(double screenDiagonal) {

        ScreenDiagonal = screenDiagonal;
    }

    public double getScreenWeight() {

        return ScreenWeight;
    }

    public void setScreenWeight(double screenWeight) {

        ScreenWeight = screenWeight;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "screenType=" + screenType +
                ", ScreenDiagonal=" + ScreenDiagonal +
                ", ScreenWeight=" + ScreenWeight +
                '}';
    }
}
