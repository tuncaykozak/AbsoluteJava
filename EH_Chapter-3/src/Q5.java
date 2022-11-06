public class Q5 {

    public static void main(String[] args) {

        test();

    }

    public static void test() {

        double cost = 1000;
        double interestRatePerMonth = 1.5;
        double monthlyPayment = 50;

        calculatePaymentPeriod(cost, interestRatePerMonth, monthlyPayment);

    }

    public static void calculatePaymentPeriod(double cost, double interestRatePerMonth, double monthlyPayment) {

        int numberOfMonth = 0;
        double totalInterest = 0;

        while (cost > 0) {

            totalInterest += cost * (interestRatePerMonth / 100);
            cost *= (interestRatePerMonth / 100 + 1);
            cost -= monthlyPayment;

            numberOfMonth++;

        }

        System.out.printf("Payment will take up to %d months and total paid interest is %.2f", numberOfMonth, totalInterest);


    }
}
