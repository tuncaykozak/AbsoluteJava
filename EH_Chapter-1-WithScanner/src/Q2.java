public class Q2 {

    public static void main(String[] args) {

        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        System.out.print("Enter number of your coupons : ");
        int coupon = keyboard.nextInt();

        int candy = coupon / 10;
        int gumball = (coupon % 10) / 3;
        int remainingCoupon = (coupon % 10) % 3;

        System.out.print("Candies : " + candy + "\nGumballs : " + gumball + "\nRemaining Coupons : " + remainingCoupon);

    }
}
