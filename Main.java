package ru.geekbrains.hw;

/*
1. Расширить задачу про котов и тарелки с едой
2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды,
а кот пытается покушать 15-20)
3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
        Если коту удалось покушать (хватило еды), сытость = true
4. Считаем, что если коту мало еды в тарелке, то он ее просто не трогает, то есть не может быть наполовину сыт
        (это сделано для упрощения логики программы)
5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль
6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку
 */

import java.util.Random;

public class Main {

    public static final int SIZE = 5;
    public static final int FOOD = 80;
    public static Random rand = new Random();


    public static void main(String[] args) {
        Cat[] cats = new Cat[SIZE];
        Plate plate = new Plate(FOOD);
        plate.info();
        for (int i = 0; i < cats.length; i++) {
            Cat cat = cats[i] = new Cat("кот" + (i + 1), rand.nextInt(50));
            cat.eat(plate);
            cat.info();
        }
        plate.info();

        for (int i = 0; i < cats.length; i++) {
            Cat cat = cats[i];
            int needfood = cat.askFood(plate);
            if(needfood > 0) {
                plate.addFood(needfood);
                cat.eat(plate);
                cat.info();
            }
        }
    }

}