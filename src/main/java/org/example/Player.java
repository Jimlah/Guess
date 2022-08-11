package org.example;

import java.util.HashMap;
import java.util.Map;

public abstract class   Player {

    int score = 0;

    String name = null;

    public Map<String, String> getData()
    {
        Map<String, String> data = new HashMap<>();
        data.put("score", String.valueOf(this.score));
        data.put("name", this.name);
        return data;
    }

    public void incrementScore()
    {
        this.score++;
    }

    public void reset()
    {
        this.score = 0;
    }

    public String toString(){
       return (new String(""))
               .concat("Name: ")
               .concat(this.name)
               .concat(System.lineSeparator())
               .concat("Score: ")
               .concat(String.valueOf(this.score))
               .concat(System.lineSeparator());
    }

    abstract public int play();
}
