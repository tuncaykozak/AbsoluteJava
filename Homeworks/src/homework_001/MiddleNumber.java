package homework_001;

public class MiddleNumber {

    public static void main(String[] args) {
        printTheMiddleNumber();
    }

    private static void printTheMiddleNumber() {

        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        System.out.print("Enter the first number : ");
        int number1 = keyboard.nextInt();
        System.out.print("Enter the second number : ");
        int number2 = keyboard.nextInt();
        System.out.print("Enter the third number : ");
        int number3 = keyboard.nextInt();

        keyboard.close();

        System.out.printf("The middle number is : %d", mid(number1, number2, number3));

    }

    private static int mid(int number1, int number2, int number3) {

        int smaller = findSmaller(number1, number2);
        int bigger = findBigger(number1, number2);

        return findMedianNumber(smaller, bigger, number3);

    }

    // if there is no median number, it returns bigger number (not smaller)
    private static int findMedianNumber(int smaller, int bigger, int number3) {

        int medianNumber = number3;

        if (number3 > bigger) {
            medianNumber = bigger;
        } else if (number3 < smaller) {
            medianNumber = smaller;
        } else
            medianNumber = bigger;

        return medianNumber;
    }

    private static int findSmaller(int number1, int number2) {
        return number1 < number2 ? number1 : number2;
    }

    private static int findBigger(int number1, int number2) {
        return number1 > number2 ? number1 : number2;
    }
}
