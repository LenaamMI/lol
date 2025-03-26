package org.example;

public class  App {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Hello Lena!");

        //Задание 2
        Tester tester1 = new Tester("Паша", "Павлов", 22, 5, 500);
        Tester tester2 = new Tester("Алиса", "Горибоедова", 311, 9);
        Tester tester3 = new Tester("Саша", "Попов", 15);
        tester1.vivod();
        tester2.vivod("Информация о Tester:");
        tester3.vivod("Информация о Tester:", true);
        Tester.vvivod();
    }

}
