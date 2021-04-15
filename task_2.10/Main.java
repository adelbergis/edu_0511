/*
Задание: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {

    public static void main(String[] args) {
        System.out.println(pow(new int[]{2, 3, 1, 4, 5, 2}));
        System.out.println(pow(new int[]{}));
        System.out.println(pow(new int[]{2, 3, 1, 5, 5, 2}));
        System.out.println(pow(new int[]{2, 3, 1, 5, 2, 2}));
        System.out.println(pow(new int[]{1, 3, 1, 5, 4, 2}));
        System.out.println(pow(new int[]{1, 1, 2, 5, 4, 2}));
    }
    static String pow(int[] array){
        int checkup = array.length > 0 ? array[0] : 0;
        for (int i = 1; i < array.length; i++){
            if (checkup == array[i]) return "да";
            checkup = array[i];
        }
        return "нет";
    }

}
