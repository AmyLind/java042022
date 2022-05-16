package ru.gb.lind.hm5;

public class Employee {
    private String fio;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;


    public Employee() {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void print() {
        System.out.println("fio: " + fio + ", " +
                "position: " + position + ", " +
                "email: " + email + ", " +
                "phone: " + phone + ", " +
                "salary: " + salary + ", " +
                "age: " + age);
    }

    public int getAge() {
        return age;
    }
}

