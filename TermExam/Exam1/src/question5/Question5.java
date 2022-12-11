package question5;

public class Question5 {
    public static void main(String[] args) {

        test();

    }

    public static void test() {

        System.out.println("This program calculate roots of equations like ax^2 + bx + c = 0\n");

        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        System.out.print("Enter the value of \"a\" : ");
        int a = keyboard.nextInt();
        System.out.print("Enter the value of \"b\" : ");
        int b = keyboard.nextInt();
        System.out.print("Enter the value of \"c\" : ");
        int c = keyboard.nextInt();

        getRoots(a, b, c);

    }

    public static void getRoots(int a, int b, int c) {

        if (a == 0) {
            System.out.println("There is no root for this solution");
            return;
        }

        if (findSqrtOfDelta(a, b, c) < 0) {
            System.out.println("There is no reel root (imaginary)");
            return;
        }

        double root1;
        double root2;
        if (findSqrtOfDelta(a, b, c) >= 0) {
            root1 = ((-b + findSqrtOfDelta(a, b, c))) / (2 * a);
            root2 = ((-b - findSqrtOfDelta(a, b, c))) / (2 * a);
            printRoots(root1, root2);
        }

    }

    public static double findSqrtOfDelta(int a, int b, int c) {

        double delta = b * b - 4 * a * c;

        return sqrt(delta);
    }

    public static double sqrt(double number) {

        double guess = number;

        if (number > 0) {
            guess = number / 2;
            double previousGuess;

            do {
                previousGuess = guess;
                guess = (guess + number / guess) / 2;
            } while (previousGuess - guess > previousGuess / 100);
        }

        return guess;

    }

    public static void printRoots(double root1, double root2) {

        if (root1 == root2)
            System.out.printf("The roots are same : %.3f", root1);

        else {
            System.out.printf("First root : %.3f", root1);
            System.out.println();
            System.out.printf("First root : %.3f", root2);
        }
    }
}
