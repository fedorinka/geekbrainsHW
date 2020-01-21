package ru.geekbrains.hw;

public class Dog extends Animal{
    private double weight;
    private int max_run = 500;
    private float max_jump = 0.5f;
    private int max_swim= 10;

    public Dog(String name, int age, double weight) {
        super(name, age);
        this.weight  = weight;
    }

    public void setMax_run() {
        max_run = 100 + (int)(Math.random()*500);
    }

    public int getMax_run() {
        return max_run;
    }

    public void setMax_jump() {
        max_jump = (float)(Math.random()*2);
    }

    public float getMax_jump() {
        return max_jump;
    }

    public void setMax_swim() {
        max_swim = (int)(Math.random()*10);
    }

    public int getMax_swim() {
        return max_swim;
    }

    @Override
    String info(){
        return("Пес " + super.info() + " весом "+ String.format("%3.1f", weight));
    }
}

