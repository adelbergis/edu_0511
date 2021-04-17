/*
Задание: Дан массив с элементами [2, 3, 4, 5]. С помощью цикла for найдите произведение элементов этого массива.
*/

public class Main {
    public static void main(String[] args) {
        int[] elements = {2, 3, 4, 5};
        int productOfElements = 1;
        for (int element : elements) {
            productOfElements *= element;
        }
        //System.out.println(productOfElements);
    }
}
