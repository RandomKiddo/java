 
import java.util.*;
public class AbsoluteValue implements Equation{
    private double a, b, c, d;
    private String equation;
    //Constructor Form a|bx+c|+d
    public static final String FORMAT = "a|bx+c|+d";
    public AbsoluteValue(double aval, double bval, double cval, double dval){
        a = aval; b = bval; c = cval; d = dval;
        createEquation();
    }
    public void createEquation(){
        String eq = "";
        if (a == 1){
            eq += "|";
        } else if (a == -1){
            eq += "-|";
        } else if (a != 0){
            eq += a + "|";
        } else {
            eq += "|";
        }
        if (b == 1){
            eq += "x";
        } else if (b == -1){
            eq += "-x";
        } else if (b != 0){
            eq += b + "x";
        } else {
            eq += "x";
        }
        if (c < 0){
            eq += c + "|";
        } else if (c > 0){
            eq += "+" + c + "|";
        } else {
            eq += "|";
        }
        if (d < 0){
            eq += d;
        } else if (d > 0){
            eq += "+" + d;
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
        List<Point> roots = new ArrayList<Point>();
        double moved = (-1 * d) / a;
        //|bx+c| = moved bx+c = moved && bx+c = -moved
        double rootOne = (moved - c) / b;
        double rootTwo = ((-1 * moved) - c) / b;
        if ((a > 0 && d > 0) || (a < 0 && d < 0)){ roots.add(null); roots.add(null); return roots; }
        roots.add(new Point(rootOne, 0));
        roots.add(new Point(rootTwo, 0));
        return roots;
    }
    public double getValue(double x){
        return a * Math.abs(b * x + c) + d;
    }
}