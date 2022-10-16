import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {

        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        System.out.print("Enter first word : ");
        String first = keyboard.next();
        System.out.print("Enter first word : ");
        String second = keyboard.next();

        String letterOfFirst = first.substring(1, 2);
        String letterOfSecond = second.substring(1, 2);

        System.out.println(letterOfFirst.toUpperCase() + first.substring(2) + first.substring(0, 1) + "ay" + " "
                + letterOfSecond.toUpperCase() + second.substring(2) + second.substring(0, 1) + "ay");

    }

}
