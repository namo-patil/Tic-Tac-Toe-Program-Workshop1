package com.bridgelabz;

public class TicTacToeGame {
    private static void board(){
        char [] arr = new char[10];
        for (int i = 1; i < 10; i++){
           arr[i] = ' ';
            System.out.println("array = "+arr);
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game");
        board();
    }
}
