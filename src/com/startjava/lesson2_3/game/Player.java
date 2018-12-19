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


    public void setValu(int value, int tryCnt) {
        playersInput[tryCnt] = value;
    }

    //В другой версии этого метода:
    //1. Параметр 1: массив, в котором нужно изменить значение некоторых элементов;
    // 2. Параметр 2: индекс, начиная с которого нужно менять (в нашем случае 0); inclusive
    // 3. Параметр 3: индекс, до которого нужно менть (в нашем случае tryCnt); exclusive
    // 4. Параметр 4: значение, которым хотим заполнить каждый элемент диапазона

    public void setTryToZero() {
        Arrays.fill(playersInput, 0, tryCnt, 0);
        this.tryCnt = 0;
    }

    public void clear() {
        for (int i = 0; i < tryCnt; i++) {
            playersInput[i] = 0;
        }
    }


    public int[] getPlayersInput() {
        return Arrays.copyOf(playersInput, tryCnt);

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return this.name;
    }


    public int getValue() {
        return this.value;
    }

    public void newPlayersInput() {
        Arrays.fill(playersInput, 0);
    }
}

