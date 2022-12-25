package homework004;

public class Question3 {

    public static void main(String[] args) {

        getNumber();

    }

    public static void getNumber() {

        java.util.Scanner keyboard = new java.util.Scanner(System.in);
        System.out.print("Enter the number: ");
        long number = keyboard.nextLong();

        findPrimeMultipliers(number);

    }

    public static void findPrimeMultipliers(long number) {

        System.out.printf("%d = ", number);
        displayPrimeMultipliers(number);

    }

    public static void displayPrimeMultipliers(long number) {

        long divisor = 2;

        while (number > 1) {

            if (number % divisor == 0) {
                number /= divisor;
                if (number != 1)
                    System.out.printf("%d * ", divisor);
                else
                    System.out.print(divisor);

            } else
                divisor = nextPrimeNumber(divisor);

        }

    }

    public static long nextPrimeNumber(long number) {

        if (number == 2)
            return 3;

        do {
            number += 2;
        }
        while (!isPrime(number));

        return number;

    }

    public static boolean isPrime(long number) {

        if (number <= 1)
            return false;

        if (number % 2 == 0)
            return number == 2;

        for (long i = 3; i * i <= number; i += 2) {
            if (number % i == 0)
                return false;
        }

        return true;

    }

}
