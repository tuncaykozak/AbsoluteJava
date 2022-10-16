public class Q8 {

    public static void main(String[] args) {

        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        System.out.print("Enter the distance : ");
        final int DISTANCE = keyboard.nextInt();

        System.out.print("Enter the time : ");
        double time = keyboard.nextDouble();

        double averageSpeed = DISTANCE / time;
        System.out.printf("Car average speed is %.2f miles per hour.", averageSpeed);
    }
}
