/*
Задание: Даны переменные a и b. Проверьте, что a делится без остатка на b. Если это так - выведите 'Делится'
и результат деления, иначе выведите 'Делится с остатком' и остаток от деления.
*/

public class Main {
    public static void main(String[] args) {
        double a = 8, b=4;
        System.out.println(a % b == 0 ? "Делится " + (a / b)  : "Делится с остатком " + (a % b));
    }
}