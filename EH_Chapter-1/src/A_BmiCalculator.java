public class A_BmiCalculator {

    public static void main(String[] args) {

        double weight = 86.5; // in kilograms
        double height = 1.75; // in meters

        // Body Mass Index
        double bmi = (weight / (height * height));
        System.out.printf("BMI : %.2f", bmi);

    }
}
