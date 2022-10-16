public class Q6 {

    public static void main(String[] args) {

        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        System.out.print("Enter Principal Amount : ");
        double principalAmount = keyboard.nextDouble();

        System.out.print("Enter Interest Rate : ");
        double interestRate = keyboard.nextDouble();

        System.out.print("Enter number of years to interest : ");
        int numberOfYear = keyboard.nextInt();

        double simpleInterest = (principalAmount * interestRate * numberOfYear) / 100;

        System.out.printf("Simple Interest : %.2f", simpleInterest);
    }
}
