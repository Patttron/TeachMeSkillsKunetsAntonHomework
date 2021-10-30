package Unit5;

import java.util.*;

public class Unit5_Map {
    public static void main(String[] args) {
        /**Поменять ключи и значения в Map. Напишите метод, который получает на вход Map<K, V> и возвращает Map,
         где ключи и значения поменяны местами. Если карта состоит из 6 пар ключ-значение,
         то итоговая карта должна состоять из 6 пар ключ-значение.*/
        reverseMap(createMap());
    }

    static Map<Integer, Wrapper> createMap() {
        Map<Integer, Wrapper> inputMap = new HashMap<>();
        System.out.print("Enter a size of map: ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        for (int i = 1; i <= size; i++) {
            System.out.print("Enter " + i + " key and value: ");
            inputMap.put(scan.nextInt(), new Wrapper(scan.next()));
        }
        System.out.println("Input map: ");
        for (Map.Entry<Integer, Wrapper> entry : inputMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        return inputMap;
    }

    static void reverseMap(Map<Integer, Wrapper> inputMap) {
        System.out.println("Reverse map: ");
        for (Map.Entry <Integer, Wrapper> entry : inputMap.entrySet()) {
            System.out.println(entry.getValue() + ": " + entry.getKey());
        }
    }
}
