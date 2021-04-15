/*
Пользователь вводит число, необходимо увеличить это число на 15% и вывести результат на экран
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//так получаем поток байт с клавиатуры
        int number = scan.nextInt();
        System.out.println(0.15 * number + number);
    }
}
