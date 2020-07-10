 

import java.util.*;
public interface Calculations{
    double sin(double measure);
    double cos(double measure);
    double tan(double measure);
    double csc(double measure);
    double sec(double measure);
    double cot(double measure);
    double log(double base, double amount);
    double log(double amount);
    double ln(double amount);
    void store(double amount, char identifier);
    double recall(char identifier);
    double arcsin(double amount);
    double arccos(double amount);
    double arctan(double amount);
    double arccsc(double amount);
    double arcsec(double amount);
    double arccot(double amount);
    double getPi();
    double getE();
    double squared(double amount);
    double exponent(double amount, double exponent);
    double squareRoot(double amount);
    double nthRoot(double amount, double n);
    String toPercent(double amount);
    double fromPercent(String percent);
    ArrayList<Store> getStoreList();
    double tenToTheNth(double n);
    double eToTheNth(double n);
    double inverseExponent(double amount);
    double inverseExponent(double amount, double n);
    double toRadians(double measure);
    double toDegrees(double measure);
    void clearMemory();
}