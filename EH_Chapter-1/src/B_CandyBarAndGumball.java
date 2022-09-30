public class B_CandyBarAndGumball {

    public static void main(String[] args) {
        int coupon = 37;

        int candy = coupon / 10;
        int gumball = (coupon % 10) / 3;
        int remainingCoupon = (coupon % 10) % 3;

        System.out.print("Candies : " + candy + "\nGumballs : " + gumball + "\nRemaining Coupons : " + remainingCoupon);
    }
}
