public class Q5 {

    public static void main(String[] args) {

        test();

    }

    public static void test() {

        double cost = 1000;
        double interestRatePerYear = 18;
        double interestRatePerMonth = 1.5;
        double monthlyPayment = 50;

        System.out.printf("Payment will take up to %d months!",
                calculatePaymentPeriod(cost, interestRatePerYear, interestRatePerMonth, monthlyPayment));

    }

    public static int calculatePaymentPeriod(double cost, double interestRatePerYear, double interestRatePerMonth, double monthlyPayment) {

        int numberOfMonth = 0;

        while (cost > 0) {

            if (numberOfMonth % 12 == 0)
                cost *= (interestRatePerYear / 100 + 1);

            cost *= (interestRatePerMonth / 100 + 1);
            cost -= monthlyPayment;

            numberOfMonth++;
        }

        return numberOfMonth;

    }
}
