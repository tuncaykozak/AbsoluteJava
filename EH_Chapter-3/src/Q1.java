public class Q1 {

    public static void main(String[] args) {

       test();

    }

    public static void test() {

        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("Give me a number : ");
        double n = kb.nextDouble();

        System.out.printf("Root of %.2f is %.2f", n, calculateRoot(n));

    }

    public static double calculateRoot(double n) {

        double guess = n / 2;
        double previousGuess;

        do {
            previousGuess = guess;
            guess = (guess + n / guess) / 2;
        } while (previousGuess - guess > previousGuess / 100);

        return guess;

    }
}