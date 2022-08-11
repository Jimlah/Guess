package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Guess guess = new Guess(
                new RobotPlayer("Abdullahi"),
                new RobotPlayer("Abdurrahman")
        );

        guess.start(10);
        guess.end();

    }
}