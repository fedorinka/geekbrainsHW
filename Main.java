package ru.geekbrains.homework3;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Task1 task1 = new Task1();
        task1.guessTheNumber(scanner);
        Task2 task2 = new Task2();
        task2.guessTheWord(scanner);
        scanner.close();

    }
}
