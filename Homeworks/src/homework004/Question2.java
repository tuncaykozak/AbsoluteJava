package homework004;

public class Question2 {

    public static void main(String[] args) {

        getTime();

    }

    public static void getTime(){

        java.util.Scanner keyboard = new java.util.Scanner(System.in);
        System.out.print("Enter the time: ");
        long time = keyboard.nextLong();

        displayDuration(time);

    }

    public static void displayDuration(long time){

        System.out.println(findHour(time) + " " + findMinutes(time) + " " + findSecond(time));

    }

    public static String findSecond(long time) {

        long second = time % 60;
        return second > 0 ? second + " seconds" : "";

    }

    public static String findMinutes(long time) {

        long minutes = (time / 60) % 60;
        return minutes > 0 ? minutes + " minutes" : "";

    }

    public static String findHour(long time) {

        long hours = (time / 3600);
        return hours > 0 ? hours + " hours" : "";

    }

}
