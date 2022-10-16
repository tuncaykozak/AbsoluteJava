import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter seconds to calculate : ");
        int time = keyboard.nextInt();

        int hour = time / 3600;
        int minute = (time % 3600) / 60;
        int second = (time % 3600) % 60;

        System.out.printf("%02d:%02d:%02d", hour,minute,second);


    }
}
