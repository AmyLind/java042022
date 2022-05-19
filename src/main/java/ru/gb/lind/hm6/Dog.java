package ru.gb.lind.hm6;

public class Dog extends Animals    {


        public Dog(String name) {
            super(name);
            this.animal = "Собака";
            this.limitRun = random.nextInt(200) + 400;
            this.limitJump = Math.random() * 0.5 + 0.1;
            this.limitSwim = random.nextInt(6) + 5;
        }
    }
