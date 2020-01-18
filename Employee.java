package ru.geekbrains.hw;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Employee(String name, String position, String email, String phone, double salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void employeeInfo(){
        System.out.printf("Сотрудник %1$-20s на должности %2$-20s email: %3$-12s,%n", name, position, email);
        System.out.printf("номер телефона: %1$-12s, зарплата %2$-8.2f рублей, возраст %3$-3d %n", phone, salary, age);
    }

    public int getAge(){
        return this.age;
    }

}
