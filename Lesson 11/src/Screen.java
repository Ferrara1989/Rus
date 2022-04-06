public class Screen {
    public ScreenType screenType;
    public double diagonal = 50.8;
    public double weightScreen = 2;

    public Screen() {

    }

    public Screen(ScreenType screenType, double diagonal, double weightScreen) {
        this.screenType = screenType;
        this.diagonal = diagonal;
        this.weightScreen = weightScreen;
    }

    public double getDiagonal() {

        return diagonal;
    }

    public void setDiagonal(double diagonal) {

        this.diagonal = diagonal;
    }

    public double getWeight() {

        return weightScreen;
    }

    public void setWeight(double weight) {

        this.weightScreen = weight;
    }

    public ScreenType getScreenType() {

        return screenType;
    }

    public void setScreenType(ScreenType screenType) {

        this.screenType = screenType;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "screenType=" + screenType +
                ", diagonal=" + diagonal +
                ", weightScreen=" + weightScreen +
                '}';
    }
}
