public class Main {
    public static void main(String[] args) {
        Transmission red  = new Transmission("Автоматическая", 6);
        red.setGearboxType("Автоматическая");
        red.setNumberOfSteps(6);
        System.out.println(red.getGearboxType());
        System.out.println(red.getNumberOfSteps());
    }
}
