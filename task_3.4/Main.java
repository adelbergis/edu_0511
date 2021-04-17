/*
Задание: Сделайте функцию, которая параметрами принимает 2 числа. Если их сумма больше 10 - пусть функция вернет true, а если нет - false.
*/

public class Main {

    public static boolean moreTen(int a, int b) {
        return a + b > 10;
    }

    public static void main(String[] args) {
        System.out.println(moreTen(2,5));
        System.out.println(moreTen(9,3));
        System.out.println(moreTen(9,1));
        System.out.println(moreTen(10,10));
        System.out.println(moreTen(0,0));
    }
}
