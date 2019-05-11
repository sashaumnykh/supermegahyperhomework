package ru.spbu.apmath.hw2.task1;

import java.util.Scanner;

import static ru.spbu.apmath.hw2.task1.Logic.toRealSale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите размер скидки:");
        Scanner scanner = new Scanner(System.in);
        String varSale = scanner.nextLine();
        int sale = Integer.parseInt(varSale);
        if (sale > 9){
            sale = toRealSale(varSale, sale);
        }
        System.out.println(sale);
    }
}
