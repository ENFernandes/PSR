package org.academiadecodigo.bootcamp;

public class Game {
    /*Players.wepon p1 = Players.generateWepon();
    Players.wepon p2 = Players.generateWepon();*/
    Players w1 = new Players("Relde");
    Players w2 = new Players("Carol");

    public Game() {
            System.out.println(w1.name + ": " + w1.wepon + " vs " + " " + w2.name + ": " + w2.wepon);
            switch (w1.wepon + " vs " + w2.wepon) {
                case "SCISSOR vs PAPER":
                    System.out.println(w1.name + " Win");
                    break;
                case "PAPER vs SCISSOR":
                    System.out.println(w2.name + " Win");
                    break;
                case "PAPER vs ROCK":
                    System.out.println(w1.name + " Win");
                    break;
                case "ROCK vs PAPER":
                    System.out.println(w2.name + " Win");
                    break;
                case "ROCK vs SCISSOR":
                    System.out.println(w1.name + " Win");
                    break;
                case "SCISSOR vs ROCK":
                    System.out.println(w2 + "Win");
                    break;
                default:
                    System.out.println("drawn");
                    break;
        }
    }
}
