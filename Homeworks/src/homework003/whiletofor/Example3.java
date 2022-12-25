package homework_003.whiletofor;

public class Example3 {
    public static void main(String[] args) {
        countPositiveAndNegatives();
    }

    public static void countPositiveAndNegatives() {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Enter numbers : (EXIT = 0)");
        System.out.println("----------------------------------------------");
        System.out.print("Enter the number that will collect : ");

        int val;
        int sumPositive = 0, sumNegative = 0;

        for (; (val = kb.nextInt()) != 0; ) {

            System.out.print("Enter the number that will collect : ");

            if (val > 0)
                sumPositive += val;
            else
                sumNegative += val;
        }

        System.out.println("----------------------------------------------");

        display(sumPositive, sumNegative);
    }

    public static void display(int positive, int negative) {
        if (positive > 0)
            System.out.printf("Sum of Positive numbers: %d%n", positive);
        else
            System.out.println("You have not entered any Positive number");

        if (negative < 0)
            System.out.printf("Sum of Negative numbers: %d%n", negative);
        else
            System.out.println("You have not entered any Negative number");
    }
}
