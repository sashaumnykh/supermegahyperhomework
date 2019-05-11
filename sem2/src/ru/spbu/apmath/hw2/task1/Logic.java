package ru.spbu.apmath.hw2.task1;

public class Logic {
    public static int toRealSale(String varSale, int sale) {
        int realSale = 0;
        while (sale > 9){
            for (int i = 0; i < varSale.length(); i++){
                String symbol = Character.toString(varSale.charAt(i));
                realSale += Integer.parseInt(symbol);
            }
            sale = realSale;
            varSale = Integer.toString(sale);
            realSale = 0;
        }
        return sale;
    }
}
