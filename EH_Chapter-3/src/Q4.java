public class Q4 {

    public static void main(String[] args) {

        test();

    }

    public static void test() {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Total cost of product/products  : ");
        double cost = scanner.nextDouble();

        System.out.print("After how many years will it be paid : ");
        int year = scanner.nextInt();

        System.out.print("Rate of the estimated inflation: ");
        double inflationPercent = scanner.nextDouble();

        System.out.printf("Cost of item: %f", calculateCost(cost, year, inflationPercent));

    }

    public static double calculateCost(double cost, int year, double inflationRate) {

        for (int i = 0; i < year; i++) {

            cost *= (inflationRate / 100 + 1);

        }

        return cost;

    }

}

