/*
1. Ввести путь к файлу с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10
Пример вывода:
-2
2
8
10
*/
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new FileReader("/Users/andrejberg/Desktop/IT/Java/text.txt"));
        ArrayList<Integer> nums = new ArrayList<Integer>();
        String s;
        while ((s = buff.readLine()) != null){
            try {
                nums.add(Integer.parseInt(s));
            } catch (Exception ex) {

            }
        }
        buff.close();
        Collections.sort(nums);
        for (int num : nums){
            if (num % 2 == 0) System.out.println(num);
        }
    }
}
