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

        } else {
            int total = 0;
            int numberOfDigits = countDigits(number);

            /*
            int iteration = 0;

            do {
                int digit = (number / pow(10, iteration)) % 10;
                total += pow(digit, numberOfDigits);
            }
            while (++iteration < numberOfDigits);
            */

            int iterationNumber = number;
            do {
                total += pow(iterationNumber % 10, numberOfDigits);
                iterationNumber /= 10;
            }
            while (iterationNumber > 0);

            return (total == number);
        }

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