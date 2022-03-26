public class Motor {
    private int displacement = 5;
    private String brand = "Mercedes-Benz";


    public Motor() {

    }
    public Motor(int displacement, String brand) {
        this.displacement = displacement;
        this.brand = brand;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {

        this.displacement = displacement;
    }

    public String getBrand() {

        return brand;
    }

    public void setBrand(String brand) {

        this.brand = brand;
    }
    public void print() {
        System.out.println("Литраж: " + displacement);
        System.out.println("марка: " + brand);
    }
}
