/*
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи
Лондон TODO: Почему тут нет отступов?
Пример вывода:
Абрамовичи */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        List<String> list = new ArrayList<>();
        //TODO: Допустим что города уникальные
        Map<String, String> list = new HashMap<String, String>();
        while (true) {
            String city = scanner.nextLine();
            if (city.isEmpty()) {
                break;
            }
            String family = scanner.nextLine();
            if (family.isEmpty()) {
                break;
            }

//            list.add(family);
            list.put(city, family);
        }

        // Read the house number
//        int houseNumber = scanner.nextInt();
//
//        if (0 <= houseNumber && houseNumber < list.size()) {
//            String familyName = list.get(houseNumber);
//            System.out.println(familyName);
//        }
        String searchCity = scanner.nextLine();
        if (list.get(searchCity) != null) {
            System.out.println(list.get(searchCity));
        }
    }
}
