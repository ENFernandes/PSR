package org.academiadecodigo.bootcamp;

public class Players {
    private String name;
    public int wins;
    public Players (String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Weapom weapom()
    {
        return Weapom.generateWepon();
    }
    public void wins ()
    {
        this.wins++;
    }
    public int getWins() {
        return wins;
    }
}
