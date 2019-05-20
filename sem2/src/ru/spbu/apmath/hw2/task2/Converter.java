package ru.spbu.apmath.hw2.task2;

// изначально скопипастила код из интернета;
// он был ооочень некрасивый, поэтому решила написать сама;
// но у меня ничего не работала, обратилась к Косте Когану;
// оказалось, что у нас были схожие подходы;
// посмотрела его код, что-то добавила к себе;
// в итоге вы можете видеть это:

public class Converter {
    static String[] units = {"", "один", "два", "три", "четыре", "пять", "шесть",
            "семь", "восемь", "девять"};
    static String[] secDecade = {"десять", "одиннадцать", "двенадцать", "тринадцать",
            "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
    static String[] tens = {"", "десять","двадцать","тридцать","сорок","пятьдесят","шестьдесят",
            "семьдесят","восемьдесят","девяносто"};
    static String[] hundreeds = {"", "сто", "двести", "триста", "четыреста", "пятьсот",
            "шестьсот", "семьсот", "восемьсот", "девятьсот"};

    public static String toString (int number){
        String strNum = Integer.toString(number);
        int k = strNum.length();
        if (number == 1000){
            return "тысяча";
        }
        else {
            if ((number % 100) > 19) {
                return hundreeds[number / 100] + " " + tens[(number / 10) % 10] + " " + units[number % 10];
            } else if (number % 100 <= 19 && number % 100 >= 10){
                return hundreeds[number / 100] + " " + secDecade[number % 10];
            } else {
                String sot = hundreeds[number / 100];
                String ed = units[number % 10];
                return sot + " " + ed;
                //return hundreeds[number / 100] + " " + units[number & 10];
            }
        }
    }
}
