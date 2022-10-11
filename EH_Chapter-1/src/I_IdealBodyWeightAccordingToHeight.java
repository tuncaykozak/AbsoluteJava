public class I_IdealBodyWeightAccordingToHeight {

    public static void main(String[] args) {

        int heightInFeet = 6;
        int heightInInch = 3;

        // 1 feet = 12 inches
        int height = heightInFeet * 12 + heightInInch;
        // 5 feet = 60 inches

//        int additionalHeight = height - 60;
//        int idealWeight = 110 + additionalHeight * 5;
//        System.out.println(idealWeight);

        System.out.println("Ideal weight is : " + ((height > 60) ? (110 + (height - 60) * 5) : 110) + " pounds");

    }
}
