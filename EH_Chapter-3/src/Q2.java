public class Q2 {

    public static void main(String[] args) {

        test();

    }

    public static void test (){

        String correctPattern = "RBGBR";
        String wrongPatternWithWrongChar = "RXGBR";
        String wrongPattern = "RRGBR";

        showPattern(correctPattern);
        showPattern(wrongPatternWithWrongChar);
        showPattern(wrongPattern);

    }

    public static void showPattern(String pattern){
        if(checkPattern(pattern))
            System.out.println(pattern);
    }

    public static boolean checkPattern(String pattern){

        for(int i = 0; i < pattern.length(); i++){

            String ch = pattern.substring(i, i + 1);

            if(!ch.equalsIgnoreCase("R")  && !ch.equalsIgnoreCase("G") && !ch.equalsIgnoreCase("B") )
                return false;

            if(i < pattern.length() -1){

                if(ch.equalsIgnoreCase(pattern.substring(i + 1, i +2)))
                    return false;

            }

        }

        return true;

    }

}
