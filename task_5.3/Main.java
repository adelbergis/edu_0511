/*
 * Задание: Дана коллекция с числами. Запишите в новую коллекцию только те числа, которые больше нуля и меньше 10-ти.
 * Коллекции вы создаёте сами
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> numbers1 = new ArrayList<Integer>();

        for (int i=0; i < 20; i++){
            numbers.add(i);
            if (i > 0 && i < 10) numbers1.add(i);
        }
        System.out.println(numbers);
        System.out.println(numbers1);

        //TODO: А такой подход счтается плохим?
        ArrayList<Integer> numbers2 = new ArrayList<Integer>(numbers);
        numbers2.removeIf(n -> (n < 1 || n > 9));
        System.out.println(numbers2);
    }
}
