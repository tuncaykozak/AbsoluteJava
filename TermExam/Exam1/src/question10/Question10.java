package question10;

public class Question10 {
    public static void main(String[] args) {

        findExponential();

    }

    public static void findExponential(){

        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Enter the power of e : ");
        double powOfExponential = kb.nextDouble();

        System.out.printf("e^%.3f = %.5f", powOfExponential, calculateExponential(powOfExponential));

    }

    public static double calculateExponential(double powOfExponential){

        double result = 1;

        for(int i = 1; i < 10; i++){
            result +=(pow(powOfExponential,i) / factorial(i) );

        }

        return result;
    }

    public static double pow(double a, int b){

        double pow = 1;

        for(int i = 1; i < b; i++){
            pow *= a;
        }

        return pow;

    }
    public static int factorial(int number) {

        int result = 1;

        for (int i = number; i > 1; i--) {
            result *= i;
        }

        return result;
    }
}
