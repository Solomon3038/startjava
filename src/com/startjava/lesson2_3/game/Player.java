package com.startjava.lesson2_3.game;


import java.util.Arrays;

public class Player {
    private String name;
    private int value;
    private int[] playersInput;
    private int tryCnt;

    public Player(String name, int tryCnt) {
        this.name = name;
        playersInput = new int[tryCnt];
    }

    public void setPlayersInput(int value, int tryCnt) {
        playersInput[tryCnt] = value;
        this.value = value;
        this.tryCnt++;
    }

    public void setTryToZero() {
        Arrays.fill(playersInput, 0, tryCnt, 0);
        tryCnt = 0;
    }

    public int[] getPlayerInput() {
        int[] copy=Arrays.copyOf(playersInput, tryCnt);
        for (int i = 0; i < copy.length; i++)
            System.out.print(copy[i] + " ");
        return playersInput;

    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }


    public int getValue() {
        return value;
    }
}

