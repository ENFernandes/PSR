package org.academiadecodigo.bootcamp;
import java.util.Random;
public enum Weapom {
    SCISSOR,//0
    PAPER,//1
    ROCK;//2

    public static Weapom generateWepon() {
        Weapom[] values = Weapom.values();
        int length = values.length;
        int randIndex = new Random().nextInt(length);
        return values[randIndex];
    }
}


