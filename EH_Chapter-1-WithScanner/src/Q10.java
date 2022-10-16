import java.util.Scanner;

public class Q10 {

    // 10 g = 10000 mg
    public static final int MG_OF_CAFFEINE_TO_DIE = 10_000;

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the caffeine(mg) of 12-ounce coke : ");
        int caffeineOfCoke = keyboard.nextInt();

        System.out.print("Enter the caffeine(mg) of 16-ounce cup of coffee : ");
        int caffeineOfCoffee = keyboard.nextInt();

        int numberOfCanToDie = MG_OF_CAFFEINE_TO_DIE / caffeineOfCoke;
        int numberOfCupToDie = MG_OF_CAFFEINE_TO_DIE / caffeineOfCoffee;

        System.out.println("Your can of coke limit is : " + numberOfCanToDie);
        System.out.println("Your cup of coffee limit is : " + numberOfCupToDie);

    }
}
