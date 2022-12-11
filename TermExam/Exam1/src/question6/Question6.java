package question6;

public class Question6 {
    public static void main(String[] args) {

        test();

    }

    public static void test() {

        int dayOfStartingDate = 22;
        int monthOfStartingDate = 9;
        int yearOfStartingDate = 2022;

        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        System.out.print("Enter the day of the date to be calculated : ");
        int dayOfTheDate = keyboard.nextInt();

        System.out.print("Enter the month of the date to be calculated : ");
        int monthOfTheDate = keyboard.nextInt();

        System.out.print("Enter the year of the date to be calculated : ");
        int yearOfTheDate = keyboard.nextInt();

        printHoursOfLessonAndNumberOfLesson(dayOfTheDate, monthOfTheDate, yearOfTheDate, dayOfStartingDate, monthOfStartingDate, yearOfStartingDate);

    }

    public static void printHoursOfLessonAndNumberOfLesson(int dayOfTheDate, int monthOfTheDate, int yearOfTheDate, int dayOfStartingDate, int monthOfStartingDate, int yearOfStartingDate) {

        if (checkDates(dayOfTheDate, monthOfTheDate, yearOfTheDate, dayOfStartingDate, monthOfStartingDate, yearOfStartingDate)) {

            System.out.printf("The hours of lessons : %d", calculateHoursOfLesson(dayOfTheDate, monthOfTheDate, yearOfTheDate, dayOfStartingDate, monthOfStartingDate, yearOfStartingDate));

            System.out.println();

            System.out.printf("The number of homeworks : %d", calculateNumberOfHomeworks(dayOfTheDate, monthOfTheDate, yearOfTheDate, dayOfStartingDate, monthOfStartingDate, yearOfStartingDate));
        } else {
            System.out.println("=====================================================================================");
            System.out.println("Enter the dates again please!");
            test();
        }

    }

    public static boolean checkDates(int dayOfTheDate, int monthOfTheDate, int yearOfTheDate, int dayOfStartingDate, int monthOfStartingDate, int yearOfStartingDate) {

        if (isValidDate(dayOfStartingDate, monthOfStartingDate, yearOfStartingDate)) {
            System.out.println("The starting date is not valid");
            return false;
        }

        if (isValidDate(dayOfTheDate, monthOfTheDate, yearOfTheDate)) {
            System.out.println("The date to be calculated is not valid");
            return false;
        }

        if (isBefore(dayOfTheDate, monthOfTheDate, yearOfTheDate, dayOfStartingDate, monthOfStartingDate, yearOfStartingDate)) {
            System.out.println("The day to be calculated is not before the starting date");
            return false;
        }

        return true;

    }

    public static boolean isValidDate(int day, int month, int year) {

        return 1 > day || day > 31 || 1 > month || month > 12 || day > getDays(month, year);

    }

    public static int getDays(int month, int year) {

        int day = 31;

        switch (month) {
            case 4, 6, 9, 11 -> day = 30;
            case 2 -> {
                day = 28;
                if (isLeapYear(year))
                    ++day;
            }
        }

        return day;

    }

    public static boolean isLeapYear(int year) {

        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

    }

    public static boolean isBefore(int dayOfTheDate, int monthOfTheDate, int yearOfTheDate, int dayOfStartingDate, int monthOfStartingDate, int yearOfStartingDate) {

        if (yearOfTheDate < yearOfStartingDate)
            return true;
        else if (yearOfTheDate == yearOfStartingDate) {
            if (monthOfTheDate < monthOfStartingDate)
                return true;
            else if (monthOfTheDate == monthOfStartingDate)
                return dayOfTheDate < dayOfStartingDate;
        }

        return false;

    }

    public static int calculateHoursOfLesson(int dayOfTheDate, int monthOfTheDate, int yearOfTheDate, int dayOfStartingDate, int monthOfStartingDate, int yearOfStartingDate) {

        int days = calculateDaysBetweenDates(dayOfTheDate, monthOfTheDate, yearOfTheDate, dayOfStartingDate, monthOfStartingDate, yearOfStartingDate);

        return days / 7 * 4;

    }

    public static int calculateNumberOfHomeworks(int dayOfTheDate, int monthOfTheDate, int yearOfTheDate, int dayOfStartingDate, int monthOfStartingDate, int yearOfStartingDate) {

        int days = calculateDaysBetweenDates(dayOfTheDate, monthOfTheDate, yearOfTheDate, dayOfStartingDate, monthOfStartingDate, yearOfStartingDate);

        return days / 11;

    }

    public static int calculateDaysBetweenDates(int dayOfTheDate, int monthOfTheDate, int yearOfTheDate, int dayOfStartingDate, int monthOfStartingDate, int yearOfStartingDate) {

        int days = 0;

        for (int year = yearOfTheDate; year >= yearOfStartingDate; year--) {

            int numberOfMonth = 12;
            int lastMonth = 1;

            if (year == yearOfTheDate)
                numberOfMonth = monthOfTheDate - 1;
            if (year == yearOfStartingDate)
                lastMonth = monthOfStartingDate;

            for (int month = numberOfMonth; month >= lastMonth; month--) {
                days += getDays(month, year);
            }

        }

        return days - dayOfStartingDate + dayOfTheDate;

    }


}
