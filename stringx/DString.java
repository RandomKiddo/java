import java.util.*;
public class DString{
    public static int countVowels(String str){
        char[] vowels = {'a','e','i','o','u'};
        int amount = 0;
        for (int a = 0; a < str.length(); a++){
            if (compare(vowels, str.charAt(a)) > -1){
                amount++;
            }
        }
        return amount;
    }
    public static int countVowelsUpper(String str){
        char[] vowels = {'A','E','I','O','U'};
        int amount = 0;
        for (int a = 0; a < str.length(); a++){
            if (compare(vowels, str.charAt(a)) > -1){
                amount++;
            }
        }
        return amount;
    }
    public static int countVowelsIgnoreCase(String str){
        char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
        int amount = 0;
        for (int a = 0; a < str.length(); a++){
            if (compare(vowels, str.charAt(a)) > -1){
                amount++;
            }
        }
        return amount;
    }
    public static int countConsonants(String str){
        char[] cons = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
        int amount = 0;
        for (int a = 0; a < str.length(); a++){
            if (compare(cons, str.charAt(a)) > -1){
                amount++;
            }
        }
        return amount;
    }
    public static int countConsonantsUpper(String str){
        char[] cons = {'B','C','D','F','G','H','J','K','L','M','N','P','Q','R','S','T','V','W','X','Y','Z'};
        int amount = 0;
        for (int a = 0; a < str.length(); a++){
            if (compare(cons, str.charAt(a)) > -1){
                amount++;
            }
        }
        return amount;
    }
    public static int countConsonantsIgnoreCase(String str){
        char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
        int amount = 0;
        for (int a = 0; a < str.length(); a++){
            if (compare(vowels, str.charAt(a)) == -1){
                amount++;
            }
        }
        return amount;
    }
    public static int compare(char[] letters, char isIn){
        for (int a = 0; a < letters.length; a++){
            if (letters[a] == isIn){
                return a;
            }
        }
        return -1;
    }
    public static int countWords(String str){
        List<String> list = getAsList(str);
        return list.size();
    }
    public static List<String> getAsList(String str){
        List<String> list = new ArrayList<String>();
        String temp = "";
        for (int a = 0; a < str.length(); a++){
            char c = str.charAt(a);
            if (c != ' '){
                temp += c;
            } else {
                list.add(temp);
                temp = "";
            }
        }
        list.add(temp);
        return list;
    }
    public static boolean isPalindrome(String str){
        if (str.equals(reverse(str))){
            return true;
        }
        return false;
    }
    public static boolean isPalindromeIgnoreCase(String str){
        if (str.equalsIgnoreCase(reverse(str))){
            return true;
        }
        return false;
    }
    public static String reverse(String str){
        if (str.length() == 0){ return ""; }
        char c = str.charAt(str.length()-1);
        return c + reverse(str.substring(0,str.length()-1));
    }
}