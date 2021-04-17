/*
Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно. Отобразить размер вклада поочередно на ближайшие 5 лет.
*/
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);;
        System.out.print("Введите сумму вклада: ");
        double depositAmount = scan.nextDouble();
        System.out.print("Введите процент по вкладу: ");
        double percent = scan.nextDouble();
        for (int i = 1; i < 6; i++ ){
            depositAmount += depositAmount * (percent / 100.0);
            System.out.println("За " + i + " год, размер вклада: " + depositAmount);
        }
    }
}
