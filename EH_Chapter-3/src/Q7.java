public class Q7 {

    public static void main(String[] args) {

        getArmstrongNumbersWithRanges();

    }

    public static void getArmstrongNumbersWithRanges() {

        while (isWantedContinue()) {

            java.util.Scanner scanner = new java.util.Scanner(System.in);

            System.out.print("Enter the beginning number of Armstrong numbers : ");
            int beginning = scanner.nextInt();

            System.out.print("Enter the ending number of Armstrong numbers : ");
            int ending = scanner.nextInt();

            getArmstrongNumbers(beginning, ending);

        }

    }

    private static boolean isWantedContinue() {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("For calculate the weight enter 'Y' ( Others for EXIT) : ");

        return scanner.nextLine().equalsIgnoreCase("y");
    }

    public static void getArmstrongNumbers(int beginning, int ending) {

        System.out.println("Armstrong numbers according to entered ranges :");

        for (int i = beginning; i <= ending; i++) {
            if (isArmstrong(i))
                System.out.println(i);
        }

    }

    public static boolean isArmstrong(int number) {

        if (number < 0) {
            System.out.printf("%d is a negative number!\n", number);
            return false;
        }

        return (number == getPowerOfDigits(number));

    }

    public static int getPowerOfDigits(int number) {

        int total = 0;
        int numberOfDigits = countDigits(number);
        int iterationNumber = number;

        do {
            total += pow(iterationNumber % 10, numberOfDigits);
            iterationNumber /= 10;
        }
        while (iterationNumber > 0);

        return total;

    }


    public static int countDigits(int number) {

        int numberOfDigits = 0;

        for(; number > 0; number /= 10){

            numberOfDigits++;
        }

        return numberOfDigits;

    }

    public static int pow(int a, int b) {

        int result = 1;

        while (b-- > 0) {
            result *= a;
        }

        return result;

    }

}

