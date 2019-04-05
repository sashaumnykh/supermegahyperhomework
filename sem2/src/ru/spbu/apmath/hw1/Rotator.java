package ru.spbu.apmath.hw1.task3;

import java.util.ArrayList;

public class Rotator {

    public static <T> ArrayList<T> rotate(ArrayList<T> lst, int step)
    {
        ArrayList<T> newLst = new ArrayList<>();
        int s = lst.size();
        step = step % s;
        if (step > 0){
            newLst.addAll(lst.subList(s - step, s));
            newLst.addAll(lst.subList(0, s - step));
        }
        if (step < 0){
            step = (-1)*step;
            newLst.addAll(lst.subList(step, s));
            newLst.addAll(lst.subList(0, step));
        }
        return newLst;
    }
}
