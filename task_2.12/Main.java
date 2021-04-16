/*
ВНИМАНИЕ эта задача для ДЗ и не является обязательной.
Задание: 1. Создай массив чисел.
2. Добавь в массив 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[10];

        int numberOld = 0, lenght = 0, maxLenght = 0;

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++){
            System.out.print("Введите число("+(i+1)+"/10): ");
            numbers[i] = scan.nextInt();

            if (i == 0) numberOld = numbers[i];
            else if (numberOld == numbers[i]) {
                if (lenght == 0) lenght = 2;
                else lenght++;

                if (lenght > maxLenght) maxLenght = lenght;

            } else {
                lenght = 0;
                numberOld = numbers[i];
            }

        }

        if (maxLenght > 0) System.out.println(maxLenght);

    }
}
