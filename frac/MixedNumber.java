public class MixedNumber implements Comparable<MixedNumber>{
    private int coeff, num, denom;
    private Fraction frac;
    public MixedNumber(){
        coeff = 1; num = 1; denom = 1;
        frac = new Fraction();
    }
    public MixedNumber(int c){
        coeff = c; num = 1; denom = 1;
        frac = new Fraction();
    }
    public MixedNumber(int c, int d){
        coeff = c; num = 1; denom = d;
        frac = new Fraction(d);
    }
    public MixedNumber(int c, int n, int d){
        coeff = c; num = n; denom = d;
        frac = new Fraction(n,d);
    }
    public MixedNumber(Fraction f){
        coeff = 1; num = f.getNum(); denom = f.getDenom();
        frac = f;
    }
    public MixedNumber(int c, Fraction f){
        coeff = c; num = f.getNum(); denom = f.getDenom();
        frac = f;
    }
    public void simplify(){
        for (int a = 1; a <= this.denom; a++){
            if (this.num % a == 0 && this.denom % a == 0){
                this.num /= a;
                this.denom /= a;
            }
        }
        frac = new Fraction(this.num, this.denom);
    }
    public double toDouble(){ return (double)((this.coeff * this.denom) + this.num) / (double)this.denom; }
    public int toInt(){ return ((this.coeff * this.denom) + this.num) / this.denom; }
    public String toString(){ return this.coeff + " " + this.num + "/" + this.denom; }
    public boolean equals(MixedNumber other){
        if (this.coeff == other.coeff && this.num == other.num && this.denom == other.denom){
            return true;
        } else if (this.toDouble() == other.toDouble()){
            return true;
        }
        return false;
    }
    public int compareTo(MixedNumber other){ return this.toInt() - other.toInt(); }
    public boolean equals(Fraction other){
        if(this.equals(other.toMixedNumber())){
            return true;
        }
        return false;
    }
    public int compareTo(Fraction other){ return this.compareTo(other.toMixedNumber()); }
    public Fraction toFraction(){ return new Fraction(((this.coeff * this.denom) + this.num), this.denom); }
    public int getNum(){ return num; }
    public int getDenom(){ return denom; }
    public int getCoeff(){ return coeff; }
    public Fraction getSideFraction(){ return frac; }
}