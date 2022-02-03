package ru.rtech.internship;

import ru.rtech.internship.domain.Node;

import java.util.ArrayList;
import java.util.Collections;

public class Task6Tree {

    /**
     *
     * Баллов за выполнение - 3
     *
     * На вход идет корень бинарного дерева(node), каждый элемент дерева содержит значение (node.value) - строка, в которой записано целое число.
     * На выходе получить строку со всеми элементами дерева, разделенными точкой с запятой. После последнего элемента ; быть не должно.
     * Элементы должны быть отсортированы по возрастанию как числа.
     * <p>
     * Пример:
     * Если в дереве элементы [1, 10, 2, 110], необходимо вывести строку 1;2;10;110
     */
    public String sortedTreeValues(Node root) {
        ArrayList<Integer>numbers = new ArrayList<>();
        numbers.add(Integer.parseInt(root.value()));
        numbers.add(Integer.parseInt(root.left().value()));
        numbers.add(Integer.parseInt(root.right().value()));


        Collections.sort(numbers);
        String result = "";
        for (int n: numbers){
            result += n + ";";
        }
        result = result.substring(0,result.length()-1);
        return result;
    }
}
