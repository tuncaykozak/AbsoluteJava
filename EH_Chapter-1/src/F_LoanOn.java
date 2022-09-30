public class F_LoanOn {

    public static void main(String[] args) {

        double principalAmount = 5000; // 1000
        double interestRate = 8; // 5
        int numberOfYear = 2; // 5

        double simpleInterest = (principalAmount * interestRate * numberOfYear) / 100;

        System.out.printf("Simple Interest : %.2f", simpleInterest); // 250.00
    }
}
