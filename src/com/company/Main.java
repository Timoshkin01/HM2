package com.company;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.sql.ResultSet;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int age = 23;
        int temp = 15;

        System.out.println(method(15, 15));
        System.out.println(method(30, 21));
        System.out.println(method(31, 27));
        System.out.println(method(27, 18));
        System.out.println(method(45, -1));
        System.out.println(method(randomGenerateAge(),30 ));
    }

    public static String method(int ageOfPerson, int temperature) {
        if (ageOfPerson > 20 && ageOfPerson < 45 && temperature > -20 && temperature < 30) {
            return "Можно идти гулять1";
        }
        if (ageOfPerson < 20 && temperature > 0 && temperature < 28) {
            return "Можно идти гулять2";
        }
        if (ageOfPerson > 45 || temperature > -10 && temperature < 25) {
            return "Можно идти гулять3";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static int randomGenerateAge (){
        Random random = new Random();
        int randomAge = random.nextInt(50);
        return randomAge;
    }
}