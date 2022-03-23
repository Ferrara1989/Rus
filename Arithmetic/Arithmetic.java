public class Arithmetic {
    public int sumOfNumbers = 0;
    public int differenceOfNumbers = 0;
    public int productOfNumbers = 0;
    public int meanОfNumbers = 0;
    public int maximumОfTwoNumbers = 0;
    public int a = 0;
    public int b = 0;

    public Number(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void sum() {
        System.out.println("Введите число a: ");
        a = new Scanner(System.in).nextInt();
        System.out.println("Введите число b: ");
        b = new Scanner(System.in).nextInt();
        sumOfNumbers = a + b;
    }
    public void difference() {
        System.out.println("Введите число a: ");
        a = new Scanner(System.in).nextInt();
        System.out.println("Введите число b: ");
        b = new Scanner(System.in).nextInt();
        differenceOfNumbers = a - b;
    }
    public void multiplication() {
        System.out.println("Введите число a: ");
        a = new Scanner(System.in).nextInt();
        System.out.println("Введите число b: ");
        b = new Scanner(System.in).nextInt();
        productOfNumbers = a * b;
    }
    public void mean() {
        System.out.println("Введите число a: ");
        a = new Scanner(System.in).nextInt();
        System.out.println("Введите число b: ");
        b = new Scanner(System.in).nextInt();
        meanОfNumbers = a + b / 2;
    }
    public void max() {
        System.out.println("Введите число a: ");
        a = new Scanner(System.in).nextInt();
        System.out.println("Введите число b: ");
        b = new Scanner(System.in).nextInt();
        if (a>b) {
            System.out.println("Максимальное число a");
        }
        if (a<b) {
            System.out.println("Максимальное число b");
        }
        if (a=b) {
            System.out.println("Числа равны");
        }
    }
    public void min() {
        System.out.println("Введите число a: ");
        a = new Scanner(System.in).nextInt();
        System.out.println("Введите число b: ");
        b = new Scanner(System.in).nextInt();
        if (a<b) {
            System.out.println("Минимальное число a");
        }
        if (a>b) {
            System.out.println("Минимальное число b");
        }
        if (a=b) {
            System.out.println("Числа равны");
        }
    }
}
