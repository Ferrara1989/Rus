public class Keyboard {
    private KeyboardType keyboardType;
    private Backlight backlight;
    public double weightKeyboard = 350;

    public Keyboard() {

    }

    public Keyboard(KeyboardType keyboardType, Backlight backlight, double weightKeyboard) {
        this.keyboardType = keyboardType;
        this.backlight = backlight;
        this.weightKeyboard = weightKeyboard;

    }

    public KeyboardType getKeyboardType() {

        return keyboardType;
    }

    public void setKeyboardType(KeyboardType keyboardType) {

        this.keyboardType = keyboardType;
    }

    public Backlight getBacklight() {

        return backlight;
    }

    public void setBacklight(Backlight backlight) {

        this.backlight = backlight;
    }

    public double getWeightKeyboard() {

        return weightKeyboard;
    }

    public void setWeightKeyboard(double weightKeyboard) {

        this.weightKeyboard = weightKeyboard;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "keyboardType=" + keyboardType +
                ", backlight=" + backlight +
                ", weightKeyboard=" + weightKeyboard +
                '}';
    }
}
