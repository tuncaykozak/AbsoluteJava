public class D_SodaForMice {

    public static final double FRACTION = 0.001;

    public static void main(String[] args) {

        /* average laboratory mouse is approximately 200 g
           0.31 g sweetener kills mouse

           and my friend wants to lose weight without stopping to drink soda, I don't know why?
           I will calculate safe limit of drinking soda for my friend:
        */

        double mouseWeightInKg = 0.2; // kg
        double weightOfSweetenerToKillMouse = 0.00031; // kg

        double currentWeight = 120;
        double desiredWeight = 80;

        // double douseOfSweetener = (weightOfSweetenerToKillMouse / mouseWeightInKg);

        // double limitOfSweetener = desiredWeight * douseOfSweetener;

        System.out.println((weightOfSweetenerToKillMouse/mouseWeightInKg * desiredWeight / FRACTION) + " soda pop that my friend can drink");


    }
}
