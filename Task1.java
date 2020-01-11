package ru.geekbrains.homework3;

import java.util.Scanner;

public class Task1 {

    public static void guessTheNumber(Scanner scanner){

        int play = 1;
        int guess = 0;
        int num = 0;
        do {
            System.out.println("Угадайте число от 0 до 9 за три попытки!");
                num = (int) (Math.random() * 10);
                for(int i = 0; i < 3; i++){
                    System.out.println("Попытка " + (i+1) + ":");
                    guess = scanner.nextInt();
                    if(guess > num) System.out.println("Загаданное число меньше.");
                    else if(guess < num) System.out.println("Загаданное число больше.");
                    else {System.out.println("Вы угадали!"); break;}
                }
                if(guess != num) System.out.println("Вы проиграли! Было загадано число " + num + ".");
            System.out.println("Хотите сыграть ещё раз? 0 - нет, 1 - да.");
            play = scanner.nextInt();
        } while ( play > 0 );

    }

}
