package Unit2;

import java.util.HashSet;

public class Unit2 {

    public static void main(String[] args) {
        //Найти первую повторяющуюся букву. Без подключения библиотек.
        task();
        alternativeTask();
    }

    private static void task() {
        String str = "веревка достаточной длины,чтобы выстрелить себе в ногу";
        System.out.println("Строка: " + str);
        char[] array = str.toCharArray();
        int z = 0;
        char[] arr = new char[array.length];
        loop:
        {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (array[i] != arr[j]) {
                        if (arr[j] == 0) {
                            arr[j] = array[i];
                            break;
                        }
                    } else {
                        z = i;
                        break loop;
                    }
                }
            }
        }
        System.out.println("Первая повторяющаяся буква в строке: " + array[z]);
        System.out.println("-------------------------");
    }

    private static void alternativeTask() {
        String str = "ололо веревка достаточной длины,чтобы выстрелить себе в ногу";
        System.out.println("Строка: " + str);
        char[] array = str.toCharArray();
        HashSet<Character> myString = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if (!myString.add(array[i])) {
                System.out.println("Первая повторяющаяся буква в строке: " + array[i]);
                break;
            }
        }
    }
}