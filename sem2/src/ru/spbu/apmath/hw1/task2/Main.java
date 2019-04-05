package ru.spbu.apmath.hw1.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Введите количество сотрудников.");
        Scanner scanner = new Scanner(System.in);
        String howMany = scanner.nextLine();
        int number = Integer.parseInt(howMany);
        Employee[] employee = new Employee[number];
        for (int i = 0; i < number; i++){
            System.out.println("Введите имя, ставку и количество часов через пробел.");
            Scanner input = new Scanner (System.in);
            String[] data = input.nextLine().split(" ");
            employee[i] = new Employee(data[0], Double.parseDouble(data[1]), Integer.parseInt(data[2]));
        }
        //System.out.println("Имя_сотрудника Ставка Кличество_часов Зарплата");
        for (int j = 0; j < number; j++){
            String totalSalary = new String();
            try {
                totalSalary = Double.toString(employee[j].salary());
            }
            catch (IllegalStateException ex) {
                totalSalary = "ОШИБКА";
            }
            /*totalSalary = Double.toString(employee[j].salary());
            if (totalSalary.equals("-1.0")){
                   // totalSalary == "-1.0"){
                totalSalary = "ОШИБКА";
            }*/
            System.out.println(employee[j].name + " " + employee[j].wage + " " + employee[j].hours + " " + totalSalary);
        }

    }

}
