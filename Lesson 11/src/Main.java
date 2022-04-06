public class Main {
    public static void main(String[] args) {
       CPU Intel = new CPU(NumberOfCores.SIX, Frequency.FIVE_GIGAGERZ, Manufacturer.INTEL, 0.0460);
       RAM ram = new RAM(RAMType.DDR2, 16, 0.2);
       HDD www = new HDD(HDDType.SSD, 250, 0.2);
       Screen LG = new Screen(ScreenType.IPS, 50.8, 2);
       Keyboard logitech = new Keyboard(KeyboardType.SENSORY, Backlight.BACKLIGHT, 350);

       Computer IBM = new Computer();
       System.out.println(IBM);
    }
}
