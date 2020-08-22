 
import java.util.*;
public class Quadratic implements Equation{
    private String equation;
    private double a, b, c;
    public static final String FORMAT = "ax^2+bx+c";
    public Quadratic(double f, double s, double t){
        a = f;
        b = s;
        c = t;
        createEquation();
    }
    public void createEquation(){
        String eq = "";
        if (a != 0){
            if (a == 1){
                eq += "x^2";
            } else if (a == -1){
                eq += "-x^2";
            } else {
                eq += a + "x^2";
            }
        }
        if (b != 0){
            if (b == 1){
                eq += "+x";
            } else if (b == -1){
                eq += "-x";
            } else {
                if (b > 0){
                    eq += "+" + b + "x";
                } else {
                    eq += b + "x";
                }
            }
        }
        if (c != 0){
            if (c > 0){
                eq += "+" + c;
            } else {
                eq += c;
            }
        }
        equation = eq;
    }
    public String toString(){ return this.equation; }
    public double getA(){ return a; }
    public double getB(){ return b; }
    public double getC(){ return c; }
    public List<Point> getRoots(){
        List<Point> roots = new ArrayList<Point>();
        double rootOne, rootTwo;
        rootOne = 1 * b; 
        rootTwo = -1 * b;
        double dis = Math.pow(b,2) - (4 * a * c);
        if (dis < 0){
            return null;
        }
        rootOne += Math.sqrt(dis);
        rootTwo -= Math.sqrt(dis);
        rootOne /= (2 * a);
        rootTwo /= (2 * a);
        roots.add(new Point(rootOne, 0));
        roots.add(new Point(rootTwo, 0));
        return roots;
    }
    public boolean equals(Equation to){
        if (this.toString().equals(to.toString())){
            return true;
        }
        return false;
    }
    public double getValue(double x){
        return (a * x * x) + (b * x) + c;
    }
}