 
import java.util.*;
public class Linear implements Equation{
    private String equation;
    private double a, b;
    public static final String FORMAT = "ax+b";
    public Linear(double f, double s){
        a = f;
        b = s;
        createEquation();
    }
    public void createEquation(){
        String eq = "";
        if (!(this.a == 0)){
            if (this.a == 1){
                eq += "x";
            } else if (this.a == -1){
                eq += "-x";
            } else {
                eq += this.a + "x";
            }
        }
        if (!(this.b == 0)){
            if (this.b > 0){
                eq += "+" + this.b;
            } else {
                eq += this.b;
            }
        }
        if (eq.equals("")){
            eq = "0";
        }
        equation = eq;
    }
    public String toString(){ return this.equation; }
    public double getA(){ return a; }
    public double getB(){ return b; }
    public List<Point> getRoots(){
        double side = -1 * this.b;
        List<Point> roots = new ArrayList<Point>();
        double root = (double)side / (double)this.a;
        roots.add(new Point(root, 0));
        return roots;
    }
    public boolean equals(Equation to){
        if (this.toString().equals(to.toString())){
            return true;
        }
        return false;
    }
    public double getValue(double x){
        return a * x + b;
    }
}