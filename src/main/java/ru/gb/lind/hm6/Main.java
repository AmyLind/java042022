package ru.gb.lind.hm6;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Барсик"),
                new Dog( "Полкан"),
                new Cat( "Пушок"),
                new Dog( "Шарик"),

                   };
        System.out.println("У нас " + Animal.getCount() + " животных");
        System.out.println("Из  них " + Cat.getCount() + " кошачьих ");
        final Random random = new Random();
        for (Animal animal: animals)    {
            animal.run(random.nextInt( 500));
            animal.swim(random.nextInt( 50));
        }

            

    }
}
