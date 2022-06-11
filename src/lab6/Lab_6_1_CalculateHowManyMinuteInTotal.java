package lab6;

import static java.lang.System.out;

public class Lab_6_1_CalculateHowManyMinuteInTotal {
    static String ExtractDigitsFromAString(String str) {

        String finalSTR = str.replaceAll("[^0-9]", "");
        return finalSTR;
    }

    public static void main(String[] args) {

        System.out.printf("digit from this string is %s\n", ExtractDigitsFromAString("2hrs and 5 minutes"));
        // convert a string to int
        int numberOfString = Integer.parseInt(ExtractDigitsFromAString("2hrs and 5 minutes"));
        // Calculate munites from above string
        int minutes = 0;
        minutes = numberOfString % 10 + numberOfString / 10 * 60;
        System.out.printf("Minutes from this string is %s ", minutes);

    }
}
