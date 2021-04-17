/*
Задание: Сделайте функцию, которая параметрами принимает 2 числа. Если эти числа равны - пусть функция вернет true, а если не равны - false.
*/

public class Main {

    public static boolean equal(int a, int b) {
        return a == b;
    }

    public static void main(String[] args) {
        System.out.println(equal(2,2));
        System.out.println(equal(2,3));
    }
}
