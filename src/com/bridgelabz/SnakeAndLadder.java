package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadder {
    static final int noPlay = 0;
    static final int ladder = 1;
    static final int snake = 2;

    public static void main(String[] args) {
        int StartPosition = 0;
        System.out.println("Starting position :" + StartPosition);
        int die = (int) (Math.random() * 10 % 6 + 1);
        System.out.println("Roll the die to get a number is :" + die);
        int optCheck = (int) (Math.random() * 10 % 3);

        int nowYourPosition = 0;

        if (optCheck == ladder) {
            System.out.println("Ladder :");
            nowYourPosition = nowYourPosition + die;
        } else if (optCheck == snake) {
            System.out.println("Snake :");
            nowYourPosition = 0;
        } else {
            System.out.println("No play");
            nowYourPosition = nowYourPosition;
        }
        System.out.println("Now your Position is :" + nowYourPosition);


    }
}
