package ru.geekbrains.hw;

/*
1. Создать классы Собака и Кот с наследованием от класса Животное.
2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве параметра каждому методу передается величина,
означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль. (Например, dog1.run(150); -> результат: run: true)
5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.
*/

public class Main {

    public static void main(String[] args) {
        int run_distance = 350;
        int swim_distance = 5;
        float jump_hight = 1.3f;

        Cat[] cats = new Cat[3];

        cats[0] = new Cat("Барсик", 2, "белый");
        cats[1] = new Cat("Пушок", 1, "черный");
        cats[2] = new Cat("Мурзик", 3, "серый");

        for(Cat cat : cats){
            cat.setMax_run();
            cat.setMax_jump();

            System.out.println(cat.info());
            cat.run(run_distance, cat.getMax_run());
            cat.swim(swim_distance);
            cat.jump(jump_hight, cat.getMax_jump());

            System.out.println();
        }

        Dog[] dogs = new Dog[2];

        dogs[0] = new Dog("Шарик", 4, 31.2f);
        dogs[1] = new Dog("Бобик", 3, 11.8f);

        for(Dog dog : dogs){
            dog.setMax_run();
            dog.setMax_jump();
            dog.setMax_swim();

            System.out.println(dog.info());
            dog.run(run_distance, dog.getMax_run());
            dog.swim(swim_distance, dog.getMax_swim());
            dog.jump(jump_hight, dog.getMax_jump());

            System.out.println();
        }

    }
}
