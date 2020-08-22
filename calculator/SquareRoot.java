 
import java.util.*;
public class SquareRoot implements Equation{
    private double a, b, c, d;
    private String equation;
    //form a+b√(cx+d)
    public static final String FORMAT = "a+b√(cx+d)";
    public SquareRoot(double aval, double bval, double cval, double dval){
        a = aval;
        b = bval; 
        c = cval;
        d = dval;
        createEquation();
    }
    public void createEquation(){
        String eq = "";
        if (a != 0){
            eq += a;
            if (b > 0){ eq += " + "; }
            else { eq += " - "; }
        }
        if (b == 1){
            eq += "√";
        } else if (b == -1){
            eq += "√";
        } else if (b > 0){
            eq += b + "√";
        } else {
            eq += (-1 * b) + "√";
        }
        if (c == 1){
            eq += "x";
        } else if (c == -1){
            eq += "-x";
        } else {
            eq += c + "x";
        }
        if (d < 0){
            eq += " - " + (-1 * d); 
        } else if (d > 0){
            eq += " + " + d;
        }
        equation = eq;
    }
    public double getA(){ return a; }
    public double getB(){ return b; }
    public double getC(){ return c; }
    public double getD(){ return d; }
    public String toString(){ return equation; }
    public boolean equals(Equation other){
        if (this.toString().equals(other.toString())){
            return true;
        }
        return false;
    }
    public List<Point> getRoots(){
        double value = (-1 * a) / b;
        value *= value;
        value -= d;
        value /= c;
        //1 + 1√x-1
        List<Point> roots = new ArrayList<>();
        if (value + d < 0){ roots.add(null); return roots; }
        roots.add(new Point(value, 0));
        return roots;
    }
    public double getValue(double x){
        double sqrt = Math.sqrt(c * x + d);
        sqrt *= b;
        sqrt += a;
        return sqrt;
    }
}