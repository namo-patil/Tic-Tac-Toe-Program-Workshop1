package com.bridgelabz;

import java.util.Scanner;

public class TicTacToeGame {
    private static void board() {
        char[] arr = new char[10];
        for (int i = 1; i < 10; i++) {
            arr[i] = ' ';
            System.out.println("array = " + arr);
        }
    }

    private static void inputLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter letter 'x' or 'o' as a input");
        char input = scanner.next().charAt(0);
        if (input == 'x') {
            System.out.println("The input value is : " + input);
        } else if (input == 'o') {
            System.out.println("The input value is : " + input);
        } else {
            System.out.println("Enter only 'x' or 'o'");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game");
        board();
        inputLetter();
    }
}
