public class Q3 {

    public static void main(String[] args) {

        run();

    }

    public static void run() {

        while (isWantedContinue()) {

            java.util.Scanner scanner = new java.util.Scanner(System.in);

            System.out.print("Enter the mass of car : ");
            double weightOfCar = scanner.nextDouble();

            int place = selectPlace();

            System.out.printf("The weight of car on %s is %.2f Newton\n", (place == 1 ? "Earth" : "Moon"), calculateWeight(place, weightOfCar));

        }

    }

    public static boolean isWantedContinue() {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("For calculate the weight enter 'Y' ( Others for EXIT) : ");

        return scanner.nextLine().equalsIgnoreCase("y");

    }

    public static double calculateWeight(int selection, double weightOfCar) {

        weightOfCar *= 9.81;

        if(selection == 1)
            return weightOfCar;

        return weightOfCar / 6;

    }

    public static int selectPlace() {

        java.util.Scanner keyboard = new java.util.Scanner(System.in);
        System.out.println("Calculate weight on Earth Enter '1'");
        System.out.println("Calculate weight on Moon Enter any number (except '1')");

        System.out.print("Enter your selection : ");

        return keyboard.nextInt();



    }


}




