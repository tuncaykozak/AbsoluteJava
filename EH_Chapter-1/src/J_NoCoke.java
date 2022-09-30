public class J_NoCoke {

    // 10 g = 10000 mg

    public static final int CAFFEINE_OF_12_OUNCE_COKE = 34;
    public static final int CAFFEINE_OF_16_OUNCE_CUP_OF_COFFEE = 160;
    public static final int MG_OF_CAFFEINE_TO_DIE = 10_000;

    public static void main(String[] args) {

        int numberOfCanToDie = MG_OF_CAFFEINE_TO_DIE / CAFFEINE_OF_12_OUNCE_COKE + 1;
        int numberOfCupToDie = MG_OF_CAFFEINE_TO_DIE / CAFFEINE_OF_16_OUNCE_CUP_OF_COFFEE + 1;

        System.out.println(numberOfCanToDie + " 12-ounce can of coke kills you!");
        System.out.println(numberOfCupToDie + " 16-ounce cup of coffee kills you!");

        // Dr. Alban - No Coke :

        for(int i = 0; i < numberOfCanToDie; i++ ){
            System.out.print(i);
            System.out.print(" cans of coke and ");
            System.out.print(((MG_OF_CAFFEINE_TO_DIE -(i * CAFFEINE_OF_12_OUNCE_COKE)) / CAFFEINE_OF_16_OUNCE_CUP_OF_COFFEE) + 1);
            System.out.println(" cup of coffee can kill YOU!");
        }




    }
}
