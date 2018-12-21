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

    //В другой версии этого метода:
    //1. Параметр 1: массив, в котором нужно изменить значение некоторых элементов;
    // 2. Параметр 2: индекс, начиная с которого нужно менять (в нашем случае 0); inclusive
    // 3. Параметр 3: индекс, до которого нужно менть (в нашем случае tryCnt); exclusive
    // 4. Параметр 4: значение, которым хотим заполнить каждый элемент диапазона

    public void setTryToZero() {
        Arrays.fill(playersInput, 0, tryCnt, 0);
        tryCnt = 0;
    }

    public int[] getPlayerInput() {
        int[] copy = Arrays.copyOf(playersInput, tryCnt);
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

