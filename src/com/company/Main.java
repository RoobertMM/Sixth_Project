package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static int calculateDifference(int numberFour, int numberFive){
        return numberFour / numberFive;
    }

    public static int calculateSum(int numberOne, int numberTwo, int numberTree){
        return numberOne + numberTwo + numberTree;
    }

    public static void main(String[] args) {
        System.out.println("44 : 11=");
        System.out.println(calculateDifference(44,11));
        System.out.println("21+23+25=");
        System.out.println(calculateSum(21,23,25));
        int totalSum = calculateSum(21,23,25);

        if (totalSum >= 69){
            System.out.println("Allowed");
        }else if (totalSum <69){
            System.out.println("Not Allowed");
        }
        int secondTotalSum = calculateDifference(44, 11);

        if (secondTotalSum == 4) {
            System.out.println("True");
        }else if ( secondTotalSum <4 ){
            System.out.println("False");
        }else if (secondTotalSum >4){
            System.out.println("False");
        }
    }
}
