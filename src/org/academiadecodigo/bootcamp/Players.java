package org.academiadecodigo.bootcamp;
import java.util.Random;

public class Players {
    public enum Wepons {
        SCISSOR,//0
        PAPER,//1
        ROCK,//2
    }
    public Wepons wepon;
    public String name;

    public Players (String name)
    {
        this.name = name;
        this.wepon = generateWepon();
    }

    public static Wepons generateWepon() {
        Wepons[] values = Wepons.values();
        int length = values.length;
        int randIndex = new Random().nextInt(length);
        return values[randIndex];
    }

}
