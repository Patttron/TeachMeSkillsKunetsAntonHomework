package Unit6;

public class Pairs {
    public static double romanToArabian(String inputLine) {
        int decimal = 0;
        for (int i = 0; i < inputLine.length(); i++) {
            char convertToArab = inputLine.charAt(i);
            switch (convertToArab) {
                case 'M':
                    decimal += 1000;
                    break;
                case 'D':
                    decimal += 500;
                    break;
                case 'C':
                    decimal += 100;
                    break;
                case 'L':
                    decimal += 50;
                    break;
                case 'X':
                    decimal += 10;
                    break;
                case 'V':
                    decimal += 5;
                    break;
                case 'I':
                    decimal += 1;
                    break;
                case 'N':
                    decimal = 0;
                    break;
            }
            if (inputLine.startsWith("I") && inputLine.length() > 1) {
                decimal -= 1;
            }
            if (inputLine.startsWith("X") && inputLine.length() > 1 && !inputLine.endsWith("V") && !inputLine.endsWith("I")) {
                decimal -= 10;
            }
        }
        return decimal;
    }

    public static String arabianToRoman(double input) {
        String str = "";
        if (input == 0) {
            str = "N";
        }
        while (input >= 1000) {
            str += "M";
            input -= 1000;
        }
        while (input >= 900) {
            str += "CM";
            input -= 900;
        }
        while (input >= 500) {
            str += "D";
            input -= 500;
        }
        while (input >= 400) {
            str += "CD";
            input -= 400;
        }
        while (input >= 100) {
            str += "C";
            input -= 100;
        }
        while (input >= 90) {
            str += "XC";
            input -= 90;
        }
        while (input >= 50) {
            str += "L";
            input -= 50;
        }
        while (input >= 40) {
            str += "XL";
            input -= 40;
        }
        while (input >= 10) {
            str += "X";
            input -= 10;
        }
        while (input >= 9) {
            str += "IX";
            input -= 9;
        }
        while (input >= 5) {
            str += "V";
            input -= 5;
        }
        while (input >= 4) {
            str += "IV";
            input -= 4;
        }
        while (input >= 1) {
            str += "I";
            input -= 1;
        }
        return str;
    }
}
