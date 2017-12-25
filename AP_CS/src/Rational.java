public class Rational {
    private int numerator;
    private int denominator;
    public Rational(){
        this.numerator = 0;
        this.denominator = 1;
    }

    public Rational(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void printRational (){
        System.out.println("The rational number is " + this.numerator + "/" + this.denominator);
    }

    public static void main(String[] args){
        Rational test = new Rational();
        System.out.println(test);
        Rational test1 = new Rational(2,3);
        test1.printRational();
        System.out.println(test1);
        test1.negate();
        System.out.println(test1);
        test1.invert();
        System.out.println(test1);
        System.out.println(test1.toDouble());
        test1.reduce();
        System.out.println(test1);
        Rational test2 = new Rational(100,25);
        test2.reduce();
        System.out.println(test2);
        Rational test3 = new Rational(4,5);
        Rational test4 = new Rational(7,10);
        test3.add(test4);
        System.out.println(test3);
    }

    public String toString () {
        return String.format("%d/%d",numerator,denominator);
    }

    public void negate() {
        this.denominator = -this.denominator;
    }

    public void invert() {
        int storage = this.denominator;
        this.denominator = this.numerator;
        this.numerator = storage;
    }

    public double toDouble() {
        return this.numerator/this.denominator;
    }

    public void reduce (){
        int a = this.numerator, b = this.denominator,r = a % b;
        while (r != 0){
            a = b;
            b = r;
            r = a % b;
        }
        this.numerator = this.numerator / b;
        this.denominator = this.denominator / b;
    }

    public void add (Rational that){
        int storage = this.denominator;
        this.denominator = this.denominator * that.denominator;
        this.numerator = this.numerator * that.denominator;
        that.denominator = storage * that.denominator;
        that.numerator = storage * that.numerator;
        this.numerator += that.numerator;
        this.reduce();
    }
}
