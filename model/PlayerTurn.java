package ru.geekbrains.lesson4hw.model;

import ru.geekbrains.lesson4hw.GameRun;
import ru.geekbrains.lesson4hw.view.TicTacToeField;

import java.util.Random;
import java.util.Scanner;

public class PlayerTurn {
    private int size;
    private int dots_to_win;
    private char dot_empty;
    private char dot_x;
    private char dot_o;
    private char[][] map;
    private Random rand = new Random();
    private Scanner scanner;

    public PlayerTurn(TicTacToeField ttt_field, char dot_x, char dot_o){
            this.size = ttt_field.getSize();
            this.dots_to_win = ttt_field.getDots_to_win();
            this.dot_empty = ttt_field.getDot_empty();
            this.dot_x = dot_x;
            this.dot_o = dot_o;
            this.map = GameRun.map;
            this.scanner = GameRun.scanner;
    }

    public void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(size);
            y = rand.nextInt(size);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = dot_o;
    }

    public void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = dot_x;
    }


    public boolean checkWin(char symb) {
        int count;
        for(int i = 0; i < size; i++){ //номер строки, в которой проверяем победу
            count = 0;
            for(int j = 0; j < size; j++){ //проход по символам в строке
                if(map[i][j] == symb) { count++; if(count == dots_to_win) return true; }
                else count = 0;
            }
        }
        //аналогично проход по столбцам
        for(int j = 0; j < size; j++){ //номер строки, в которой проверяем победу
            count = 0;
            for(int i = 0; i < size; i++){ //проход по символам в строке
                if(map[i][j] == symb) { count++; if(count == dots_to_win) return true; }
                else count = 0;
            }
        }
        //проверка диагоналей
        count = 0;
        for(int k = 0; k < size; k++){
            if(map[k][k] == symb) { count++; if(count == dots_to_win) return true; }
            else count = 0;
        }

        count = 0;
        for(int k = 0; k < size; k++){
            if(map[k][size-k-1] == symb) { count++; if(count == dots_to_win) return true; }
            else count = 0;
        }

        //проверка соседних диагоналей
        for(int l = 1; l <= (size - dots_to_win); l++) { //цикл для соседних с основной диагональю
            count = 0;
            for (int k = 0; k < (size - l); k++) { //проход по диагоналям выше основной
                if (map[k+l][k] == symb) { count++; if (count == dots_to_win) return true;}
                else count = 0;
            }

            count = 0;
            for (int k = 0; k < (size - l); k++) { //проход по диагоналям ниже основной
                if (map[k][k + l] == symb) { count++;
                if (count == dots_to_win) return true;}
                else count = 0;
            }
        }

        for(int l = 1; l <= (size - dots_to_win); l++) {//цикл для соседних с побочной диагональю
            count = 0;
            for (int k = 0; k < (size - l); k++) {//проход по диагоналям выше побочной
                if (map[k][size - (k+l)] == symb) { count++; if (count == dots_to_win) return true;}
                else count = 0;
            }

            count = 0;
            for (int k = 0; k < (size - l); k++) { //проход по диагоналям ниже побочной
                if (map[size - (k + l)][k] == symb) { count++; if (count == dots_to_win) return true;}
                else count = 0;
            }
        }
        return false;
    }

    public boolean isCellValid(int x, int y) {
        if (x < 0 || x >= size || y < 0 || y >= size) return false;
        if (map[y][x] == dot_empty) return true;
        return false;
    }


}
