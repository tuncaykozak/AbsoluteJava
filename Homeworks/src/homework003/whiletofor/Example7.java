package homework_003.whiletofor;

public class Example7 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        int val;
        System.out.print("Number : ");

        while ((val = kb.nextInt()) != 0) {
            System.out.printf("%d -> reversed: %d%n", val, reversed(val));
            System.out.print("Number : ");
        }
    }

    public static int reversed(int val) {
        int result = 0;

        for (; val != 0; val /= 10) {
            result = result * 10 + val % 10;
        }

        return result;
    }
}
