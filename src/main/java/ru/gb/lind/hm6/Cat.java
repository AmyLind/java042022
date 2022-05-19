package ru.gb.lind.hm6;

public class Cat extends Animals {
    public Cat(String name) {
        super(name);
        this.limitRun = random.nextInt(50) + 150;
        this.limitJump = Math.random() * 1.5 + 0.5;
        this.animal = "Кот";
    }

    @Override
    public void swim(int dist) {
        System.out.println("Коты не любят плавать");
    }
}


