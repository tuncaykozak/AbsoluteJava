package question1;

public class Question1 {

    public static void main(String[] args) {

        test();

    }

    public static void test() {

        getNumberMaxChainToPalindrome(10, 100);

    }

    public static void getNumberMaxChainToPalindrome(int startingNumber, int finishingNumber) {

        int maxChain = 0;

        for (int i = startingNumber; i <= finishingNumber; i++) {
            if (getNumberOfChainToFindPalindrome(i) > maxChain)
                maxChain = getNumberOfChainToFindPalindrome(i);
        }

        printNumbersWithHighestNumberOfChain(maxChain, startingNumber, finishingNumber);

    }

    public static void printNumbersWithHighestNumberOfChain(int maxChain, int startingNumber, int finishingNumber) {

        System.out.printf("The numbers with the highest number of chain(%d) are :%n", maxChain);

        for (int i = startingNumber; i <= finishingNumber; i++) {
            if (getNumberOfChainToFindPalindrome(i) == maxChain) {
                System.out.println(i);
            }
        }

    }

    public static int getNumberOfChainToFindPalindrome(long number) {

        int numberOfChain = 0;

        do {
            numberOfChain++;
            number += reversedNumber(number);
        } while (!isPalindrome(number));

        return numberOfChain;

    }

    public static boolean isPalindrome(long number) {

        return number == reversedNumber(number);
    }

    public static long reversedNumber(long number) {

        int numberOfDigits = countDigit(number);
        long reversedNumber = 0;

        for (int i = 0; i < numberOfDigits; i++) {
            reversedNumber += number % 10 * (pow(10, numberOfDigits - (i + 1)));
            number /= 10;
        }
        return reversedNumber;

    }

    public static int countDigit(long number) {

        int count = 0;

        do {
            count++;
            number /= 10;
        } while (number > 0);

        return count;

    }

    public static long pow(int a, int b) {

        long result = 1;

        for (int i = 0; i < b; i++) {
            result *= a;
        }

        return result;

    }

}
