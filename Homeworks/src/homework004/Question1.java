package homework004;

public class Question1 {

    public static void main(String[] args) {

        test();

    }

    public static void test() {

        java.util.Scanner keyboard = new java.util.Scanner(System.in);
        System.out.print("Enter the number of shape: ");
        int number = keyboard.nextInt();

        shaper(number);

    }

    public static void shaper(int number) {

        if (number < 1) {
            System.out.println("Invalid Input");
            test();
        }

        displayUpperPartOfShape(number);
        displayLowerPartOfShape(number);

    }

    public static void displayUpperPartOfShape(int number) {

        for (int i = 1; i <= number; i++) {
            spacer(number - i);
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void displayLowerPartOfShape(int number) {

        for (int i = 1; i < number; i++) {
            spacer(i);
            for (int j = (number - i) * 2 - 1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void spacer(int spaceNumber) {

        for (int i = 0; i < spaceNumber; i++)
            System.out.print(" ");

    }
}
