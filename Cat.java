package ru.geekbrains.hw;

/*
3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
 */
public class Cat extends Animal {

    private String colour;
    private int max_run = 200;
    private float max_jump = 2;

    public Cat(String name, int age, String colour) {
        super(name, age);
        this.colour = colour;
    }

    public void setMax_run() {
        max_run = 50 + (int)(Math.random()*400);
    }

    public int getMax_run() {
        return max_run;
    }

    public void setMax_jump() {
        max_jump = 0.5f + (float)(Math.random()*2);
    }

    public float getMax_jump() {
        return max_jump;
    }

    @Override
    public boolean swim(int distanse){
        System.out.println("Коты не умеют плавать! Животное не смогло проплыть."); return false;
    }

    @Override
    String info(){
         return("Кот " + super.info() + " цвета "+ colour + ":");
    }
}
