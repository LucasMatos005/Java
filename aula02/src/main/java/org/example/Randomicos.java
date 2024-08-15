package org.example;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Randomicos {
    public static void main(String[] args) {
        // No JS
        // Math.random() * 10
        Random num = new Random();

        // limita somente o máximo
        num.nextInt(100);
        System.out.println(num.nextInt(100));

        // sorteia qlqr um
        num.nextInt();
        System.out.println(num.nextInt());

        //sorteia do 0 ao 19
        num.nextInt(0,20);
        System.out.println(num.nextInt(20));

        // Com double
        System.out.println(num.nextDouble(5.11, 5.99));

        Integer i = ThreadLocalRandom.current().nextInt(0,20);
        System.out.println(i);

        Double d = ThreadLocalRandom.current().nextDouble(0.1,0.9);
        System.out.println(d);
    }
}
