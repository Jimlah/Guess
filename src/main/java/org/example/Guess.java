package org.example;

import java.util.ArrayList;
import java.util.List;

public class Guess {
    
    ArrayList<Player> players;

    Integer number;
    
    Guess(Player ...players)
    {
        this.players = new ArrayList<>(List.of(players));
    }
    
    public void start(int round)
    {
        this.number = (new GuessFactory()).generate();

        for (int i = 0; i <round ; i++) {
            System.out.println("Round " + i + ":");
            this.perform();
        }
    }
    
    public void end()
    {
        System.out.println();
        System.out.println("Result:");
        for (Player player: this.players) {
            System.out.println(player);
        }
    }

    private boolean compare(int result)
    {
        return this.number == result;
    }

    private void perform()
    {
        for (Player player:this.players) {
            int result = player.play();
            String talk = "Lose";
            if(this.compare(result))
            {
                talk = "Wins";
                player.incrementScore();
            }
            this.announce(player, talk);
        }
    }

    protected void announce(Player player, String talk)
    {
        String announce = (player.name).concat(": ").concat(talk);
        System.out.println(announce);
    }
}
