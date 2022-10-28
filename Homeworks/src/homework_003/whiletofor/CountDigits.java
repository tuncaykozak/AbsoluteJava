package homework_003.whiletofor;

public class CountDigits {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        System.out.print("Number : ");
        int val = keyboard.nextInt();

        System.out.printf("%d's total digits : %d", val, countDigits(val));
    }

    public static int countDigits(int val) {
        int count = 0;

        for (int i = val; i > 0; i /= 10) {
            count++;
        }

        return count;
    }

}
