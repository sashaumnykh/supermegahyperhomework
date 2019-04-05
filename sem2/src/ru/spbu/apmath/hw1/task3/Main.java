package ru.spbu.apmath.hw1.task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] x){
        // Узнаете песню??
        // Да, идею я тоже позаимствовала *неловко*
        // Но ведь она действительно классная!
        ArrayList<String> lst = new ArrayList<>();
        int step = -2;
        lst.add("What's been happening in your world?");
        lst.add("What have you been up to?");
        lst.add("I heard that you fell in love");
        lst.add("Or near enough");
        lst.add("I gotta tell you the truth…");
        /*lst.add("1");
        lst.add("2");
        lst.add("3");
        lst.add("4");
        lst.add("5");*/
        System.out.println(Rotator.rotate(lst, step));
    }
}
