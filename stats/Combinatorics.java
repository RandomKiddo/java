public class Combinatorics extends Statistics{
    public static double nPr(int n, int r){
        double num = factorial(n);
        double denom = factorial(n-r);
        return num / denom;
    }
    public static double nCr(int n, int r){
        double num = factorial(n);
        double denom = factorial(n-r) * factorial(r);
        return num / denom;
    }
    public static int factorial(int value){
        int total = 1;
        int copy = value;
        while (copy > 0){
            total *= copy;
            copy--;
        }
        return total;
    }
}