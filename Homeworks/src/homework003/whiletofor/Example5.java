package homework_003.whiletofor;

public class Example5 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Enter a number : ");
        int val = abs(kb.nextInt());

        if (val != 0)
            System.out.printf("%d -> total digits count: %d", val, countDigits(val));
        else
            System.out.println("Invalid input !");
    }

    public static int countDigits(int val) {
        int count = 0;

        for (; val > 0; val /= 10) {
            count++;
        }

        return count;
    }

    public static int abs(int x) {
        return x < 0 ? -x : x;
    }
}
