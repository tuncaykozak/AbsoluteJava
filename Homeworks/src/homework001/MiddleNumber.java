package homework_001;

public class MiddleNumber {

    public static void main(String[] args) {
        printTheMiddleNumber();
    }

    private static void printTheMiddleNumber() {
        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        System.out.print("Enter the first number : ");
        int number1 = keyboard.nextInt();
        System.out.print("Enter the second number : ");
        int number2 = keyboard.nextInt();
        System.out.print("Enter the third number : ");
        int number3 = keyboard.nextInt();

        keyboard.close();

        System.out.printf("The middle number is : %d", mid(number1, number2, number3));

    }

    // if there is no median number, it returns smaller number (not bigger)
    static int mid(int number1, int number2, int number3) {
        if((number1 > number2 && number1 < number3) || (number1 < number2 && number1 > number3))
            return number1;
        else if (number1 > number2)
            return (number2 > number3) ? number2 : number3;
        else
            return (number2 < number3) ? number2 : number3;
    }



}
