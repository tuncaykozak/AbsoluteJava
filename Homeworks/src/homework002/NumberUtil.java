package homework_002;

public class NumberUtil {
    public static void main(String[] args) {
        getArmstrongNumbers();
    }

    public static void getArmstrongNumbers() {

        int number = -6; // 0 -> start from 1
        while (number++ < 999999) {
            if (isArmstrong(number))
                System.out.println(number);
        }
    }

    public static boolean isArmstrong(int number) {

        if (number < 0) {
            System.out.printf("%d is a negative number!\n", number);
            return false;
        }
        return (number == getPowerOfDigits(number));
    }

    public static int getPowerOfDigits(int number) {

        int total = 0;
        int numberOfDigits = countDigits(number);
        int iterationNumber = number;

        do {
            total += pow(iterationNumber % 10, numberOfDigits);
            iterationNumber /= 10;
        }
        while (iterationNumber > 0);

        return total;
    }


    public static int countDigits(int number) {

        int numberOfDigits = 0;

        do {
            number /= 10;
            numberOfDigits++;
        }
        while (number > 0);

        return numberOfDigits;
    }

    public static int pow(int a, int b) {

        int result = 1;

        while (b-- > 0) {
            result *= a;
        }

        return result;
    }

}