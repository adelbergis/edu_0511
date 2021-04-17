/*
Задание: Дан массив с числами. Выведите последовательно его элементы используя рекурсию и не используя цикл.
*/

public class Main {

    public static void elementOutput(int[] array, int i) {
        if (i < array.length){
            System.out.println(array[i]);
            elementOutput(array, i+1);
        }
    }

    public static void main(String[] args) {
        int num[] = {4,2,6,2,65};
        elementOutput(num, 0);
    }
}
