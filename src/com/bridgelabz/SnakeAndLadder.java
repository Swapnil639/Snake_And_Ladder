package com.bridgelabz;

public class SnakeAndLadder {
    static int player1Position = 0;
    static int player2Position = 0;
    static final int NO_PLAY = 0;
    static final int LADDER = 1;
    static final int SNAKE = 2;
    static final int START_POSITION = 0;
    static final int WIN_POSITION = 100;

    public static void main(String[] args) {
        int count = 0;
        int playerChance=0;
        while (player1Position < WIN_POSITION && player2Position< WIN_POSITION ) {
            int die = (int) (Math.random() * (6) + 1);
            System.out.println("Roll The Die to Get a Number is = " + die);
            int optCheck = (int) (Math.random() * (3) + 1);
            ++count;
            if (playerChance % 2 == 0) {
                switch (optCheck) {
                    case NO_PLAY:
                        System.out.println("No Play");
                        break;
                    case LADDER:
                        if (player2Position + die <= WIN_POSITION)
                            player2Position = player2Position + die;
                        break;
                    case SNAKE:
                        player2Position = player2Position - die;
                        if (player2Position < START_POSITION)
                            player2Position = START_POSITION;
                        break;
                    default:
                        System.out.println("wrong option");

                }
                System.out.println("Position Player 2: " + player2Position);
                if (player2Position == WIN_POSITION)
                    System.out.println("Player 2 won the game!!");

            }
            else {
                switch (optCheck) {
                case NO_PLAY:
                    System.out.println("No Play");
                    break;
                case LADDER:
                    if (player1Position + die <= WIN_POSITION)
                        player1Position = player1Position + die;
                    break;
                case SNAKE:
                    if (player1Position - die < START_POSITION)
                        player1Position = 0;
                    else
                        player1Position = player1Position - die;
                    break;
                default:
                    System.out.println("wrong option");

            }
                System.out.println("Position Player 1: " + player1Position);
                if(player1Position == WIN_POSITION)
                    System.out.println("Player 1 won the game!!");
            }
            playerChance++;
        }
        
        System.out.println("Dice Count :"+count);



    }
}
