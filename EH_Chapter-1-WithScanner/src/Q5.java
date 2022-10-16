public class Q5 {

    public static void main(String[] args) {

        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        System.out.print("Enter a sentence which includes \"hate\" : ");
        String input = keyboard.nextLine();

        String changing = "hate";
        System.out.println(input.replaceFirst(changing, "love"));
    }
}
