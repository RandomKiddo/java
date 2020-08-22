import java.util.*;
public class Strip{
    public static String trimFront(String str){ return str.trim(); }
    public static String trimEnd(String str){
        String trim = "";
        for (int a = str.length()-1; a >= 0; a--){
            if (!(str.charAt(a) == ' ')){
                trim = str.substring(0,a+1);
                break;
            }
        }
        return trim; 
    }
    public static String trimEnds(String str){
        String copy = trimFront(str);
        copy = trimEnd(copy);
        return copy; 
    }
    public static String rstrip(String str){
        if (str.charAt(str.length()-1) == '\n'){
            String copy = "";
            for (int a = 0; a < str.length()-1; a++){
                copy += str.charAt(a);
            }
            return copy;
        }
        return str;
    }
    public static String rstripFront(String str){
        if (str.charAt(0) == '\n'){
            String copy = "";
            for (int a = 1; a < str.length(); a++){
                copy += str.charAt(a);
            }
            return copy;
        }
        return str;
    }
    public static String rstripEnds(String str){
        String copy = rstrip(str);
        copy = rstripFront(copy);
        return copy;
    }
    public static String fstrip(String str){
        String copy = "";
        for (int a = str.length()-1; a >= 0; a--){
            if (!(str.charAt(a) == '\n')){
                copy = str.substring(0,a+1);
                break;
            }
        }
        return copy;
    }
    public static String fstripFront(String str){
        String copy = "";
        for (int a = 0; a < str.length(); a++){
            if (!(str.charAt(a) == '\n')){
                copy = str.substring(a);
                break;
            }
        }
        return copy;
    }
    public static String fstripEnds(String str){
        String copy = fstrip(str);
        copy = fstripFront(copy);
        return copy;
    }
}