import java.util.Scanner;

public class Main {
    private static int sumDigits = 0;
    private static String digits = "";

    public static void main(String[] args) {

        sum();
        calcul();
        print();
    }

    public static void sum() {
        System.out.println("Введите число: ");
        int numbers = new Scanner(System.in).nextInt();
        digits = String.valueOf(numbers);
    }

    public static void calcul() {
        for (int i = 0; i < digits.length(); i++) {
            int number = Integer.parseInt(String.valueOf(digits.charAt(i)));
            sumDigits = sumDigits + number;
        }
    }

    public static void print() {
        System.out.println("Результат: " + sumDigits);
    }
}
