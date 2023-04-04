package com.bridgelabz;

public class SnakeAndLadder {
    static final int NO_PLAY = 0;
    static final int LADDER = 1;
    static final int SNAKE = 2;
    static final int START_POSITION = 0;
    static final int WIN_POSITION = 100;

    public static void main(String[] args) {
        int playerPosition = 0;
        int count = 0;
        while (playerPosition < WIN_POSITION) {
            int die = (int) (Math.random() * (6) + 1);
            System.out.println("Roll The Die to Get a Number is = " + die);
            int optCheck = (int) (Math.random() * (3) + 1);
            ++count;
            switch (optCheck) {
                case NO_PLAY:
                    System.out.println("No play");
                    break;
                case LADDER:
                    if (playerPosition + die <= WIN_POSITION)
                        playerPosition = playerPosition + die;
                    break;

                case SNAKE:
                    playerPosition = playerPosition - die;
                    if (playerPosition < START_POSITION) {
                        playerPosition = 0;
                    }
                    break;

                default:
                    System.out.println("wrong option");

            }
            System.out.println("Now your Position is :" + playerPosition + " Number of Time Dice are Played " + count);


        }
        System.out.println("You have Win The Game");
    }
}
