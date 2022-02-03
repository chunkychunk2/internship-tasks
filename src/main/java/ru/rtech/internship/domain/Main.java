package ru.rtech.internship.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    static int excelColumnNameToNumber(String columnName) {
        int result = 0;
        ArrayList<Character> abc = new ArrayList<>();
        abc.add('A');
        abc.add('B');
        abc.add('C');
        abc.add('D');
        abc.add('E');
        abc.add('F');
        abc.add('J');
        abc.add('H');
        abc.add('I');
        abc.add('G');
        abc.add('K');
        abc.add('L');
        abc.add('M');
        abc.add('N');
        abc.add('O');
        abc.add('P');
        abc.add('Q');
        abc.add('R');
        abc.add('S');
        abc.add('T');
        abc.add('U');
        abc.add('V');
        abc.add('W');
        abc.add('X');
        abc.add('Y');
        abc.add('Z');
        if (columnName.length() == 1){
            for (Character x: abc){
                //     System.out.println(x);
                if (x.equals(columnName.charAt(0))) {
                    result = (abc.indexOf(x)+1);
                }
            }
        }
        else if (columnName.length() == 2){
            for (Character x: abc){
                //     System.out.println(x);
                if (x.equals(columnName.charAt(1))) {
                    System.out.println(x);
                    result = ((abc.indexOf(x)+1) * 27);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
//        String s ="1";
//
//        System.out.println(s.matches("^[0-9]\\d?$"));
        System.out.println(excelColumnNameToNumber("A"));
        System.out.println(excelColumnNameToNumber("AA"));
        System.out.println(excelColumnNameToNumber("ZZ"));

    }
}

