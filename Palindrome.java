package be.vdab.FundamentalsTest;

public class Palindrome {

    // Please don't use abbreviations for variable names = readability
    static boolean isPalindrome(String str) {
        int iB = 0, iE = str.length() - 1;
        while (iB < iE) {
            if (str.charAt(iB) != str.charAt(iE))
                return false;
            iB++;
            iE--;
        }
        return true;
    }

    public static void main(String[] args)
    {
        String string1 = "lepel";
        String string2 = "http://www.smartdeveloper.be";
        String string3 = "De mooie zeeman nam Anna mee zei oom Ed";

        if (isPalindrome(string1))
            System.out.println(string1 +" is a palindrome");
        else
            System.out.println(string1 +" is not a palindrome");

        if (isPalindrome(string2))
            System.out.println(string2 +" is a palindrome");
        else
            System.out.println(string2 +" is not a palindrome");

        if (isPalindrome(string3))
            System.out.println(string3 +" is a palindrome");
        else
            System.out.println(string3 +" is not a palindrome");
        // Always curly braces, even for one line of code = readability
    }
}
