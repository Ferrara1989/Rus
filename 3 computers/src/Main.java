public class Main {
    public static void main(String[] args) {
        CPU aMD = new CPU(Frequency.FIVE_HUNDRED, Manufacturer.AMD, NumberOfCores.TWO, 400);
        Keyboard mechanic = new Keyboard(KeyboardType.SENSORY, Backlight.BACKLIT, 0.3);
        RAM sony = new RAM(RAMType.DDR2, 2, 3);
        Screen ss = new Screen(ScreenType.IPS,3, 2);
        Computer one = new Computer(aMD, mechanic, sony, ss);
        System.out.println(one);

        CPU as = new CPU(Frequency.THREE_THOUSAND, Manufacturer.IBM, NumberOfCores.THREE, 300);
        Keyboard optic = new Keyboard(KeyboardType.MEMBRANOUS, Backlight.AUTOMATIC, 0.4);
        RAM samsung = new RAM(RAMType.DDR3, 5, 8);
        Screen lg = new Screen(ScreenType.LED,3, 2);
        Computer who = new Computer(as, optic, samsung, lg);
        System.out.println(who);


    }
}
