 
import java.util.*;
public class Exponential implements Equation{
    private double a, b, c, d, e;
    private String equation;
    //a(b)^(cx+d)+e
    public static final String FORMAT = "a(b)^[cx+d]+e";
    public Exponential(double aval, double bval, double cval, double dval, double eval){
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
            eq += "(";
        } else if (a == -1){
            eq += "-(";
        } else {
            eq += a + "(";
        }
        eq += b + ")^";
        if (c == 1){
            eq += "[x";
        } else if (c == -1){
            eq +="[-x";
        } else {
            eq += "[" + c + "x";
        }
        if (d == 0){
            eq += "]";
        } else if (d > 0){
            eq += "+" + d;
        } else {
            eq += d;
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
    public double getValue(double x){
        return a * Math.pow(b,c * x + d) + e;
    }
    public List<Point> getRoots(){
        List<Point> roots = new ArrayList<>();
        double value = -1 * e;
        value /= a;
        //a(b)^[cx+d]+e
        //logb(e/a) = cx + d
        //[logb(e/a)-d]/c = x
        double log = Math.log(e/a) / Math.log(b);
        log -= d;
        log /= c;
        roots.add(new Point(log, 0));
        return roots;
    }
}