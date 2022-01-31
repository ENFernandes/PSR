package org.academiadecodigo.bootcamp;

public class Game {
    Players w1 = new Players("Relde ");
    Players w2 = new Players("HD74 ");

    public Game() {
        System.out.println(w1.getName() + "vs " + w2.getName() +"\n");
        for (int i = 0; i < 3; i++) {
            String resp = w1.weapom() + " vs " + w2.weapom();
            System.out.println(resp);
            switch (resp) {
                case "SCISSOR vs PAPER":
                    w1.wins();
                    break;
                case "PAPER vs SCISSOR":
                    w2.wins();
                    break;
                case "PAPER vs ROCK":
                    w1.wins();
                    break;
                case "ROCK vs PAPER":
                    w2.wins();
                    break;
                case "ROCK vs SCISSOR":
                    w1.wins();
                    break;
                case "SCISSOR vs ROCK":
                    w2.wins();
                    break;
                default:
                    break;
            }
        }
        if (w1.getWins()< w2.getWins()){
            System.out.println("\nO "+w2.getName()+" Ganhou");
        }
        else if (w1.getWins()>w2.getWins())
        {
            System.out.println("\nO "+w1.getName()+" Ganhou");
        }
        else {
            System.out.println("\nCada um paga o seu");
        }
    }

}
