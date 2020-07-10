 
public class Point{
    private double x, y;
    public Point(){ x = 0; y = 0; }
    public Point(int xc, int yc){ x = xc; y = yc; }
    public Point(double xc, double yc){ x = xc; y = yc; }
    public double getX(){ return x; }
    public double getY(){ return y; }
    public int getXInt(){ return (int)x; }
    public int getYInt(){ return (int)y; }
    public String toString(){
        return "(" + round(x) + ", " + round(y) + ")";
    }
    public double round(double val){
        return Math.round(val * 10.0) / 10.0;
    }
    public double round(double val, double amount){
        return Math.round(val * amount) / amount;
    }
    public double round(double val, int amount){
        return Math.round(val * (double)amount) / (double)amount;
    }
}