public class Q2 {

    public static void main(String[] args) {

        test();

    }

    public static void test() {

        java.util.Scanner kb = new java.util.Scanner(System.in);

        String beforeColor = "";
        String pattern = "";
        int count = 0;

        while (count < 5) {
            System.out.print("Enter the color of pattern : ");
            String nextColor = kb.nextLine().substring(0, 1);

            if (checkPattern(nextColor, beforeColor)) {
                beforeColor = nextColor;
                pattern += nextColor.toUpperCase();
                count++;
            }

        }


        System.out.printf("\nThe final pattern is :  %s", pattern);

    }

    public static boolean checkPattern(String currentColor, String beforeColor) {

        if (!currentColor.equalsIgnoreCase("R") && !currentColor.equalsIgnoreCase("G") && !currentColor.equalsIgnoreCase("B")) {
            // System.out.println("You have to enter R / G / B !");
            return false;
        }

        if (currentColor.equalsIgnoreCase(beforeColor)) {
            // System.out.println("You can not enter previous color!");
            return false;
        }

        return true;

    }

}
