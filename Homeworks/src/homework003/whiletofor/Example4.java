package homework_003.whiletofor;

public class Example4 {
    public static void main(String[] args) {
        countAndSumPositiveAndNegatives();
    }

    public static void countAndSumPositiveAndNegatives() {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Start to enter the numbers and '0' for EXIT !!");
        System.out.println("-----------------------------------------------------");
        System.out.print("Enter the number that will collect : ");

        int sumPositive = 0, sumNegative = 0;
        int countNegative = 0, countPositive = 0, countNumbers;
        int val;

        for (countNumbers = 0; (val = kb.nextInt()) != 0; ++countNumbers) {

            System.out.print("Enter the number that will collect : ");

            if (val > 0) {
                sumPositive += val;
                ++countPositive;
            } else {
                sumNegative += val;
                ++countNegative;
            }
        }

        System.out.println("-----------------------------------------------------");
        display(sumPositive, countPositive, sumNegative, countNegative, countNumbers);
    }

    public static void display(int posSum, int posCount, int negSum, int negCount, int count) {
        System.out.printf("You entered %d numbers%n", count);

        if (posCount > 0)
            System.out.printf("%d numbers of positive sum : %d%n", posCount, posSum);
        else
            System.out.println("You have not entered any Positive number");

        if (negCount > 0)
            System.out.printf("%d numbers of negative sum : %d%n", negCount, negSum);
        else
            System.out.println("You have not entered any Negative number");

    }
}
