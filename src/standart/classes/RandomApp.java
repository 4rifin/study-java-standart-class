package standart.classes;

import java.util.Random;

public class RandomApp {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 1000; i++) {
            int x = rand.nextInt(1000);
            System.out.println(x);        }
    }
}
