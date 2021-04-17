/*
Задание: Дано число, например 31. Проверьте, что это число не делится ни на одно другое число кроме себя самого и единицы.
То есть в нашем случае нужно проверить, что число 31 не делится на все числа от 2 до 30.
Если число не делится - выведите 'false', а если делится - выведите 'true'.
*/

public class Main {
    public static void main(String[] args) {
        int number = 31;
        boolean shares = false;
        for (int i = 2; i < number; i++){
            if ( number % i == 0) {
                shares = true;
                break;
            }
        }
        System.out.println(shares);
    }
}
