public class Q9 {

    public static void main(String[] args) {

        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        System.out.print("Enter your height's feet : ");
        int heightInFeet = keyboard.nextInt();

        System.out.print("Enter your height's inches : ");
        int heightInInch = keyboard.nextInt();

        // 1 feet = 12 inches
        int height = heightInFeet * 12 + heightInInch;
        // 5 feet = 60 inches

        int additionalHeight = height - 60;
        int idealWeight = 110 + additionalHeight * 5;
        System.out.println("Your ideal weight is " + idealWeight + " pounds or under it");
    }
}
