package lab6;

import java.util.ArrayList;
import java.util.List;

public class Lab_6_3_ExtractDigitsFromStringButNotUseREGEX {
    public static void main(String[] args) {
        String myStr = "100 minutes";
        char[] myCharacters= myStr.toCharArray();
        int totalDigits=0;
        // Declare arraylist of digits
        List<Character> myListOfDigits= new ArrayList<>();
        for (char character  : myCharacters) {
            if (Character.isDigit(character)){
                myListOfDigits.add(character);
            }

        }
        // print out arrayList
        System.out.printf("Arway List of Digits from string is %S\n",myListOfDigits);
        //convert from arrayList to string
        String finalDigitsFromString= myListOfDigits.toString();
        System.out.printf("Digits from string is %S",finalDigitsFromString);
    }
}
