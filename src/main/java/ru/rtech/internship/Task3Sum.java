package ru.rtech.internship;

import java.util.ArrayList;
import java.util.List;

public class Task3Sum {

    /**
     * Баллов за выполнение - 2
     *
     * На вход идет строка с числами и операциями сложения и вычитания. Например, 5+6-3. Унарных операций нет, то есть строка всегда начинается с положительного числа.
     * Функция должна вернуть результат выражения. Скобки учитывать не надо. Между числами и знаками может быть разное количество пробелов. Если во время
     * вычисления случилась ошибка и выражение вычислить не получается - вернуть null.
     */
    public Integer sum(String experssion){
        ArrayList<Integer> nums = new ArrayList<>();
        String [] numbers = experssion.replaceAll("\\D", " ").split(" ");
        String [] operations = experssion.replaceAll("[^\\D]", "").split("");
        for(String n: numbers){
            if (!n.equals("")) nums.add(Integer.parseInt(n));
        }
        // System.out.println(nums);
        for(String n: operations){
            if (n.matches("[^+-/*]")) return null;

        }
        if (operations.length != nums.size()-1) return null;

        int result = nums.get(0);
        for (int i = 0; i < numbers.length-1; i++) {
            String sign = operations[i];
            switch (sign) {
                case "*":
                    result = result* nums.get(1);
                    break;
                case "/":
                    result = result / nums.get(1);
                    break;
                case "+":
                    result = result + nums.get(1);
                    break;
                case "-":
                    result = result - nums.get(1);
                    break;
            }

            nums.remove(0);
        }
        return result;
    }
}
