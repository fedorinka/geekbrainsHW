package ru.geekbrains.hw;

public class ApplicationRun {

    public static void main(String[] args) {
        int size = 7;
        int print_age = 40;
        Employee[] employees = new Employee[size];
        employees[0] = new Employee("Иванов Иван", "директор", "ivanov@mail.ru", "+79101111111", 150000, 46);
        employees[1] = new Employee("Петров Петр", "заместитель директора", "petrov@mail.ru", "+79102222222", 130000, 40);
        employees[2] = new Employee("Сидоров Сидор", "бухгалтер", "sidorov@mail.ru", "+79103333333", 120000, 41);
        employees[3] = new Employee("Раб Михаил", "аналитик", "rab@mail.ru", "+79104444444", 100000, 39);
        employees[4] = new Employee("Скороход Марк", "курьер", "skorohod@mail.ru", "+79105555555", 50000, 27);

        for(int i = 0; i < size; i ++){
            Employee current = employees[i];
            if(current == null) { System.out.printf("Больше сотрудников старше %d лет нет!", print_age); break;}
            if(current.getAge() > print_age) current.employeeInfo();
        }

    }
}
