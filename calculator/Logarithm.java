 
import java.util.*;
public class Logarithm implements Equation{
    private double a,b,c,d,e;
    private String equation;
    //alogb(cx+d)+e
    public static final String FORMAT = "alogb(cx+d)+e";
    public Logarithm(double aval, double bval, double cval, double dval, double eval){
        a = aval;
        b = bval;
        c = cval;
        d = dval;
        e = eval;
        createEquation();
    }
    public double getA(){ return a; }
    public double getB(){ return b; }
    public double getC(){ return c; }
    public double getD(){ return d; }
    public double getE(){ return e; }
    public void createEquation(){
        String eq = "";
        if (a == 1){
            eq += "l";
        } else if (a == -1){
            eq += "-l";
        } else {
            eq += a + "l";
        }
        if (b == 10){
            eq += "og(";
        } else if (b == Math.E){
            eq += "n(";
        } else {
            eq += "og" + b + "(";
        }
        if (c == 1){
            eq += "x";
        } else if (c == -1){
            eq += "-x";
        } else {
            eq += b + "x";
        }
        if (d > 0){
            eq += "+" + d;
        } else if (d < 0){
            eq += d;
        }
        eq += ")";
        if (e > 0){
            eq += "+" + e;
        } else if (e < 0){
            eq += e;
        }
        equation = eq;
    }
    public String toString(){ return equation; }
    public boolean equals(Equation other){
        if (this.toString().equals(other.toString())){
            return true;
        }
        return false;
    }
    public double getValue(double x){
        Calculator calc = new Calculator();
        double value = c * x + d;
        value = calc.log(b, value);
        value *= a;
        value += e;
        return value;
    }
    public List<Point> getRoots(){
        List<Point> roots = new ArrayList<Point>();
        //alogb(cx+d)+e
        double value = -1 * e / a;
        value = Math.pow(b,value);
        value -= d;
        value /= c;
        roots.add(new Point(value,0));
        return roots;
    }
}