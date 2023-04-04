package com.bridgelabz;

public class SnakeAndLadder {
    static final int ladder = 1;
    static final int snake = 2;
    static final int WIN_POSITION = 100;

    static final int START_POSITION = 0;

    public static void main(String[] args) {
        int startPosition = 0;
        System.out.println("Starting position :" + startPosition);
        int nowYourPosition = 0;
        while (nowYourPosition < 100) {
            int die = (int) (Math.random() * (6) + 1);
            System.out.println("Roll The Die to Get a Number is = " + die);

            int optCheck = (int) (Math.random() * (3) + 1);
            switch (optCheck) {
                case ladder:
                    System.out.println("Ladder :");
                        if (nowYourPosition+die<=100)
                        nowYourPosition = nowYourPosition + die;
                    break;

                case snake:
                    System.out.println("Snake :");
                    nowYourPosition = nowYourPosition - die;
                    if (nowYourPosition < 0) {
                        nowYourPosition = 0;
                    }
                    break;

                default:
                    System.out.println("No play");
                    break;
            }
            System.out.println("Now your Position is :" + nowYourPosition);


        }
    }
}
