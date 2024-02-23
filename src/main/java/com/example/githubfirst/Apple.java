package com.example.githubfirst;

public class Apple {
    int size;
    String colour;


    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    Apple(int size, String colour) {
        this.size = size;
        this.colour = colour;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}

