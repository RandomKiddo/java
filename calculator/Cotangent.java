 
import java.util.*;
public class Cotangent implements Equation{
    private double a,b,c,d,e;
    private String equation;
    //acot(b(cx+d))+e
    public static final String FORMAT = "acot(b(cx+d))+e";
    public Cotangent(double aval, double bval, double cval, double dval, double eval){
        a = aval;
        b = bval;
        c = cval;
        d = dval;
        e = eval;
        createEquation();
    }
    public void createEquation(){
        String eq = "";
        if (a == 1){
            eq += "cot(";
        } else if (a == -1){
            eq += "-cot(";
        } else {
            eq += a + "cot(";
        }
        if (b == 1){
            eq += "";
        } else if (b == -1){
            eq += "-(";
        } else {
            eq += b + "(";
        }
        if (c == 1){
            eq += "x";
        } else if (c == -1){
            eq += "-x";
        } else {
            eq += c + "x";
        }
        if (d > 0){
            eq += "+" + d;
        } else if (d < 0){
            eq += d;
        }
        if (c == 1){
            eq += ")";
        } else {
            eq += "))";
        }
        if (e > 0){
            eq += "+" + e;
        } else if (e < 0){
            eq += e;
        }
        equation = eq;
    }
    public double getA(){ return a; }
    public double getB(){ return b; }
    public double getC(){ return c; }
    public double getD(){ return d; }
    public double getE(){ return e; }
    public String toString(){ return equation; }
    public boolean equals(Equation other){ return this.toString().equals(other.toString()); }
    public List<Point> getRoots(){ return null; }
    public double getValue(double x){
        Calculator calc = new Calculator();
        double value = calc.cot(b * (c * x + d));
        value *= a;
        value += e;
        return value;
    }
}