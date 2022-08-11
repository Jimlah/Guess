package org.example;

import java.util.Scanner;

public class HumanPlayer extends Player{
    HumanPlayer(String name){
        this.name = ("Human ").concat(name);
    }

    @Override
    public int play() {
        return this.takeIn();
    }

    public int takeIn()
    {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter value between 1 - 9:");
        return Integer.parseInt(value.nextLine());
    }
}
