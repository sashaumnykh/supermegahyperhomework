package ru.spbu.apmath.hw1.task3;

import java.util.ArrayList;

public class Rotator {

    public static List rotate(List<Integer> lst)
    {
        List<Integer> newLst = new ArrayList<>();
        int s = lst.size();
        newLst.addAll(lst.subList(s - 1, s));
        return newLst;
    }
}
