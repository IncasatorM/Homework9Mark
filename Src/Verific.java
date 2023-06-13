import java.util.Random;

public class Verific {
    public static void main(String[]args ) {
        Random random = new Random();
        int pcNum = random.nextInt(10);
        int count = 0;
        for (int i = 0; i < 3; i++) {
            int tryNum = random.nextInt(10);
            if (pcNum == tryNum) {
                System.out.println("ви вгадали число " + pcNum);
                break;
            }
            count++;
        }

    }
}
