public class Arithmetic {
    public int a = 0;
    public int b = 0;

    public Arithmetic(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void sum() {

        System.out.println(a+b);
    }
    public void difference() {
        System.out.println(a-b);
    }
    public void multiplication() {
        System.out.println(a*b);
    }
    public void mean() {
        System.out.println(a+b/2);
    }
    public void max() {
        if (a>b) {
            System.out.println("Максимальное число a " + a);
        }
        if (a<b) {
            System.out.println("Максимальное число b " + b);
        }
    }
    public void min() {
        if (a<b) {
            System.out.println("Минимальное число a " + a);
        }
        if (a>b) {
            System.out.println("Минимальное число b " + b);
        }
    }
}
