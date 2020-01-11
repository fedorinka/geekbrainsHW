package ru.geekbrains.homework3;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    public static void guessTheWord(Scanner scanner){

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int size = words.length;
        int wordnum = (int)(Math.random()*size);
        String word = words[wordnum];
        System.out.print("Угадайте слово из списка: ");
        printArray(words);
        while(true){
            int index[] = new int[15];
            System.out.println();
            System.out.println("Введите свой вариант: ");
            String inpword = scanner.next();
            if(wordsEqual(inpword, word, index)) {System.out.println("Вы угадали!"); break;}
            for(int i = 0; i < 15; i++){
                if(index[i] == 1) System.out.print(word.charAt(i));
                else System.out.print("#");
            }

        }

    }

    public static void printArray(String[] words){
        for(int i = 0; i < words.length; ++i){
            if(i % 9 == 0) System.out.println();
            System.out.print(words[i] + ", ");
        }
    }

    public static boolean wordsEqual(String inword, String word, int[] mass){
        int size1 = inword.length();
        int size2 = word.length();
        boolean result = true;
        if(size1 != size2) result = false;
        for(int i = 0; i < size1 && i < size2; i++){
            if(word.charAt(i) == inword.charAt(i)) mass[i] = 1;
            else result = false;
        }
        return result;
    }


}
