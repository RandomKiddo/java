 

import java.util.ArrayList;
public class Calculator extends SciCalc{
    /**
     * creates a calculator instance
     */
    public Calculator(){
        super();
    }
    /**
     * sets @amount to ans field
     */
    public void toAns(double amount){ super.toAns(amount); }
    /**
     * accesses ans field
     */
    public double ans(){ return super.ans(); }
    /**
     * gets sine value of @amount
     */
    public double sin(double amount){ return super.sin(amount); }
    /**
     * gets cosine value of @amount
     */
    public double cos(double amount){ return super.cos(amount); }
    /**
     * gets tangent value of @amount
     */
    public double tan(double amount){ return super.tan(amount); }
    /**
     * gets cosecant value of @amount
     */
    public double csc(double amount){ return super.csc(amount); }
    /**
     * gets secant value of @amount
     */
    public double sec(double amount){ return super.sec(amount); }
    /**
     * gets cotangent value of @amount
     */
    public double cot(double amount){ return super.cot(amount); }
    /**
     * gets arcsine value of @amount
     */
    public double arcsin(double amount){ return super.arcsin(amount); }
    /**
     * gets arccosine value of @amount
     */
    public double arccos(double amount){ return super.arccos(amount); }
    /**
     * gets arctangent value of @amount
     */
    public double arctan(double amount){ return super.arctan(amount); }
    /**
     * gets arccosecant value of @amount
     */
    public double arccsc(double amount){ return super.arccsc(amount); }
    /**
     * gets arcsecant value of @amount
     */
    public double arcsec(double amount){ return super.arcsec(amount); }
    /**
     * gets arccotangent value of @amount
     */
    public double arccot(double amount){ return super.arccot(amount); }
    /**
     * gets natural log value of @amount
     */
    public double ln(double amount){ return super.ln(amount); }
    /**
     * gets log base @base value of @amount
     */
    public double log(double base, double amount){ return super.log(base,amount); }
    /**
     * gets common log value of @amount
     */
    public double log(double amount){ return super.log(amount); }
    /**
     * stores @amount to char @identifier
     */
    public void store(double amount, char identifier){ super.store(amount,identifier); }
    /**
     * recalls value of char @identifier
     */
    public double recall(char identifier){ return super.recall(identifier); }
    /**
     * gets value of pi
     */
    public double getPi(){ return super.getPi(); }
    /**
     * gets value of e
     */
    public double getE(){ return super.getE(); }
    /**
     * squares @amount
     */
    public double squared(double amount){ return super.squared(amount); }
    /**
     * gets value of @amount to the @exponent
     */
    public double exponent(double amount, double exponent){ return super.exponent(amount,exponent); }
    /**
     * gets square root value of @amount
     */
    public double squareRoot(double amount){ return super.squareRoot(amount); }
    /**
     * gets the @n root of @amount
     */
    public double nthRoot(double amount, double n){ return super.nthRoot(amount,n); }
    /**
     * returns string of @amount in percent form
     */
    public String toPercent(double amount){ return super.toPercent(amount); }
    /**
     * returns double value of string @percent
     */
    public double fromPercent(String percent){ return super.fromPercent(percent); }
    /**
     * returns list of char identifiers and their respective values
     */
    public ArrayList<Store> getStoreList(){ return super.getStoreList(); }
    /**
     * gets value of 10 to the power of @n
     */
    public double tenToTheNth(double n){ return super.tenToTheNth(n); }
    /**
     * gets value of e to the power of @n
     */
    public double eToTheNth(double n){ return super.eToTheNth(n); }
    /**
     * returns @amount to the power of -1
     */
    public double inverseExponent(double amount){ return super.inverseExponent(amount); }
    /**
     * returns @amount to the power of -@n
     */
    public double inverseExponent(double amount, double n){ return super.inverseExponent(amount, n); }
    /**
     * returns @measure in radians
     */
    public double toRadians(double measure){ return super.toRadians(measure); }
    /**
     * returns @measure in degrees
     */
    public double toDegrees(double measure){ return super.toDegrees(measure); }
    /**
     * clears all information like store list and ans
     */
    public void clearMemory(){ super.clearMemory(); }
}