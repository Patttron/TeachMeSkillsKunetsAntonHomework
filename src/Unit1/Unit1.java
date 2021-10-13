package Unit1;

import java.util.Scanner;

public class Unit1 {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task5();
        task6();
        task7();
    }

    private static void task1() {
        /** В переменную записываем число. Надо вывести на экран сколько в этом
           числе цифр и положительное оно или отрицательное. Например, "это
           однозначное положительное число". Достаточно будет определить, является ли
           число однозначным, двухзначным или трехзначным и более. */
        int count = 0;
        System.out.print("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num > 0) {
            while (num != 0) {
                count++;
                num /= 10;
            }
            System.out.println("You entered a positive number, which consists from " + count + " digit(s).");
        } else if (num == 0) {
            System.out.println("You entered 0");
        } else {
            while (num != 0) {
                count++;
                num /= 10;
            }
            System.out.println("You entered a negative number, which consists from " + count + " digit(s).");
        }
        System.out.println("-------------------------------");
    }

    private static void task2() {
        /**Треугольник существует только тогда, когда сумма любых двух его сторон
          больше третьей. Определить существует ли такой треугольник. Дано: a, b, c –
          стороны предполагаемого треугольника. Требуется сравнить длину каждого
          отрезка-стороны с суммой двух других. Если хотя бы в одном случае отрезок
          окажется больше суммы двух других, то треугольника с такими сторонами не
          существует.*/
        System.out.println("Enter the sides of the triangle:");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scan.nextInt();
        System.out.print("Enter b: ");
        int b = scan.nextInt();
        System.out.print("Enter c: ");
        int c = scan.nextInt();
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Wrong triangle.");
        } else if (a < b + c && b < a + c && c < a + b) {
            System.out.println("This triangle is exist.");
        } else {
            System.out.println("Wrong triangle.");
        }
        System.out.println("-------------------------------");
    }

    private static void task3() {
        /**Дано целое число. Если оно является положительным, то прибавить к нему 1.
        Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на
        10. Вывести полученное число.*/
        System.out.print("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num > 0) {
            num++;
        } else if (num < 0) {
            num -= 2;
        } else {
            num = 10;
        }
        System.out.println("New value: " + num);
        System.out.println("-------------------------------");
    }

    private static void task5() {
        /**Даны 3 целых числа. Найти количество положительных и отрицательных
           чисел в исходном наборе.*/
        int num, count1 = 0, count2 = 0;
        System.out.println("Enter three numbers:");
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i < 4; i++) {
            System.out.print("Enter " + i + " number: ");
            num = scan.nextInt();
            if (num > 0) {
                count1++;
            } else if (num == 0) continue;
            else {
                count2++;
            }
        }
        System.out.println("You have " + count1 + " positive and " + count2 + " negative numbers.");
        System.out.println("-------------------------------");
    }

    private static void task6() {
        /**  Даны 2 числа. Вывести большее из них.*/
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scan.nextInt();
        System.out.print("Enter b: ");
        int b = scan.nextInt();
        if(a == b){
            System.out.println("a equals b");
        }
        else {
            System.out.println("Max number of them: " + Math.max(a, b));
        }
        System.out.println("-------------------------------");
    }

    private static void task7() {
        /**В переменную записываете количество программистов. В зависимости от количества
          программистов необходимо вывести правильно окончание. Например:
          2 программиста
          1 программист
          10 программистов*/
        System.out.print("Введите количество программистов: ");
        Scanner scan = new Scanner(System.in);
        for (; ; ) {
            int x = scan.nextInt();
            int y = x % 100;
            if (y >= 5 && y <= 19) {
                System.out.print(x + " программистов");
                break;
            } else if (y % 10 == 1) {
                System.out.print(x + " программист");
                break;
            } else if (y % 10 > 1 && y % 10 <= 4) {
                System.out.print(x + " программиста");
                break;
            } else if (y > 4) {
                System.out.print(x + " программистов");
                break;
            } else {
                System.out.print("Ведите положительное число: ");
            }
        }
    }
}
