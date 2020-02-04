class Test {
    public static void main (String [] args) {
        Fraction a = new Fraction();
        System.out.println("Default " + a);    

        Fraction aCopy = new Fraction(a);
        System.out.println("Copy constructor (default) " + aCopy);

        Fraction b = new Fraction(4, 6);
        System.out.println("2 parameters " + b);

        Fraction c = new Fraction("4/6");
        System.out.println("String parameter " + c);

        System.out.println("Num, Den " + c.getNum() + ", " + c.getDenom() ); 

        System.out.println("ToString " + c.toString() ); 

        System.out.println("ToDouble " + c.toDouble() );

        a.setNum(2);
        a.setDen(3);
        System.out.println("Set Num, Den: " + a);

        System.out.println("Multiply: " + c.multiply(a, b));
        System.out.println("Divide: " + c.multiply(a, b));

        System.out.println("Add: " + a.add(a, b));
        System.out.println("Subtract: " + a.add(a, b)); 

    }
}