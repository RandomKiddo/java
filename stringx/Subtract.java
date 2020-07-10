import java.util.ArrayList;
public class Subtract{
    //Subtraction Methods
    public static String subtract(String initial, String remove){
        ArrayList<String> list = getStringList(initial);
        String last = "";
        if (initial.indexOf(remove) == -1){
            return null;
        }
        int index = list.indexOf(remove);
        for (int a = 0; a < list.size(); a++){
            if (a != index){
                last += list.get(a);
            }
        }
        return last;
    }
    public static String subtract(String initial, char remove){
        ArrayList<Character> list = getCharList(initial);
        if (initial.indexOf(""+remove) == -1){
            return null;
        }
        for (int a = 0; a < list.size(); a++){
            if (list.get(a) == remove){
                list.remove(a);
                break;
            }
        }
        String str = "";
        for (char c : list){
            str += c;
        }
        return str;
    }
    public static String subtract(String initial, double remove){
        String asString = remove + "";
        return subtract(initial,asString);
    }
    public static String subtract(String initial, int remove){
        String asString = remove + "";
        return subtract(initial,asString);
    }
    public static String subtractAll(String initial, String remove){
        ArrayList<String> list = getStringList(initial);
        for (int a = list.size()-1; a >= 0; a--){
            if (list.get(a).equalsIgnoreCase(remove)){
                list.remove(a);
            }
        }
        String str = "";
        for (String s : list){
            str += s;
        }
        return str;
    }
    public static String subtractAll(String initial, char remove){
        ArrayList<Character> list = getCharList(initial);
        for (int a = list.size()-1; a >= 0; a--){
            if (list.get(a) == remove){
                list.remove(a);
            }
        }
        String str = "";
        for (char s : list){
            str += s;
        }
        return str;
    }
    public static String subtractAll(String initial, double remove){
        return subtractAll(initial, ""+remove);
    }
    public static String subtractAll(String initial, int remove){
        return subtractAll(initial, ""+remove);
    }
    //List Getting Methods
    private static ArrayList<String> getStringList(String initial){
        ArrayList<String> list = new ArrayList<String>();
        String str = "";
        for (int a = 0; a < initial.length(); a++){
            if (!Character.isWhitespace(initial.charAt(a))){
                str += initial.charAt(a);
            } else {
                list.add(str);
                list.add(" ");
                str = "";
            }
        }
        list.add(str);
        return list;
    }
    private static ArrayList<Character> getCharList(String initial){
        ArrayList<Character> list = new ArrayList<Character>();
        for (int a = 0; a < initial.length(); a++){
            list.add(initial.charAt(a));
        }
        return list;
    }
}