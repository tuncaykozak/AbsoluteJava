package homework_001;

public class ThreeNumberEvolved {
    public static void main(String[] args) {
        input();
    }

    private static void input() {

        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        System.out.print("Enter the first number : ");
        int number1 = keyboard.nextInt();
        System.out.print("Enter the second number : ");
        int number2 = keyboard.nextInt();
        System.out.print("Enter the third number : ");
        int number3 = keyboard.nextInt();

        keyboard.close();

        comparator(number1, number2, number3);
    }

    private static void comparator(int number1, int number2, int number3) {

        int smaller = findSmaller(number1, number2);
        int bigger = findBigger(number1, number2);

        printResult(smaller, bigger, number3);

    }

    private static void printResult(int smaller, int bigger, int number3) {

        if (smaller == bigger)
            printResult(smaller, number3);

        else {
            if (number3 == smaller || number3 == bigger)
                printResult(number3, (number3 == smaller) ? bigger : smaller);

            else {
                int midNumber = number3;

                if (number3 > bigger) {
                    midNumber = bigger;
                    bigger = number3;
                } else if (number3 < smaller) {
                    midNumber = smaller;
                    smaller = number3;
                }
                System.out.printf("%d < %d < %d", smaller, midNumber, bigger);
            }

        }
    }

    private static void printResult(int equalNumber, int number) {

        String result = String.format("%d = %d", equalNumber, equalNumber);

        if (number > equalNumber)
            result = String.format("%s < %d", result, number);
        else if (number < equalNumber)
            result = String.format("%d < %s", number, result);
        else
            result = String.format("%s = %d", result, number);

        System.out.println(result);
    }

    private static int findSmaller(int number1, int number2) {
        return number1 < number2 ? number1 : number2;
    }

    private static int findBigger(int number1, int number2) {
        return number1 > number2 ? number1 : number2;
    }
}
