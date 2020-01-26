package ru.geekbrains.hw;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        satiety = p.decreaseFood(appetite);
    }

    public void info(){
        System.out.printf("Кот %s с аппетитом %d " + (satiety ? "наелся.%n" : "ещё голоден.%n"), name, appetite);
    }

    public int askFood(Plate p){
        if(!satiety)  return (appetite - p.getFood());
        return 0;
    }

}

