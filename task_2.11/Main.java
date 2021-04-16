/*
Задание: Дан массив с числами. Узнайте сколько элементов с начала массива надо сложить, чтобы в сумме получилось больше 10-ти.
*/

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,1,1,1,1,1};
        int count = 0;
        for (int i = 0; i < numbers.length; i++){
            count += numbers[i];
            if (count > 10) {
                System.out.println("Нужно сложить: "+ (i+1));
                break;
            }
        }
        if (count < 11) System.out.println("В массиве не хватает элементов!");
    }
}
