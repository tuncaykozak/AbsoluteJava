package homework_003.whiletofor;

public class ForIntro {
    public static void main(String[] args) {

        /*

        for (Initialization; Boolean_Expression; Update)
            Body

         */

        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        System.out.print("Number : ");
        int n = keyboard.nextInt();

        for(int i = 0; i < n; ++i){
            System.out.printf("i = %d%n", i);
        }
    }
}
