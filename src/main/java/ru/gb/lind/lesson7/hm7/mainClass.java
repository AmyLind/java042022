package ru.gb.lind.lesson7.hm7;
import java.util.Scanner;

public class mainClass {
    public static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {

            int action;
            Cat[] cats = new Cat[4];
            cats[0] = new Cat("Пушок", 5, false);
            cats[1] = new Cat("Мурзик", 10, false);
            cats[2] = new Cat("Маркиз", 15, false);
            cats[3] = new Cat("Барсик", 20,false);

            Plate plate = new Plate(100);
            plate.info();
            for (int i = 0; i < cats.length; i++) {
                if (cats[i].fullness == false && cats[i].appetite < plate.food){
                    cats[i].eat(plate);
                    cats[i].fullness = true;
                    System.out.println("Кот " + cats[i].name + " поел!");
                } else {
                    System.out.println("Котик " + cats[i].name + " не поел!");
                }
            }
            plate.info();
            System.out.println("Сколько еды добавить в миску?");
            action = sc.nextInt();
            plate.increaseFood(action);
            plate.info();

        }
}
