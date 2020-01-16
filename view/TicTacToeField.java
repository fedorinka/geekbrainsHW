package ru.geekbrains.lesson4hw.view;


import ru.geekbrains.lesson4hw.GameRun;

public class TicTacToeField {

    private int size;
    private int dots_to_win;
    private char[][] map;
    private char dot_empty;

    public TicTacToeField(int size, int dots_to_win, char[][] map, char dot_empty){ //конструктор
        this.size = size;
        this.dots_to_win = dots_to_win;
        this.dot_empty = dot_empty;
        GameRun.map = this.map = initMap(size, dots_to_win, map, dot_empty);
    }

    public int getSize(){
        return this.size;
    }

    public int getDots_to_win(){
        return this.dots_to_win;
    }

    public char getDot_empty(){
        return this.dot_empty;
    }


    public char[][] initMap(int size, int dots_to_win, char[][] map, char dot_empty) {
        map = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j] = dot_empty;
            }
        }
        return map;
    }

    public void printMap() {
        for (int i = 0; i <= size; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < size; j++) {
                System.out.print(map[i][j] + " ");
            }            System.out.println();
        }        System.out.println();
    }

    public boolean isMapFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[i][j] == dot_empty) return false;
            }
        }
        return true;
    }
}
