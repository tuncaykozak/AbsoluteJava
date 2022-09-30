public class G_TakeYourTime {

    public static void main(String[] args) {

        int myTime = 31313; // 50391

        int hour = myTime / 3600;
        int minute = (myTime % 3600) / 60;
        int second = (myTime % 3600) % 60;

        System.out.printf("%02d:%02d:%02d", hour,minute,second); // 13:59:51

    }
}
