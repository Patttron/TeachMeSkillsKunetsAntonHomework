import java.util.Arrays;
import java.util.Scanner;

class Unit5_Bubble {
    static int[] inputArray;

    public static void main(String[] args) {
        /**Создать программу, которая позволяет ввести с клавиатуры
         *  массив размером n и отсортировать его по убыванию*/
        makeArrayUsingKeyboard();
        printArray();
        sortArrayByBubbleWay();
        printArray();
    }

    private static void makeArrayUsingKeyboard() {
        System.out.print("Enter array size: ");
        Scanner scan = new Scanner(System.in);
        int arraySize = scan.nextInt();
        inputArray = new int[arraySize];
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print("Enter element [" + i + "] : ");
            int valueOfElement = scan.nextInt();
            inputArray[i] = valueOfElement;
        }
    }

    private static void printArray() {
        System.out.print("Array: ");
        System.out.println(Arrays.toString(inputArray));
    }

    private static void sortArrayByBubbleWay() {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < inputArray.length - 1; i++) {
                if (inputArray[i] < inputArray[i + 1]) {
                    isSorted = false;
                    int shuffle = inputArray[i];
                    inputArray[i] = inputArray[i + 1];
                    inputArray[i + 1] = shuffle;
                }
            }
        }
    }
}
