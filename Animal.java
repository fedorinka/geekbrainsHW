package ru.geekbrains.hw;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*
    Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве параметра каждому методу передается величина,
    означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
     */

    public boolean run(int distans){
        System.out.println("Животное пробежало " + distans + " метров.");
        return true;
    }

    public boolean run(int distanse, int max_run){
        if(distanse <= max_run && distanse > 0) {run(distanse); return true;}
        else {System.out.println("Животное не смогло пробежать " + distanse + " метров. Может пробежать не больше " + max_run + " м."); return false;}
    }

    public boolean swim(int distans){
        System.out.println("Животное проплыло " + distans + " метров.");
        return true;
    }

    public boolean swim(int distanse, int max_swim){
        if(distanse <= max_swim && distanse > 0) {swim(distanse); return true;}
        else {System.out.println("Животное не смогло проплыть " + distanse + " метров. Может проплыть не больше " + max_swim + " м."); return false;}
    }

    public boolean jump(float hight){
        System.out.println("Животное подпрыгнуло на " + hight + " метров.");
        return true;
    }

    public boolean jump(float hight, float max_jump){
        if(hight <= max_jump && hight > 0) {jump(hight); return true;}
        else {System.out.println("Животное не смогло прыгнуть на " + hight + " метров. Может подпрыгнуть не выше " + String.format("%1.1f", max_jump) + " м."); return false;}
    }

    String info(){
          return(name + ", " + age + " лет,");
    }
}
