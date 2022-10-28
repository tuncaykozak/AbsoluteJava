package homework_002;

public class DailyLife {

    public static void main(String[] args) {

        myWeeklyRoutine();
    }

    public static void myDailyRoutine() {

        System.out.println("I have 24 hours and I have some routines");
        System.out.println("I usually wake up at 09:00 am");
        System.out.println("-----------------------------------------------------");
        my24Hours(9);
    }

    public static void myWeeklyRoutine() {

        int dayOfWeek = 0;

        while (dayOfWeek++ < 7) {
            System.out.printf("####################### DAY-%d #######################\n", dayOfWeek);
            myDailyRoutine();
        }
    }

    private static void my24Hours(int hour) {

        study(hour);
        hour += 4;
        haveLunch(hour);
        hour += 1;
        study(hour);
        hour += 4;
        rest(hour);
        hour += 1;
        haveDinner(hour);
        hour += 1;
        efficientHours(hour);
        hour += 4;
        sleep(hour);

    }

    public static void study(int hour) {

        int startingHour = hour;

        while (hour < startingHour + 4) {
            System.out.printf("%02d:00 = I have a Java Class\n", hour);
            hour++;
        }
    }

    public static void haveLunch(int hour) {

        System.out.printf("%02d:00 = I have lunch\n", hour);
    }

    public static void rest(int hour) {

        System.out.printf("%02d:00 = I am tired now its too early to sleep just rest 1 hour\n", hour);
    }

    public static void haveDinner(int hour) {

        System.out.printf("%02d:00 = I eat my Mom's meals!\n", hour);
    }

    public static void efficientHours(int hour) {

        int startingHour = hour;

        while (hour < startingHour + 4) {
            System.out.printf("%02d:00 = I spend EFFICIENT time with my friends\n", hour);
            hour++;
        }
    }

    public static void sleep(int hour) {

        int startingHour = hour;

        while (hour < startingHour + 9) {
            System.out.printf("%02d:00 = ZzZ\n", hour % 24);
            hour++;
        }
    }
}
