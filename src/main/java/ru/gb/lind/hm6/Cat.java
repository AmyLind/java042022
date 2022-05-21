package ru.gb.lind.hm6;

public class Cat extends Animal {

    private static final int RUN_LIMIT = 200;
    private static final int SWIM_LIMIT = 0;
    private static int count;


    public Cat(String name) {
        super(name, RUN_LIMIT, SWIM_LIMIT);
        count++;

    }



    @Override
    public void swim(int length) {
        System.out.println("Кот умеет плавать, но не хочет!");
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {

        return "Кот по имени " + getName();

    }
}

