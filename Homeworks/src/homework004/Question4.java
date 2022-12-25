package homework004;

import static homework004.Question1.shaper;

public class Question4 {

    public static void main(String[] args) {

        test();

    }

    public static void test() {

        java.util.Scanner keyboard = new java.util.Scanner(System.in);
        System.out.print("Enter the width: ");
        int width = keyboard.nextInt();
        System.out.print("Enter the height: ");
        int height = keyboard.nextInt();

        shaper(width, height);

    }

    public static void shaper(int width, int height) {

        for (int i = 0; i < height; i++) {

            lineStarting();

            if ((i / (width - 1)) % 2 == 0)
                rightShifting(i, width);
            else
                leftShifting(i, width);

            lineEnding();
        }


    }

    public static void rightShifting(int iteration, int width) {

        for (int j = 0; j < width; j++) {
            if (iteration % (width - 1) == j)
                System.out.print("*");
            else
                spacing();
        }
    }

    public static void leftShifting(int iteration, int width) {

        for (int j = (width - 1); j >= 0; j--) {
            if (iteration % (width - 1) == j)
                System.out.print("*");
            else
                spacing();
        }
    }

    public static void lineStarting() {

        System.out.print("|");

    }

    public static void lineEnding() {

        System.out.println("|");

    }

    public static void spacing() {

        System.out.print(" ");

    }


}
