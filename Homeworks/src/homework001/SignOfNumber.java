package homework_001;

public class SignOfNumber {
    public static void main(String[] args) {
        printSignOfNumber();
    }

    static void printSignOfNumber(){
        java.util.Scanner keyboard = new java.util.Scanner(System.in);
        System.out.print("Enter the number : ");
        int sign = sign(keyboard.nextInt());
        keyboard.close();
        System.out.printf("The sign of the number is : %d", sign);
    }

     static int sign(int number) {
        return number == 0 ? 0 : number > 0 ? 1 : -1;
    }
}
