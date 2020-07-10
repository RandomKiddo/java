 
import java.util.*;
public class Reciprocal implements Equation{
    private double a,b,c,d;
    private String equation;
    //[a/(bx+c)]+d
    public static final String FORMAT = "[a/(bx+c)]+d";
    public Reciprocal(double aval, double bval, double cval, double dval){
        a = aval;
        b = bval;
        c = cval;
        d = dval;
        createEquation();
    }
    public void createEquation(){
        String eq = "[" + a + "/(";
        if (b == 1){
            eq += "x";
        } else if (b == -1){
            eq += "-x";
        } else {
            eq += b + "x";
        }
        if (c == 0){
            eq += ")";
        } else if (c > 0){
            eq += "+" + c + ")";
        } else {
            eq += c + ")";
        }
        eq += "]";
        if (d > 0){
            eq += "+" + d;
        } else if (d < 0){
            eq += d;
        }
        equation = eq;
    }
    public double getA(){ return a; }
    public double getB(){ return b; }
    public double getC(){ return c; }
    public double getD(){ return d; }
    public String toString(){ return equation; }
    public boolean equals(Equation other){ return this.toString().equals(other.toString()); }
    public double getValue(double x){
        return a / (b * x + c) + d;
    }
    public List<Point> getRoots(){
        return null;
    }
}