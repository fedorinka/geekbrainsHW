package ru.geekbrains.lesson4hw;

import ru.geekbrains.lesson4hw.controller.TicTacToePlay;
import ru.geekbrains.lesson4hw.view.TicTacToeField;

import java.util.Random;
import java.util.Scanner;


public class GameRun {

    public static Scanner scanner = new Scanner(System.in);
    public static int SIZE = 5;
    public static int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;

    public static void main(String[] args) {

        TicTacToeField ttt_field = new TicTacToeField(SIZE, DOTS_TO_WIN, map, DOT_EMPTY); //класс для создания и рисования игрового поля
        TicTacToePlay ttt_play = new TicTacToePlay(ttt_field, DOT_X, DOT_O); // класс-контроллер для реализации логики игры
        ttt_play.tttPlay(); //метод, реализующий логику игры
        System.out.println("Игра закончена");
        scanner.close();
    }

}


