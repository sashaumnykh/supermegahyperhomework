package ru.spbu.apmath.hw1.task1;

public class Converter
{
    public final int number;

    public Converter(int number)
    {
        this.number = number;
    }

    public String toBin() {
        int decNumber = number;
        StringBuilder changeable = new StringBuilder();
        if (decNumber == 0) {
            changeable.append(0);
        } else {
            while (decNumber > 1) {
                if (decNumber % 2 == 1) {
                    changeable.append(1);
                } else {
                    changeable.append(0);
                }
                decNumber = decNumber / 2;
            }
            changeable.append(1);
        }


        return changeable.reverse().toString();
    }
        /*for (int i = (int)Math.floor(Math.log(decNumber)/Math.log(2)); i >= 0; i--)
        {
            int powOfTwo = (int)Math.pow(2, i);
            changeable.append(deNumber / powOfTwo);
            decNumber %= powOfTwo;
        }
        return changeable.length() > 0 ? changeable.toString() : "0";
    } */
}
/*public static class Converter {
    public String toBin(int x){
        String empty = "";
        if (x == 0){
            empty = 0 + empty;
        }
        else {
            while (x > 1) {
                if (x % 2 == 1) {
                    empty = 1 + empty;
                } else {
                    empty = 0 + empty;
                }
                x = x / 2;
            }
            empty = 1 + empty;
        }
    return empty;
    }
}
*/
