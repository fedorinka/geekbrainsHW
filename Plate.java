package ru.geekbrains.hw;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if(food >= n) {food -= n; return true;}
        return false;
    }

    public void addFood(int somefood){
         food +=somefood;
         System.out.printf("В тарелку добавили %d еды.%n", somefood);
    }

    public void info() {
        System.out.printf("В тарелке %d еды.%n", food);
    }
}
