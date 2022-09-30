public class C_StringOfWaltSavitch {

    public static void main(String[] args) {

        String first = "cTun"; // "walt"
        String second = "kKoza"; // "savitch"

        String letterOfFirst = first.substring(1,2);
        String letterOfSecond = second.substring(1,2);

        System.out.println(letterOfFirst.toUpperCase() + first.substring(2,first.length()) + first.substring(0,1) + "ay" + " "
                         + letterOfSecond.toUpperCase() + second.substring(2,second.length()) + second.substring(0, 1) + "ay" );
    }
}
