public class Fraction implements Comparable<Fraction>{
    private int num, denom;
    public Fraction(){
        num = 1;
        denom = 1;
    }
    public Fraction(int d){
        num = 1;
        denom = d;
    }
    public Fraction(int n, int d){
        num = n;
        denom = d;
    }
    public Fraction(Fraction f){
        this.num = f.num;
        this.denom = f.denom; 
    }
    public Fraction(MixedNumber m){
        Fraction temp = m.toFraction();
        num = temp.getNum();
        denom = temp.getDenom();
    }
    public void simplify(){
        for (int a = 1; a <= this.denom; a++){
            if (this.num % a == 0 && this.denom % a == 0){
                this.num /= a;
                this.denom /= a;
            }
        }
    }
    public double toDouble(){ return (double)this.num / (double)this.denom; }
    public int toInt(){ return this.num / this.denom; }
    public String toString(){ return num + "/" + denom; }
    public boolean equals(Fraction other){
        if (this.num == other.num && this.denom == other.denom){
            return true;
        } else if(this.toDouble() == other.toDouble()){
            return true;
        }
        return false;
    }
    public int compareTo(Fraction other){ return this.toInt() - other.toInt(); }
    public boolean equals(MixedNumber other){
        if (this.equals(other.toFraction())){
            return true;
        }
        return false;
    }
    public int compareTo(MixedNumber other){ return this.compareTo(other.toFraction()); }
    public MixedNumber toMixedNumber(){
        int coeff = 0;
        int copy = this.num;
        while (copy > this.denom){
            copy -= this.denom;
            coeff++;
        }
        if (coeff == 0){
            return new MixedNumber(new Fraction(this.num, this.denom));
        }
        if (copy == this.denom){
            return new MixedNumber(coeff+1);
        }
        return new MixedNumber(coeff, copy, this.denom);
    }
    public int getNum(){ return num; }
    public int getDenom(){ return denom; }
}