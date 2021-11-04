package Unit6;

import java.io.*;
import java.util.Locale;

import static Unit6.Pairs.arabianToRoman;
import static Unit6.Pairs.romanToArabian;
import static java.lang.System.exit;


public class Unit6 {
    public static void main(String[] args) {
        /**Calculate two number. Numbers can be arabian and roman*/
        delimiter(inputLine());
    }

    static void delimiter(String inputLine) {
        String[] str = inputLine.split(" ");
        int n = 0, k = 0;
        double first = 0, second = 0;
        char operation = ' ';
        for (String subStr : str) {
            if (subStr.matches("[a-zA-Z]+")) {
                k++;
                if (n > 0) {
                    second = romanToArabian(subStr);
                } else {
                    n++;
                    first = romanToArabian(subStr);
                }
            } else if (subStr.matches("[0-9]+")) {
                if (n > 0) {
                    second = Integer.parseInt(subStr);
                } else {
                    n++;
                    first = Integer.parseInt(subStr);
                }
            } else if (subStr.matches("[+*/-]")) {
                operation = subStr.charAt(0);
            } else if (subStr.matches("[=]")) {
                continue;
            } else {
                System.out.println("Wrong syllable! Try again");
                break;
            }
        }
        if (k == 0) {
            System.out.println("Result is: " + calculate(first, second, operation));
        } else if (k == 1) {
            System.out.println("Result is: " + calculate(first, second, operation));
            System.out.println("Result is: " + arabianToRoman(calculate(first, second, operation)));
        } else {
            System.out.println("Result is: " + arabianToRoman(calculate(first, second, operation)));
        }
    }


    static String inputLine() {
        String inputLine = "";
        System.out.println("Enter math expression with two numbers:");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            if ((inputLine = reader.readLine()).equals("=")) {
                reader.close();
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return inputLine.toUpperCase(Locale.ROOT);
    }

    public static double calculate(double first, double second, char operation) {
        switch (operation) {
            case '+':
                return plus(first, second);
            case '-':
                return minus(first, second);
            case '*':
                return multiplication(first, second);
            case '/':
                return division(first, second);
            default:
                return Double.NaN;
        }
    }

    public static double plus(double first, double second) {
        return first + second;
    }

    public static double minus(double first, double second) {
        return first - second;
    }

    public static double multiplication(double first, double second) {
        return first * second;
    }

    public static double division(double first, double second) {
        if (second == 0) {
            System.out.println("You cannot divide by zero");
            exit(0);
            return Double.NaN;
        } else {
            return first / second;
        }
    }
}
