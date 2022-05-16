package ru.gb.lind.hm5;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee( fio:"fio1 ", position: "p1", email: "e1", phone: "phone1", salary: 1, age: 1),
                new Employee( fio:"fio2 ", position: "p2", email: "e2", phone: "phone2", salary: 2, age: 11),
                new Employee( fio:"fio3 ", position: "p3", email: "e3", phone: "phone3", salary: 3, age: 41),
                new Employee( fio:"fio4 ", position: "p4", email: "e4", phone: "phone4", salary: 4, age: 51),
                new Employee( fio:"fio5 ", position: "p5", email: "e5", phone: "phone5", salary: 5, age: 22)

        };
         for (Employee employee : employees) {
             if (employee.getAge() >  40 ) {
                 employee.print();

             }
         }


    }
}
