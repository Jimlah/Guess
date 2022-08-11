package org.example;

import java.util.Random;

public class GuessFactory {

    public int generate() {
        return generate(9, 1);
    }

    /**
     */
    public int generate(int max, int min)
    {
        Random rand = new Random();
        return rand.nextInt((max-min)+1) + min;
    }
}
