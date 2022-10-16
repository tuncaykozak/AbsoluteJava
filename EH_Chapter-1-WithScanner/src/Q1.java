import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter your weight : ");
        double weight = keyboard.nextDouble();

        System.out.print("Enter your height : ");
        double height = keyboard.nextDouble();

        double bmi = (weight / (height * height));

        System.out.printf("Your BMI : %.2f", bmi);
    }
}
