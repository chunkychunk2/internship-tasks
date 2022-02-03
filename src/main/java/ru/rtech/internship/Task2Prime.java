package ru.rtech.internship;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task2Prime {

    /**
     * Баллов за выполнение - 1
     *
     * На вход идет непустой список с числами > 0. Нужно вернуть список с квадратами простых чисел.
     */
    public List<Integer> primeSquares(List<Integer> numbers) {
        // 1,2,3,4,5
        ArrayList<Integer> nums = new ArrayList<>();
        for (int n: numbers){
            int count = 0;
            for (int i = n; i > 1; i--) {
                if (n%i==0) count++;
            }
            if (count==1) nums.add(n*n);

        }
        return nums;
    }

}
