package org.example;

public class Tester {
    public String name;
    public String surname;
    public int expirienceInYears;
    public int englishLevel;
    public int salary;
    public Tester(String name, String surname, int expirienceInYears, int englishLevel, int salary){
        this.name=name;
        this.surname=surname;
        this.expirienceInYears=expirienceInYears;
        this.englishLevel=englishLevel;
        this.salary=salary;
    }
    public Tester(String name, String surname, int expirienceInYears, int englishLevel){
        this(name, surname, expirienceInYears, englishLevel, 0);
    }
    public Tester(String name, String surname, int expirienceInYears){
        this(name, surname, expirienceInYears, 0 , 0);
    }
    public void vivod() {
        System.out.println("Имя: " + name + ", Фамилия: " + surname);
    }
    public void vv(){
        expirienceInYears=englishLevel*englishLevel;
        System.out.println(expirienceInYears);
    }
    public void vivod(String message) {
        System.out.println(message + " Имя: " + name + ", Фамилия: " + surname+", Опят в годах: "+expirienceInYears);
    }

    public void vivod(String o, boolean ss) {
        if (ss) {
            System.out.println(o + " Имя: " + name + ", Фамилия: " + surname + ", Зарплата: " + salary);
        } else {
            System.out.println(o + " Имя: " + name + ", Фамилия: " + surname);
        }
    }
    public static void vvivod() {
        System.out.println("Привет я Tester!");
    }

}

