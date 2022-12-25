package homework_001;

public class ThreeNumberEvolved {
    public static void main(String[] args) {
        input();
    }

    static void input() {
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

    // number1 < number2 < number3
    static void comparator(int number1, int number2, int number3) {
        int temp;

        if (number1 >= number2) {
            temp = number1;
            number1 = number2;
            number2 = temp;
        }
        if (number1 >= number3) {
            temp = number1;
            number1 = number3;
            number3 = temp;
        }
        if (number2 >= number3) {
            temp = number2;
            number2 = number3;
            number3 = temp;
        }

        printResult(number1, number2, number3);
    }

    static void printResult(int number1, int number2, int number3) {
        String operator1;
        String operator2;

        operator1 = number1 == number2 ? " = " : " < ";
        operator2 = number2 == number3 ? " = " : " < ";

        System.out.printf("%d%s%d%s%d", number1, operator1, number2, operator2, number3);
    }

}
