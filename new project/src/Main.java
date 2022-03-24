public class Main {
    public static void main(String[] args) {
       Motor speed = new Motor();
       speed.setDisplacement(10);
       speed.setBrand("BMW");
       System.out.println(speed.getDisplacement());
       System.out.println(speed.getBrand());
    }
}
