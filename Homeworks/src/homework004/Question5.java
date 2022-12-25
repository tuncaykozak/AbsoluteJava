package homework004;

import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {

        test();

    }

    public static void test() {

        java.util.Scanner keyboard = new Scanner(System.in);
        System.out.print("Give me an EVEN number: ");
        long number = keyboard.nextLong();

        if (number % 2 == 0 && number > 2)
            getPrimePair(number);
        else {
            System.out.println("The Input is Invalid!");
            test();
        }

    }

    public static void getPrimePair(long number) {

        for (long i = 2; i <= number / 2; i = nextPrimeNumber(i)) {
            if (isPrime(number - i)) {
                displayPrimePair(number, i);
            }
        }

    }

    public static long nextPrimeNumber(long number) {

        do {
            number += 1;
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

    private static void displayPrimePair(long number, long firstCollected) {

        System.out.printf("%d : %d + %d%n", number, firstCollected, number - firstCollected);

    }

}
