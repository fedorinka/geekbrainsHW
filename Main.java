package ru.geekbrains.hw;

public class Main{

    public static void main(String[] args) {
        MyWindow myWindow = new MyWindow(); // создаём объект-окно
        MyWindow myWindow2 = new MyWindow("Пример окна с текстовым полем.");
        MyWindow myWindow3 = new MyWindow(new String[]{"Окно с многострочным текстовым полем и скролом.", "Строка 1 для окна", "Строка 2"});
        ClicableWindow clicableWindow = new ClicableWindow();
    }

}