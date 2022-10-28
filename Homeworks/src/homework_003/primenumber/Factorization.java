package homework_003.primenumber;

public class Factorization {

    public static void main(String[] args) {

        showFraction();
        // showFraction(0);
    }

    public static void showFraction() {

        int number = getNumber();
        showFraction(number);
    }

    public static void showFraction(int n) {

        for (int i = 1; i <= n; ++i) {
            if (n % i == 0)
                System.out.printf("%d x %d = %d%n", i, n / i, n);
        }
    }

    public static int getNumber() {

        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        System.out.print("Give me a number : ");
        return keyboard.nextInt();
    }


}
