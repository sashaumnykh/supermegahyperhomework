package ru.spbu.apmath.hw1.task2;

public class Employee {
    public String name;
    public double wage;
    public int hours;

    public Employee(String name, double wage, int hours){
        this.name = name;
        this.wage = wage;
        this.hours = hours;
        /*System.out.println(name + " " + wage + " " + hours);*/
    }

    public double salary(){
        if (hours > 60 || wage < 70){
            throw new IllegalStateException("Жестоко");
            //return -1;
        }
        if (hours < 41 && wage >= 70){
            return wage * hours;
        }
        //if (hours > 40 && wage >= 70){
        else{
            return wage * 40 + (hours - 40) * 1.5 * wage;
        }
    }
}
