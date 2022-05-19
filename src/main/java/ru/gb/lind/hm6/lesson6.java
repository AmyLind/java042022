package ru.gb.lind.hm6;

public class lesson6 {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Маркиз");
        Cat cat2 = new Cat("Пушок");

        Dog dog1 = new Dog("Шарик");
        Dog dog2 = new Dog("Бобик");

        System.out.println("Коты:");
        cat1.animalInfo();
        cat2.animalInfo();
        System.out.println();

        System.out.println("Собаки");
        dog1.animalInfo();
        dog2.animalInfo();

        System.out.println();

        System.out.println("Первая собака");
        dog1.run(400);
        dog1.swim(5);
        dog1.jump(0.9);
        System.out.println();

        System.out.println("Вторая собака:");
        dog2.run(550);
        dog2.swim(11);
        dog2.jump(0.5);
        System.out.println();

        System.out.println("Первый кот:");
        cat1.run(150);
        cat1.swim(10);
        cat1.jump(1.5);
        System.out.println();

        System.out.println("Второй кот");
        cat2.run(250);
        cat2.swim(0);
        cat2.jump(1);
    }


}