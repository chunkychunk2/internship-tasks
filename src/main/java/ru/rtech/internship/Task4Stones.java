package ru.rtech.internship;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Task4Stones {

    /**
     * Баллов за выполнение - 2
     *
     * У нас есть N камней и M людей на входе. Делаем следующие:
     * Берем из стопки 1 камушек, даем первому человеку, дальше берем 2 камушка, даем второму человеку,
     * дальше 3 камушка и т.п. То есть, каждый раз берем N+1 камень. Если люди кончились, а камни остались,
     * то продолжаем раздачу с первого человека.
     *
     * На входе - количество людей, количество камней
     * На выходе - массив, у кого сколько камней
     *
     * Камней = 3, людей = 5 -> [1,2,0,0,0]
     * Камней = 3, людей = 2 ->  [1,2]
     * Камней = 10, людей = 3 -> [5,2,3]
     * Камней = 2, людей = 4 -> [1,1,0,0]
     *
     */

    public  int[] peopleAndStones(int peopleNumber, int stonesNumber){
        int[] peop = new int[peopleNumber];
        LinkedList<Integer> stones = new LinkedList<>();
        for (int i = 0; i < stonesNumber; i++) {
            stones.add(1);
        }
        int increment = 0;
        while   (stones.size()!=0){
            for (int i = 0; i < peopleNumber; i++) {
                for (int j = 0; j < 1+increment; j++) {
                    if (stones.size()!=0){
                        peop[i] += 1;
                        stones.remove();

                    }
                }
                increment++;
            }
        }
        System.out.println(Arrays.toString(peop));
        return peop;
    }
}