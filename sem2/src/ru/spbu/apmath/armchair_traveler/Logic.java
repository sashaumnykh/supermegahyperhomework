package ru.spbu.apmath.armchair_traveler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Logic {
    public static Character getFirstChar(String city) {
        return city.toUpperCase().charAt(0);
    }

    public static Character getLastChar(String city) {
        int pos = city.length() - 1;
        char lastChar = city.toUpperCase().charAt(pos);
        if (lastChar == 'Ь' || lastChar == 'Ы' || lastChar == 'Ъ') {
            pos--;
        }
        return city.toUpperCase().charAt(pos);
    }

    public static boolean isCity (String city, List cities) throws IOException {
        return cities.contains(city);
    }

    public static boolean isUsed(String city, List used) {

        return used.contains(city);
    }

    public static boolean isTheEnd (String nextWord, List used, int level) throws IOException {
        String address = "C://Users//Александра//IdeaProjects//sem2//src//ru//spbu//apmath//armchair_traveler//" +
                level + "//" + level + getLastChar(nextWord) + ".txt";
        BufferedReader in3 = new BufferedReader(new FileReader(address));
        String anyCity = in3.readLine();
        List<String> tmp2 = new ArrayList<>();
        while (anyCity != null) {
            if (isUsed(anyCity, used) == false) {
                tmp2.add(anyCity);
            }
            anyCity = in3.readLine();
        }
        if (tmp2.size() == 0){
            return true;
        }
        else{
            return false;
        }
    }

}
