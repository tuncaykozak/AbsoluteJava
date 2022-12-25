package homework_003.whiletofor;

public class Example2 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("How many times you want to loop through : ");
        int n = kb.nextInt();

        System.out.println("--------------------------------------------");

        int i = 0;

        for (; i <= --n; ) {
            System.out.println(n);
        }
        System.out.printf("n = %d", n);

    }
}
