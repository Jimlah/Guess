package org.example;

public class RobotPlayer extends Player {

    RobotPlayer(String name){
        this.name = (new String("Robot ")).concat(name);
    }

    @Override
    public int play() {
        return (new GuessFactory()).generate();
    }
}
