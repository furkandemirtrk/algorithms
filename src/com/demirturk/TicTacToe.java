package com.demirturk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TicTacToe {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        int[][] map = {
                {0,0,0},
                {0,0,0},
                {0,0,0}
        };
        int player = 2;
        int gameOrder = 1;
        while (gameOver(map, gameOrder)){
            System.out.print("Player" + player + " Entry: ");
            double readEntry = Integer.parseInt(reader.readLine());
            if (!entryCheck(map, readEntry))
                continue;

            map[firstColumn(readEntry)][secondColumn(readEntry)] = player;

            player = changePlayer(player);
            gameOrder++;
            printMap(map);
        }
        printMap(map);
    }

    public static boolean entryCheck(int[][] map, double entry){
        if (entry < 1 || entry > 9){
            System.out.println("You must enter numbers between 1 and 9");
            return false;
        }
        if (map[firstColumn(entry)][secondColumn(entry)] != 0){
            System.out.println("this field is marked");
            return false;
        }
        return true;
    }

    public static  int secondColumn(double entry){
        return entry % 3 == 0 ? 2 : entry % 3 == 1 ? 0 : 1;
    }
    public static  int firstColumn(double entry){
        return entry % 3 == 0 ? (int) ((entry / 3) - 1) : (int) entry / 3;

    }
    public static  int changePlayer(int player){
        return player == 1 ? 2 : 1;
    }

    public static boolean gameOver(int[][] map, int order){
        if (order <=5)
            return true;

        for (int i=0; i < 3; i++){
            //Column Check
            if (map[i][0] !=0 && map[i][0] == map[i][1] && map[i][1] == map[i][2]){
                System.out.println("Winner Player"+ map[i][0]);
                return false;
            }
            //Row Check
            if (map[i][0] !=0 && map[0][i] == map[1][i] && map[1][i] == map[2][i]){
                System.out.println("Winner Player"+ map[0][i]);
                return false;
            }
        }

        //Diagonal Check
        if (map[0][0] == map[1][1] && map[1][1] == map[2][2]){
            System.out.println("Winner Player"+ map[0][0]);
            return false;
        }
        if (map[0][2] == map[1][1] && map[1][1] == map[2][0]){
            System.out.println("Winner Player"+ map[0][2]);
            return false;
        }

        if (order == 10){
            System.out.println("Game ended in draw ");
            return false;
        }
        return true;
    }

    private static void printMap(int[][] map) {
        for (int i=0; i < 3; i++){
            for (int j=0; j < 3; j++){
                System.out.print(map[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
