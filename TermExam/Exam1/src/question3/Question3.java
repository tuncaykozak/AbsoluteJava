package question3;


public class Question3 {
    public static void main(String[] args) {

        test();

    }

    public static void test() {

        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("Give me a number : ");
        int number = kb.nextInt();

        System.out.printf("First Armstrong number after Factorial of given number = %d", findFirstArmstrongNumberAfterFactorial(number));

    }

    public static int findFirstArmstrongNumberAfterFactorial(int number) {

        int factorial = calculateFactorial(number);

        do {
            factorial++;
        } while (!isArmstrong(factorial));

        return factorial;
    }

    public static int calculateFactorial(int number) {

        int result = 1;

        for (int i = number; i > 1; i--) {
            result *= i;
        }

        return result;
    }

    public static boolean isArmstrong(int number) {

        int numberOfDigit = countDigit(number);
        int powAddition = 0;
        int temp = number;

        for(int i = 0; i < numberOfDigit; i++ ){
            powAddition += pow(temp % 10, numberOfDigit);
            temp /= 10;
        }

        return powAddition == number;

    }

    public static int countDigit(int number) {
        int count = 0;

        do {
            count++;
            number /= 10;
        } while (number > 0);

        return count;

    }

    public static int pow(int a, int b){

        int result = 1;

        for(int i = 0; i < b; i++){
            result *= a;
        }

        return result;

    }
}
