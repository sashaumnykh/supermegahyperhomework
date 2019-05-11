package ru.spbu.apmath.hw2.task2;

public class Logic {
    public static int getSum() {
        int sum = 0;
        for (int i=1; i< 1001; i++){
            String strNumber = Converter.toString(i);
            for (int j = 0; j < strNumber.length(); j++){
                if (strNumber.charAt(j) != ' '){
                    sum++;
                }
            }
        }
        return sum;
    }
}
