package ru.spbu.apmath.hw1.task1;

import java.util.Scanner;

// Большое спасибо Паше Менчукову, который помог мне разобраться во многих вещах!!
// Некоторые вещи, как можно заметить, были позаимствованы, но при этом изучены (честно-честно!)

public class Main {
    public static void main(String[] args){
        System.out.println("Введите число: ");
        Scanner input = new Scanner (System.in);
        String decNumber = input.nextLine();
        int decNum = Integer.parseInt(decNumber);
        Converter binNum = new Converter(decNum);
        // String binNum = Converter.toBin(decNum);
        System.out.println(binNum.toBin());
    }
}
