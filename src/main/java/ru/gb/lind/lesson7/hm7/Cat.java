package ru.gb.lind.lesson7.hm7;

public class Cat {
    public String name; // имя кошака
    public int appetite; // аппетит кота
    public boolean fullness; // степень заполненности кота

    public Cat(String name, int appetite, boolean fullness) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }

    }


