public class Q6 {

    public static void main(String[] args) {

        test();

    }

    public static void test() {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter the population of green crud (in pounds) : ");
        int population = scanner.nextInt();

        System.out.print("Enter the period for you want to know the population : ");
        int day = scanner.nextInt();

        System.out.printf("After the days, population (in pounds) : %d", calculatePopulation(population, day));

    }

    public static int calculatePopulation(int population, int day) {

        int previousPopulation = population;

        for (int i = 1; i < day / 5; i++) {

            int temp = population;
            population += previousPopulation;
            previousPopulation = temp;

        }

        return population;

    }
}
