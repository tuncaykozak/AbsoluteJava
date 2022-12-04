package question1;

public class Question1 {
    public static void main(String[] args) {

        test();

    }

    public static void test() {

        for (int i = 10; i <= 100; i++) {
            getNumberOfChainToFindPalindrome(i);
        }

    }

    public static int getNumberOfChainToFindPalindrome(int number) {

        System.out.println(number + " " + isPalindrome(number));
        // burada daha kodlar var ama
        return 0;
    }

    public static boolean isPalindrome(int number) {
        int numberOfDigits = countDigit(number);
        int tempNumber = number;
        int tempAddition = 0;

        for (int i = 0; i < numberOfDigits; i++) {
            tempAddition += tempNumber % 10 * (pow(10, numberOfDigits - (i + 1)));
            tempNumber /= 10;
        }

        return number == tempAddition;
    }

    public static int countDigit(int number) {
        int count = 0;

        do {
            count++;
            number /= 10;
        } while (number > 0);

        return count;

    }

    public static int pow(int a, int b) {

        int result = 1;

        for (int i = 0; i < b; i++) {
            result *= a;
        }

        return result;

    }

}
