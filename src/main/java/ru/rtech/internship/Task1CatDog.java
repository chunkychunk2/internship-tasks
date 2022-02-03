package ru.rtech.internship;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Task1CatDog {


    /**
     * Баллов за выполнение - 1
     * <p>
     * На вход идет непустой список с числами > 0. Если число кратно 3, записать в выходной список строку вида "число - cat", например, "3 - cat".
     * Если число кратно 5, записать строку вида "число - dog". Если число одновременно кратно 3 и 5 - записать в выходной массив
     * "число - catdog", например "15 - catdog"
     */
    public List<String> catDog(List<Integer> numbers) {
        // 1,2,3,4,5
        // if n%3 == 0
        ArrayList<String> nums = new ArrayList<>();
        for (int n : numbers) {
            if (n % 3 == 0 && n % 5 == 0) nums.add(n + " - catdog");
            else if (n % 3 == 0) nums.add(n + " - cat");
            else if (n % 5 == 0) nums.add(n + " - dog");

        }
        return nums;
    }
}
