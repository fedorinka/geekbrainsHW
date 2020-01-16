package ru.geekbrains.lesson4hw.controller;

import ru.geekbrains.lesson4hw.model.PlayerTurn;
import ru.geekbrains.lesson4hw.view.TicTacToeField;

public class TicTacToePlay{
    private int size;
    private int dots_to_win;
    private char dot_empty;
    private char dot_x;
    private char dot_o;
    private TicTacToeField ttt_field;
    private PlayerTurn pturn;

    public TicTacToePlay(TicTacToeField ttt_field, char dot_x, char dot_o){
        this.size = ttt_field.getSize();
        this.dots_to_win = ttt_field.getDots_to_win();
        this.dot_empty = ttt_field.getDot_empty();
        this.dot_x = dot_x;
        this.dot_o = dot_o;
        this.ttt_field = ttt_field;
        this.pturn = new PlayerTurn(ttt_field, dot_x, dot_o);
    }

    public void tttPlay() {
        int turn_count = 0;
        while (true) {
            pturn.humanTurn();
            turn_count++;
            ttt_field.printMap();
            if (turn_count >= dots_to_win && pturn.checkWin(dot_x)) {
                System.out.println("Победил человек");
                break;
            }
            if (ttt_field.isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            pturn.aiTurn();
            ttt_field.printMap();
            if (turn_count >= dots_to_win && pturn.checkWin(dot_o)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (ttt_field.isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
    }

}
