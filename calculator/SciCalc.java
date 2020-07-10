 
//import StringExtender.Subtract;
import java.util.*;
public abstract class SciCalc implements Calculations{
    public ArrayList<Store> stored;
    public Double ans;
    public SciCalc(){
        stored = new ArrayList<Store>();
    }
    public void toAns(double amount){ ans = amount; }
    public double ans(){ return ans; }
    public double sin(double amount){ toAns(Math.sin(amount)); return Math.sin(amount); }
    public double cos(double amount){ toAns(Math.cos(amount)); return Math.cos(amount); }
    public double tan(double amount){ toAns(Math.tan(amount)); return Math.tan(amount); }
    public double csc(double amount){ toAns(1.0 / Math.sin(amount)); return 1.0 / Math.sin(amount); }
    public double sec(double amount){ toAns(1.0 / Math.cos(amount)); return 1.0 / Math.cos(amount); }
    public double cot(double amount){ toAns(1.0 / Math.tan(amount)); return 1.0 / Math.tan(amount); }
    public double arcsin(double amount){ toAns(Math.asin(amount)); return Math.asin(amount); }
    public double arccos(double amount){ toAns(Math.acos(amount)); return Math.acos(amount); }
    public double arctan(double amount){ toAns(Math.atan(amount)); return Math.atan(amount); }
    public double arccsc(double amount){ toAns(1.0 / Math.asin(amount)); return 1.0 / Math.asin(amount); }
    public double arcsec(double amount){ toAns(1.0 / Math.acos(amount)); return 1.0 / Math.acos(amount); }
    public double arccot(double amount){ toAns(1.0 / Math.atan(amount)); return 1.0 / Math.atan(amount); }
    public double ln(double amount){ toAns(Math.log(amount)); return Math.log(amount); }
    public double log(double base, double amount){
        double top = Math.log(amount);
        double bottom = Math.log(base);
        double ans = top / bottom;
        toAns(ans);
        return ans;
    }
    public double log(double amount){
        double top = Math.log(amount);
        double bottom = Math.log(10);
        double ans = top / bottom;
        toAns(ans);
        return ans;
    }
    public void store(double amount, char identifier){
        Store toStore = new Store(amount, identifier);
        if (stored.size() == 0){
            stored.add(toStore);
            return;
        }
        for (int a = 0; a < stored.size(); a++){
            if (toStore.equals(stored.get(a))){
                stored.get(a).updateAmount(amount);
                return;
            }
        }
        for (int b = 0; b < stored.size(); b++){
            if (toStore.compareTo(stored.get(b)) < 0){
                stored.add(b, toStore);
                return;
            }
        }
        stored.add(toStore);
    }
    public double recall(char identifier){
        identifier = Character.toUpperCase(identifier);
        for (Store store : stored){
            if (store.getIdentifier() == identifier){
                return store.getAmount();
            }
        }
        return 0.0;
    }
    public double getPi(){ return Math.PI; }
    public double getE(){ return Math.E; }
    public double squared(double amount){ toAns(Math.pow(amount,2)); return Math.pow(amount,2); }
    public double exponent(double amount, double exponent){ toAns(Math.pow(amount,exponent)); return Math.pow(amount,exponent); }
    public double squareRoot(double amount){ toAns(Math.sqrt(amount)); return Math.sqrt(amount); }
    public double nthRoot(double amount, double n){
        return Math.pow(amount,1/n);
    }
    public String toPercent(double amount){ 
        double increased = amount * 100;
        String str = (Math.round(increased*100) / 100.0) + "%";
        toAns(increased);
        return str;
    }
    public double fromPercent(String percent){ 
        String noSym = Subtract.subtract(percent,'%');
        double as = Double.parseDouble(noSym);
        toAns(as/100.0);
        return as/100.0;
    }
    public ArrayList<Store> getStoreList(){ return stored; }
    public double tenToTheNth(double n){ toAns(Math.pow(10,n)); return Math.pow(10,n); }
    public double eToTheNth(double n){ toAns(Math.pow(getE(),n)); return Math.pow(getE(), n); }
    public double inverseExponent(double amount){ toAns(1.0 / amount); return 1.0 / amount; }
    public double inverseExponent(double amount, double n){ toAns(1.0 / (Math.pow(amount,n))); return 1.0 / (Math.pow(amount,n)); }
    public double toRadians(double measure){ toAns(Math.toRadians(measure)); return Math.toRadians(measure); }
    public double toDegrees(double measure){ toAns(Math.toDegrees(measure)); return Math.toDegrees(measure); }
    public void clearMemory(){ ans = null; stored = null; stored = new ArrayList<Store>(); }
}
class Store{
    double amt;
    char id;
    public Store(double amount, char identifier){
        amt = amount; id = Character.toUpperCase(identifier);
    }
    public double getAmount(){ return amt; }
    public char getIdentifier(){ return id; }
    public boolean equals(Store isEqual){
        if (isEqual.getIdentifier() == this.getIdentifier()){
            return true;
        }
        return false;
    }
    public void updateAmount(double to){ amt = to; }
    public String toString(){ return id + " " + amt; }
    public int compareTo(Store toCompare){
        String scan = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int thisIndex = scan.indexOf(this.getIdentifier());
        int compareIndex = scan.indexOf(toCompare.getIdentifier());
        if (thisIndex < compareIndex){
            return -1;
        } else if (thisIndex == compareIndex){
            return 0;
        } else {
            return 1;
        }
    }
}
class Scientific{
    private double originalNumber;
    private double scientificNumber;
    private int exponent;
    public Scientific(double number){
        originalNumber = number;
        toSci(number);
    }
    public void toSci(double number){ //to be implemented
        ArrayList asList = new ArrayList<>();
        String asString = "" + number;
        for (int a = 0; a < asString.length(); a++){
            asList.add(asString.charAt(a));
        }
        //Implementation Continues {ChangeLog}
    }
    public double getOriginal(){ return originalNumber; }
    public double getScientific(){ return scientificNumber; }
    public int getExponent(){ return exponent; }
    public String toString(){
        String tos = scientificNumber + "x10^" + exponent;
        return tos;
    }
}