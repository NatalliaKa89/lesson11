import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        Random random = new Random();

        // random integer number
        //   for (int i = 0; i < 10; i++) {
        //      System.out.print(random.nextInt() + " ");
        // }

        //  int bound = 100;
        //for(int i = 0; i < 10; i++){
        //  System.out.print(random.nextInt(bound) + " ");
        //}

        int a = 10;
        int b = 20;
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(b - a + 1) + a + " ");
        }
    }
}