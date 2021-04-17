/*
Задание: Дан массив с числами. Проверьте, что в этом массиве есть число 5. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        int[] elements = {5, 3, 4, 2};

        boolean whetherThereIs = false;
        for (int element : elements) {
            if (element == 5) {
                whetherThereIs = true;
                break;
            }
        }
        System.out.println(whetherThereIs == true ? "да" : "нет");
    }
}
