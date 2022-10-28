package homework_003.armstrong;

public class NumberUtil {
    public static void main(String[] args) {
        getArmstrongNumbers();
    }

    public static void getArmstrongNumbers() {

        for(int i = -5; i <=999999; ++i){
            if (isArmstrong(i))
                System.out.println(i);
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

        for(int temp = number; temp != 0; temp /= 10){
            total += pow(temp % 10, numberOfDigits);
        }

        return total;
    }


    public static int countDigits(int number) {

        int numberOfDigits = 0;

        for(int temp = number; temp != 0; temp /= 10){
            numberOfDigits++;
        }

        return numberOfDigits;
    }

    public static int pow(int a, int b) {

        int result = 1;

        for (int i = 0; i < b; i++) {
            result *= a;
        }

        return result;
    }
}
