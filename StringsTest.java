package be.vdab.FundamentalsTest;

import java.io.*;
import java.lang.*;
import java.util.*;

public class StringsTest {
    public static void main(String[] args) {
        int countStr1 = 0;
        int countStr2 = 0;
        int countStr3 = 0;
        String string1 = "Lepel";
        String string2 = "http://www.smartdeveloper.be";
        String string3 = "De mooie zeeman nam Anna mee zei oom Ed";

        for (int i = 0; i < string1.length(); i++) {
            char vowel = string1.charAt(i);
            if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u' || vowel == ' ') {
                countStr1++;
            }
        }

        for (int i = 0; i < string2.length(); i++) {
            char vowel = string2.charAt(i);
            if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u' || vowel == ' ') {
                countStr2++;
            }
        }

        for (int i = 0; i < string3.length(); i++) {
            char vowel = string3.charAt(i);
            if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u' || vowel == ' ') {
                countStr3++;
            }
        }

        System.out.println("The number of vowels in the string: " + string1 + " is " + countStr1);
        System.out.println("The number of vowels in the string: " + string2 + " is " + countStr2);
        System.out.println("The number of vowels in the string: " + string3 + " is " + countStr3);
        System.out.println();

        if (string1.startsWith("http://") == true)
            System.out.println(string1 + "This is a url");
        if (string2.startsWith("http://") == true)
            System.out.println(string2 + "This is a url");
        if (string3.startsWith("http://") == true)
            System.out.println(string3 + "This is a url");
        System.out.println();
    }
}




