package ru.rtech.internship;

import java.util.ArrayList;

public class Task5Excel {


    /**
     * Баллов за выполнение - 2
     *
     * На вход идёт название колонки в excel (A,Z,AA,AB..AAZ) в диапазоне от A до ZZZ.
     * Необходимо преобразовать название в столбца в его номер. Например:
     *
     * A -> 1
     * B -> 2
     * Z -> 26
     * AA -> 27
     * ZZ-> 702
     * ADC -> 783
     * ZZZ-> 18278
     */
    public int excelColumnNameToNumber(String columnName) {
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
                if (x.equals(columnName.charAt(0))) {
                    result = (abc.indexOf(x)+1);
                }
            }
        }
        else if (columnName.length() == 2){
            for (Character x: abc){
                //     System.out.println(x);
                if (x.equals(columnName.charAt(1))) {
                 //   System.out.println(x);
                    result = ((abc.indexOf(x)+1) * 27);
                }
            }
        }
        else if (columnName.length() == 3){
          //  индекс первой буквы х26 + индекс 2 буквы х 26 + индекс 3 буквы
            result = ((abc.indexOf(columnName.charAt(0))+1) * 26 + (abc.indexOf(columnName.charAt(1))+1)) * 26 + (abc.indexOf(columnName.charAt(2))+1);

        }
        return result;
    }
}
