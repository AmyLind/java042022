package ru.gb.lind.lesson7.hm7;

public class Plate {
    public int food;


    public Plate(int food) {
        this.food = food;

    }
    public void decreaseFood(int n) {
        food -= n;
    }

    public void increaseFood(int x) {
        food +=x;

    }
    public void info() {
        System.out.println("Еда: " + food);
    }

}

