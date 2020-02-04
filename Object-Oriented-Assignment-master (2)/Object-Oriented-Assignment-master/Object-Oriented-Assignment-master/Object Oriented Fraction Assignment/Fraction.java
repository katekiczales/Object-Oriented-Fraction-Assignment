class Fraction {

    private int num, den;
    public static void main ( String [] args ) {
    }

    public Fraction() { //default constructor
        this.num = 1;
        this.den = 1;

    }

    public Fraction(int num, int den) {
        this.num = num;
        if ( den == 0 ) {
            System.out.println("Error - divided by zero");
            den = 1;
        }// else {
        this.den = den;
        //}

    }

    public Fraction(String fraction) {
        int slashIndex = fraction.indexOf("/");
        String n = fraction.substring(0, slashIndex);
        String d = fraction.substring(slashIndex + 1);
        this.num = Integer.parseInt(n);
        if ( d.equals("0") ) {
            System.out.println("Error - divided by zero");
            d = "1";
        } //else {
        this.den = Integer.parseInt(d);
        // }
    }

    public Fraction(Fraction f) { //copy constructor
        this.num = f.num;         //already protected from den 0 b/c
        this.den = f.den;       
    }

    public int getNum() {
        return this.num;
    }

    public int getDenom() {
        return this.den;
    }

    public String toString() {
        String a = "" + this.num;
        String b = "" + this. den;
        String result = a + "/" + b;
        return result;
    }

    public Double toDouble() {
        double n = this.num;
        double d = this.den;
        return n/d;
    }

    private Integer greatestCF(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        while ( max != min ) {
            int temp = max - min;
            max = Math.max(temp, min);
            min = Math.min(temp, min);
        }
        return max;
    }

    public void reduce(Fraction a) { 
        int gcf = greatestCF(a.num, a.den);
        a.num = a.num/gcf;
        a.den = a.den/gcf;
    }

    public void setNum(int a) {
        this.num = a;
        this.reduce(this);
    }

    public void setDen(int a) {
        this.den = a;
        this.reduce(this);
    }

    public static Fraction multiply(Fraction a, Fraction b) { 
        int n = a.num * b.num; 
        int d = a.den * b.den;
        Fraction c = new Fraction(n, d);
        c.reduce(c);
        return c;
    }

    public static Fraction divide(Fraction a, Fraction b) { //a is divided by b
        int n = a.num * b.den;                          
        int d = a.den * b.num;
        Fraction c = new Fraction(n, d);
        c.reduce(c);
        return c;
    }

    public static Fraction add(Fraction a, Fraction b) { 
        int aNum = a.num * b.den;
        int aDen = a.den * b.den;
        int bNum = b.num * a.den;
        int bDen = b.den * a.den;
        Fraction c = new Fraction(aNum + bNum, aDen);
        c.reduce(c);
        return c;
    }

    public static Fraction subtract(Fraction a, Fraction b) { 
        int aNum = a.num * b.den;
        int aDen = a.den * b.den;
        int bNum = b.num * a.den;
        int bDen = b.den * a.den;
        Fraction c = new Fraction(aNum - bNum, aDen);
        c.reduce(c);
        return c;
    }

}
