import java.util.*;
public class AsList{
    public static List<String> getString(String str){
        String temp = "";
        List<String> list = new ArrayList<>();
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
    public static List<String> getStringWithSpaces(String str){
        String temp = "";
        List<String> list = new ArrayList<>();
        for (int a = 0; a < str.length(); a++){
            char c = str.charAt(a);
            if (c != ' '){
                temp += c;
            } else {
                list.add(temp);
                list.add(" ");
                temp = "";
            }
        }
        list.add(temp);
        return list;
    }
    public static List<Character> getChar(String str){
        List<Character> list = new ArrayList<>();
        for (int a = 0; a < str.length(); a++){
            list.add(str.charAt(a));
        }
        return list;
    }
}